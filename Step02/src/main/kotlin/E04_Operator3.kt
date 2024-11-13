fun main() {
    /*
    증감연산자
    ++ --
    전휘형 ++변수 -> 변수가 속한 연산을 하기 전
    후위형 변수++ -> 변수가 속한 연산을 한 뒤
    1씩 증감
    유일하게 연산 후 결과가 바로 변수에 저장
     */
    var n1 = 10

    println(n1) //10
    println(n1++) //10 후위형
    println(n1) //11

    var n2 = 10

    println(n2) //10
    println(++n2) //11 전위형
    println(n2) //11

    println("=============")

    var n3 = 10
    var n4 = 3
    var result = n3++ * 3 + ++n4 * 2 + n3
    // 10 * 3 + 4 * 2 + 11 = 49
    println(result)


}