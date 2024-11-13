fun main() {
    /*
    숫자 하나 입력 받아서
    입력한 숫자가 완전수 인지 아닌지 출력
    완전수 : 자기 자신을 제외한 약수들의 합(자기 자신 제외)이 자기 자신과 동일한 숫자
     */
    //1. 숫자 입력
    print("숫자 입력 : ")
    var a = readln().toInt()
    var b = 0
    //2. 범위 지정
    for(i in 1 until a) {
        //약수를 구한다
        if (a % i == 0) {
            b += i
        }
    }
    if(b == a) {
        println("$a 는(은) 완전수 입니다.")
    }
    else {
        println("$a 는(은) 완전수가 아닙니다.")
    }

}