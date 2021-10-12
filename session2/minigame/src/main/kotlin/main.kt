fun main() {
    println("Made by Niko")
    challengeOne();
}

fun challengeOne(){
    val answer = setOf<String>("flash", "the flash", "barry allen", "savitar")
    println("I'm the fastest man alive")
    println("but I am always late")
    println("I fight for justice")
    println("and yet have stood at the wrong side")
    println(" ")
    println("Who am I ?")
    val input = readLine()

    if (answer.contains(input)){
        println("correct")
        challengeTwo()
    } else {
        println("incorrect")
    }
}

fun challengeTwo(){
    println("guess the dice number")
    println("choose LOW for numbers from 1 to 3")
    println("choose HIGH for numbers from 4 to 6")
    val diceResults = (1..6).random()
    val useranswer = readLine()
    if (useranswer == "LOW" && (1..3).contains(diceResults) ){
        println("winner")
        challengeThree()
    } else if (useranswer == "HIGH" && (4..6).contains(diceResults)){
        println("winner")
        challengeThree()
    } else {
        print("game over")
    }

}

fun challengeThree(){
    println("Barry Allen really misses his mom and wants her back.")
    println("what should he do")
    println("1: he goes back and kills reverse flash before the event.")
    println(" ")
    println("2: he prevents the killing of his mother without murdering.")
    println(" ")
    println("3: he does nothing")
    println(" ")
    var input = readLine()
    if (input == "1"){
        println("killing Eobard Thawne does nothing as a new one appears and defeats him.")
        println("game over")
    } else if (input == "2"){
        println("barry lives peacefully with his parents for a couple of years before he undoes his action")
        println("winner")
    } else if (input == "3"){
        println("filled with guilt, barry falls in to a depression and stops fighting crime altogether")
        println(" ")
        println("! TimeFlash !")
        println(" ")
        challengeTwo()
    }
}