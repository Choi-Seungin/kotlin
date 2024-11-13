fun main() {
    /*
    문제
        점수 0~100인 값을 하나 입력 받아서
        아래 데이터 범위를 보고 해당 성적 등급을 출력하시오
        90 ~ 100 : A
        80 ~ 89 : B
        70 ~ 79 : C
        60 ~ 69 : D
        0 ~ 59 : A
     */
    var a = (Math.random()*101).toInt()
    println("점수 : $a")
    when(a) {
        in 90..100 -> println("성적 등급 A")
        in 80..89 -> println("성적 등급 B")
        in 70..79 -> println("성적 등급 C")
        in 60..69 -> println("성적 등급 D")
        else -> println("성적 등급 F")
    }

    when(a/10) {
        10, 9 -> println("등급 A")
        8 -> println("등급 B")
        7 -> println("등급 C")
        6 -> println("등급 D")
        else -> println("등급 F")
    }
}