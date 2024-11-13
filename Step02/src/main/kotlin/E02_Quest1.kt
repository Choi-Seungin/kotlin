fun main() {
    /*
    사용자로부터 반지름 값을 입력 받고
    입력받은 반지름 값을 가지고 원 넓이를 출력
     */
    //1.반지름 입력
    print("반지름을 입력하세요 >> ")
    var r = readln().toDouble()
    //var a = 3.14
    var b = (r * r * Math.PI)
    println("원의 넓이는 : " + Math.floor((r * r * Math.PI)*100)/100.0)
    println("원의 넓이는 : " + (r * r * Math.PI))
    println("원의 넓이는 : " + b)

}