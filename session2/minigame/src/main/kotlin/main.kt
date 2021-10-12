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
    } else {
        println("incorrect")
    }
}