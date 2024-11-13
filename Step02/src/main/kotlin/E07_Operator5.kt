fun main() {
    /*
    논리연산자
    && and : 양쪽의 결과가 모두 true 일 때 true
    || or : 한쪽의 결과가 true면 true
    ! not : true > false, false > true
    */
    var a = true
    var b = false
    println(a && b)
    println(a || b)
    println(!a)
    println(!b)

    println("============")
    var c = 10
    var d = 3
    println(c > 3 && d > 3)
    println(c > 3 || d > 3)
    println(!(c > 3))
    println(!(d > 3))

    println("============")
    var e = 10
    var f = 3

    //단락 회로(Short Circuit)
    var result = e < 3 && ++f > 3
    println(result)
    println(f)

    result = e > 3 || ++f > 3
    println(f)

}