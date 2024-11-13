fun main() {

    print("숫자 입력 : ")
    var a = readln().toInt()
    for (i in 1..a ) {
        println("Hello World")
    }
    for (i in 0 until a ) {
        println("Hello World")
    }
    for (i in a downTo 1 ) {
        println("Hello World")
    }
}