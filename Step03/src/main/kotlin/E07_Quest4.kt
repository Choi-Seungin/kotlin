fun main() {

    var mise = (Math.random()*301).toInt()
    println("미세먼지 농도 : $mise")

    if(mise > 150) {
        println("매우 높음")
    }else if(mise > 80) {
        println("높음")
    }else if(mise > 30) {
        println("보통")
    }else if(mise > 15) {
        println("낮음")
    }else {
        println("매우 낮음")
    }
}