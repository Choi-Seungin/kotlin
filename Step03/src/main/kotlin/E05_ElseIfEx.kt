fun main() {
    /*
    else if
        if(조건식) {
        실행문
        }
        else if(조건식) {
        실행문
        }
        else if(조건식) {
        실행문
        }
        else {
        실행문
        }
    if문이 첫번째 조건식이면, 두번째 조건식부터는 else if를 사용한다.
    else 이후에는 올 수 없다. if문과 else문 사이에 배치
    조건식을 구성할 때 우선순위가 높은 순서부터 배치
     */
    var a = 3

    if(a > 5) {
        println("a는 5보다 큽니다.")
    }else if(a == 5) {
        println("a는 5입니다.")
    }
    else{
        println("a는 5보다 작습니다.")
    }
}