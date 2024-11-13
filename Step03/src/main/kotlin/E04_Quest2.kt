fun main() {
    print("숫자를 입력하시오 : ")
    var a = readln().toInt()
    print("숫자를 입력하시오 : ")
    var b = readln().toInt()

    /*if(a > b) {
        println(a - b)
    }
    else {
        println(b - a)
    }*/
    var result = a - b
    if(result < 0) {
        result = -result
    }
    println(result)

    /*if(a - b >= 0) {
        println("" + a + " - " + b + " = " + (a - b))
    }
    else{
        println("" + a + " - " + b + " = " + (-(a - b)))
    }*/
}
