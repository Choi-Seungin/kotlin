fun main() {
    /*
    When
        when은 다른 언어의 switch case 문과 유사한 역할
        조건에 따라 다른 실행문을 실행 할 수 있다.
        다양한 조건을 사용할 수 있다.

    when(값) {
        조건값1 -> 실행문1
        조건값2 -> 실행문2
        ...
        else -> 마지막 실행문
    }
     */

    var a = (Math.random()*10).toInt() + 1
    println("a 값 : $a")
    when(a) {
        in 1..4 -> println("a는 1부터 4까지 입니다.")
        5 -> println("a는 5입니다.")
        10 -> {println("a는 10입니다.")
        }
        else -> println("a는 5도 아니고, 10도 아닙니다.")
    }

}