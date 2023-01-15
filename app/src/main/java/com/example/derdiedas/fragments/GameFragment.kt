package com.example.derdiedas.fragments

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.derdiedas.Constants
import com.example.derdiedas.Question
import com.example.derdiedas.R


class GameFragment : Fragment() {
    private val args: GameFragmentArgs by navArgs()

    private var mQuestionsList: List<Question>?=null
    private var mSelectedOptionPosition:Int =0
    private var mCurrentPosition:Int = 1
    private var mCorrectAnswers :Int = 0
    private lateinit var germanWord: TextView
    private lateinit var englishWord: TextView
    private lateinit var der :Button
    private lateinit var die: Button
    private lateinit var das: Button
    private lateinit var submit: Button
    private lateinit var progressBar : ProgressBar
    private lateinit var progressText : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_game, container, false)
        val myNumber = args.number
        mQuestionsList = Constants.getQuestions(myNumber).shuffled()
        germanWord = view.findViewById(R.id.tv_germanWord)
        englishWord = view.findViewById(R.id.tv_englishWord)
        der=view.findViewById(R.id.btn_der)
        die = view.findViewById(R.id.btn_die)
        das=view.findViewById(R.id.btn_das)
        submit = view.findViewById(R.id.btn_submit)
        progressBar = view.findViewById(R.id.progressBar)
        progressText = view.findViewById(R.id.tv_progress)


        setQuestion()

        der.setOnClickListener{
            selectedOptionView(der,1)
        }
        die.setOnClickListener {
            selectedOptionView(die,2)
        }
        das.setOnClickListener {
            selectedOptionView(das,3)
        }

        submit.setOnClickListener {
            if(mSelectedOptionPosition == 0){
                mCurrentPosition ++

                when{
                    mCurrentPosition <= 10-> {
                        setQuestion()
                    } else ->{
                    // გადავიდეთ ახალ ფრაგმენტზე
                    val action = GameFragmentDirections.actionGameFragmentToFinishFragment(mCorrectAnswers)
                    Navigation.findNavController(view).navigate(action)
                }
                }
            }
            else{
                val question = mQuestionsList!!.get(mCurrentPosition - 1)
                if(question.correctAnswer != mSelectedOptionPosition){

                    when(mSelectedOptionPosition) {
                        1 ->{
                            der.setBackgroundResource(R.drawable.wrong_option_border)
                        }
                        2 ->{
                            die.setBackgroundResource(R.drawable.wrong_option_border)
                        }
                        3 ->{
                            das.setBackgroundResource(R.drawable.wrong_option_border)
                        }
                    }
                }

                else{
                    mCorrectAnswers++
                }

                when(question.correctAnswer) {
                    1 ->{
                        der.setBackgroundResource(R.drawable.correct_option_border)
                    }
                    2 ->{
                        die.setBackgroundResource(R.drawable.correct_option_border)
                    }
                    3 ->{
                        das.setBackgroundResource(R.drawable.correct_option_border)
                    }
                }
                if(mCurrentPosition == 10){
                    submit.text = "FINISH"
                }
                else{
                    submit.text = "NEXT QUESTION"
                }
                mSelectedOptionPosition = 0
            }
        }
        return view
    }

    private fun setQuestion(){
        val question = mQuestionsList!!.get(mCurrentPosition - 1)

        defaultOptionsView()

        if(mCurrentPosition == 10){
            submit.text = "FINISH"
        }
        else{
            submit.text = "SUBMIT"
        }
        progressBar.progress = mCurrentPosition
        progressText.text = "$mCurrentPosition" + "/" + progressBar.max

        germanWord.text = question.GermanWord
        englishWord.text = question.EnglishWord
    }


    // მოუნიშნავი ღილაკი როგორ გამოიყურება
    private fun defaultOptionsView(){
        val options = ArrayList<Button>()
        options.add(0, der)
        options.add(1, die)
        options.add(2, das)

        for(option in options){
            option.setTextColor(Color.parseColor("#4A4A4A"))
            option.typeface = Typeface.DEFAULT
            option.setBackgroundResource(R.drawable.custom_button)
        }
    }

    // მონიშნული ღილაკი როგორ გამოიყურება
    private fun selectedOptionView(bt: Button, selectedOptionNum:Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        bt.setTextColor(Color.parseColor("black"))
        bt.setTypeface(bt.typeface, Typeface.BOLD)
        bt.setBackgroundResource(R.drawable.custom_sellected_button)
    }


    //    წესით action bar უნდა დამალოს
    override fun onResume() {
        super.onResume()
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
    }

    override fun onStop() {
        super.onStop()
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()
    }
}