fun main() {
    print("숫자 입력 : ")
    var num = readln().toInt() //숫자입력
    var a = 1 //팩토리얼 값 변수 지정

    //1부터 입력한 숫자까지 곱해서 저장
    for(i in 1..num) {
        a *= i
    }
    println("$num 의 팩토리얼 결과 값 : $a") // 결과 출력
}