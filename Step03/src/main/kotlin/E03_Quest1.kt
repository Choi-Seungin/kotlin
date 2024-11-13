fun main() {
    print("숫자를 입력하시오 : ")
    var num = readln().toInt()

    if(num % 2 == 0){
        println("입력하신 숫자는 짝수입니다.")
    }
    else {
        println("입력하신 숫자는 홀수입니다.")
    }
}