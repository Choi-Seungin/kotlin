fun main() {

    print("숫자 1 입력 : ")
    var num1 = readln().toInt()
    print("숫자 2 입력 : ")
    var num2 = readln().toInt()
    var sum = 0

    /*if(num1 < num2){
        for(i in num1..num2) {
            sum += i
        }
    }else {
        for (i in num2..num1) {
            sum += i
        }
    }*/
    if(num1 > num2) {
        var temp = num1
        num1 = num2
        num2 = temp
    }
    for(i in num1..num2) {
        sum += i
    }
    println("입력한 숫자 범위의 합 : $sum")
}