fun main() {

    var a = (Math.random()*101).toInt()
    println("점수 : $a")

    when(a/5) {
        20, 19 -> println("A+") //95~100
        18 -> println("A") // 90~94
        17 -> println("B+") // 85~89
        16 -> println("B") // 80~84
        15 -> println("C+") // 75~79
        14 -> println("C") // 70~74
        13 -> println("D+") // 65~69
        12 -> println("D") //60~64
        else -> println("F") //1~59

    }
}