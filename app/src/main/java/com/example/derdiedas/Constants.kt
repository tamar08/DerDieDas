package com.example.derdiedas

object Constants {
        fun getQuestions(pos:Int):ArrayList<Question>{
            val questionsList = ArrayList<Question>()
            when (pos){
                0-> {
                    val que1 = Question("Dessert", "dessert", 3)
                    questionsList.add(que1)

                    val que2 = Question("Kuchen", "cake", 1)
                    questionsList.add(que2)

                    val que3 = Question("Brot", "bread", 3)
                    questionsList.add(que3)

                    val que4 = Question("Ei", "egg", 3)
                    questionsList.add(que4)

                    val que5 = Question("Mehl", "flour", 3)
                    questionsList.add(que5)

                    val que6 = Question("Zucker", "sugar", 1)
                    questionsList.add(que6)

                    val que7 = Question("Fleisch", "meat", 3)
                    questionsList.add(que7)

                    val que8 = Question("Huhn", "chicken", 3)
                    questionsList.add(que8)

                    val que9 = Question("Salat", "salad", 1)
                    questionsList.add(que9)

                    val que10 = Question("Pizza", "pizza", 2)
                    questionsList.add(que10)

                    val que11 = Question("Schokolade", "chocolate", 2)
                    questionsList.add(que11)

                    val que12 = Question("Obst", "fruit", 3)
                    questionsList.add(que12)

                    val que13 = Question("Gemüse", "vegetable", 3)
                    questionsList.add(que13)

                    val que14 = Question("Käse", "cheese", 1)
                    questionsList.add(que14)

                    val que15 = Question("Wurst", "sausage", 2)
                    questionsList.add(que15)

                    val que16 = Question("Pilz", "mushroom", 1)
                    questionsList.add(que16)
                }
                1 ->{
                    val que1 = Question("Kaffee", "coffee", 1)
                    questionsList.add(que1)

                    val que2 = Question("Tee", "tea", 1)
                    questionsList.add(que2)

                    val que3 = Question("Saft", "juice", 1)
                    questionsList.add(que3)

                    val que4 = Question("Wasser", "water", 3)
                    questionsList.add(que4)

                    val que5 = Question("Wein", "wine", 1)
                    questionsList.add(que5)

                    val que6 = Question("Bier", "beer", 3)
                    questionsList.add(que6)

                    val que7 = Question("Limonade", "lemonade", 2)
                    questionsList.add(que7)

                    val que8 = Question("Milch", "milk", 2)
                    questionsList.add(que8)

                    val que9 = Question("Kakao", "cocoa", 1)
                    questionsList.add(que9)

                    val que10 = Question("Sekt", "sparkling wine", 1)
                    questionsList.add(que10)
                }
                2->{
                    val que1 = Question("Hund","dog",1)
                    questionsList.add(que1)

                    val que2 = Question("Katze","cat",2)
                    questionsList.add(que2)

                    val que3 = Question("Fisch","fish",1)
                    questionsList.add(que3)

                    val que4 = Question("Schlange","snake",2)
                    questionsList.add(que4)

                    val que5 = Question("Vogel","bird",1)
                    questionsList.add(que5)

                    val que6 = Question("Papagei","parrot",1)
                    questionsList.add(que6)

                    val que7 = Question("Maus","mouse",2)
                    questionsList.add(que7)

                    val que8 = Question("Schildkröte","turtle",2)
                    questionsList.add(que8)

                    val que9 = Question("Kuh","cow",2)
                    questionsList.add(que9)

                    val que10 = Question("Schwein","pig",3)
                    questionsList.add(que10)

                    val que11 = Question("Schaf","sheep",3)
                    questionsList.add(que11)

                    val que12 = Question("Pferd","horse",3)
                    questionsList.add(que12)

                    val que13 = Question("Ente","duck",2)
                    questionsList.add(que13)

                    val que14 = Question("Huhn","chicken",3)
                    questionsList.add(que14)

                    val que15 = Question("Biene","bee",2)
                    questionsList.add(que15)

                    val que16 = Question("Bär","bear",1)
                    questionsList.add(que16)

                    val que17 = Question("Wolf","wolf",1)
                    questionsList.add(que17)

                    val que18 = Question("Fledermaus","bat",2)
                    questionsList.add(que18)
                }
                3-> {
                    val que1 = Question("Sonne", "sun", 2)
                    questionsList.add(que1)

                    val que2 = Question("Schnee", "snow", 1)
                    questionsList.add(que2)

                    val que3 = Question("Blitz", "lightning", 1)
                    questionsList.add(que3)

                    val que4 = Question("Regenbogen", "rainbow", 1)
                    questionsList.add(que4)

                    val que5 = Question("Wolke", "cloud", 2)
                    questionsList.add(que5)

                    val que6 = Question("Wind", "wind", 1)
                    questionsList.add(que6)

                    val que7 = Question("Frost", "frost", 1)
                    questionsList.add(que7)

                    val que8 = Question("Regen", "rain", 1)
                    questionsList.add(que8)

                    val que9 = Question("Wetter", "weather", 3)
                    questionsList.add(que9)

                    val que10 = Question("Hagel", "hail", 1)
                    questionsList.add(que10)

                    val que11 = Question("Nebel", "fog", 1)
                    questionsList.add(que11)
                }
                4->{
                    val que1 = Question("Hemd", "shirt", 3)
                    questionsList.add(que1)

                    val que2 = Question("Hose", "pants", 2)
                    questionsList.add(que2)

                    val que3 = Question("Mantel", "coat", 1)
                    questionsList.add(que3)

                    val que4 = Question("Schuhe", "shoes", 2)
                    questionsList.add(que4)

                    val que5 = Question("Unterwäsche", "underwear", 2)
                    questionsList.add(que5)

                    val que6 = Question("Bluse", "blouse", 2)
                    questionsList.add(que6)

                    val que7 = Question("Gürtel", "belt", 1)
                    questionsList.add(que7)

                    val que8 = Question("Hut", "hat", 1)
                    questionsList.add(que8)

                    val que9 = Question("Krawatte", "tie", 2)
                    questionsList.add(que9)

                    val que10 = Question("Kleid", "dress", 3)
                    questionsList.add(que10)
                }
                5->{
                    val que1 = Question("Bett", "bed", 3)
                    questionsList.add(que1)

                    val que2 = Question("Tisch", "table", 1)
                    questionsList.add(que2)

                    val que3 = Question("Tür", "door", 2)
                    questionsList.add(que3)

                    val que4 = Question("Kissen", "pillow", 3)
                    questionsList.add(que4)

                    val que5 = Question("Fenster", "window", 3)
                    questionsList.add(que5)

                    val que6 = Question("Wand", "wall", 2)
                    questionsList.add(que6)

                    val que7 = Question("Boden", "floor", 1)
                    questionsList.add(que7)

                    val que8 = Question("Schlafzimmer", "bedroom", 3)
                    questionsList.add(que8)

                    val que9 = Question("Badezimmer", "bathroom", 3)
                    questionsList.add(que9)

                    val que10 = Question("Küche", "kitchen", 2)
                    questionsList.add(que10)

                    val que11 = Question("Wohnung", "living room", 2)
                    questionsList.add(que11)

                    val que12= Question("Couch", "couch", 2)
                    questionsList.add(que12)

                    val que13 = Question("Stuhl", "chair", 1)
                    questionsList.add(que13)
                }
                6->{
                    val que1 = Question("Körper", "body", 1)
                    questionsList.add(que1)

                    val que2 = Question("Fuß", "foot", 1)
                    questionsList.add(que2)

                    val que3 = Question("Arm", "arm", 1)
                    questionsList.add(que3)

                    val que4 = Question("Hand", "hand", 2)
                    questionsList.add(que4)

                    val que5 = Question("Kopf", "head", 1)
                    questionsList.add(que5)

                    val que6 = Question("Finger", "finger", 1)
                    questionsList.add(que6)

                    val que7 = Question("Nase", "nose", 2)
                    questionsList.add(que7)

                    val que8 = Question("Bein", "leg", 3)
                    questionsList.add(que8)

                    val que9 = Question("Gesicht", "face", 3)
                    questionsList.add(que9)

                    val que10 = Question("Mund", "mouth", 1)
                    questionsList.add(que10)

                    val que11 = Question("Zahn", "tooth", 1)
                    questionsList.add(que11)

                    val que12 = Question("Hals", "throat", 1)
                    questionsList.add(que12)
                }
            }
            return questionsList
        }
}