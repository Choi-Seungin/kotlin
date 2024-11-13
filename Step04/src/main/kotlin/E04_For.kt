fun main() {

    //1~10까지 출력
    for(i in 1..10) {
        print("$i ")
    }
    println()

    //1~10까지 2씩 증가해서 출력
    for(i in 1..10 step 2) {
        print("$i ")
    }
    println()

    //1~9까지 2씩 증가해서 출력
    for(i in 1 until 10 step 2) {
        print("$i ")
    }
    println()

    for(i in 10 downTo 1){
        print("$i ")
    }
    println()

    for(i in 10 downTo 1 step 2){
        print("$i ")
    }
    println()

    //배열 순회
    var arr = arrayOf(1,5,2,76,32,23,44,23,7,46)

    //데이터를 처음부터 마지막까지 한개씩 가져옴
    for (i in arr) {
        print("$i ")
    }
    println()

    //번호표를 처음부터 마지막까지 한개씩 가져옴
    for(i in arr.indices) {
        print("${arr[i]} ")
    }

    //번호표, 데이터를 같이 가져옴
    for((index, value) in arr.withIndex()) {
        println("arr[$index] = $value")
    }
}