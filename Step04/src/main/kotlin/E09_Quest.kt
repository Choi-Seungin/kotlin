fun main() {
    /*
    1. 숫자를 입력 받기
    2. 입력받은 숫자까지 출력
    3. 출력할 숫자가 입력한 숫자의 약수인지 체크
     */
    print("숫자 입력 : ")
    var a = readln().toInt()
    print("약수 목록 : ")
    for(i in 1..a ) {
        if(a % i == 0) {
            print("$i ")
        }
    }
}