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
    } else if (useranswer == "HIGH" && (4..6).contains(diceResults)){
        println("winner")
    } else {
        print("game over")
    }

}