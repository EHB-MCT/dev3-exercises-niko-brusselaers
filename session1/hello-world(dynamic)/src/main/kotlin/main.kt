fun main(){
    val arrayname = arrayOf("anoying Kevser", "High Amina", "sleepy Widad", "talky David", "mustache yoni")
    greet(arrayname)
}

fun greet(names : Array<String>){
    for (names in names) {
        println("hello $names")
    }
}