fun main() {
    /*
     Variable (변수) : 값을 저장하는 공간

     변수 선언 방법
        1. var 변수명 = 값 (초기화)
        2. var 변수명 : 자료형 = 값
        3. var 변수명 : 자료형
           변수명 = 값

     변수명 작성 법 - 문법 X
        1. camel case = 첫글자 소문자, 뒤의 단어는 첫글자 대문자(변수명, 함수명)
            ex) studentName
        2. pascal case = 단어의 첫글자를 대문자(클래스명)
            ex) TestVariableName
        3. snake case = 전부 소문자, 단어 사이에 "_"
            ex) student_name

    변수명 작성 규칙 - 문법(중요)
        1. 숫자로 시작할 수 없음. 시작은 알파뱃, _ 만 가능
        2. 특수문자 _ 만 가능
        3. 대소문자 구분함.
        4. 알파뱃, 숫자, _ 조합 사용
        5. 띄어쓰기 안됨
        6. 키워드(예약어)를 일치해서 사용할 수 없음.

     자료형
        - 정수형 : Byte, Short, Int, Long
        - 실수형 : Flout, Double
        - 문자형 : Character
        - 논리형 : Boolean
        - 문자열 : String
    */
    var a = 20
    a = 90 //마지막 저장 값 유지
    println(a)

    /*본인 이름을 저장할 변수 name으로 만들고 나서
    해당 변수에 본인 이름을 저장하고 출력*/
    var name = "최승인"
    println(name)

    /*
    변수 선언 후에 초기화를 안하고 사용하면 에러
    var b : Int
    println(b)
    */
    
    /*var 이름 = "최승인"
    println(이름)
*/
    //정수형 변수 선언, 최대값
    var number1 : Byte = 127
    var number2 : Short = 32767
    var number3 : Int = 2147483647
    var number4 : Long = 9223372036854775807
    var number5 : Byte = Byte.MAX_VALUE
    var number6 : Byte = Byte.MIN_VALUE

    println(number1)
    println(number2)
    println(number3)
    println(number4)
    println(number5)
    println(number6)
}