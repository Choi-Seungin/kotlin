fun main() {

    var a = 0
    for(i in 1..100) {
        a +=i
    }
    println("for문 1~100의 합 : $a")

    println()

    var i = 1
    var sum = 0
    while (i<=100) {
        sum += i
        i++
    }
    println("whlie 문 1~100의 합 : $sum")
}