fun isPrime(testNumber:Int):Boolean {
    var prime:Boolean=true
    for(i in 2..Math.sqrt(testNumber.toDouble()).toInt()) {
        if(testNumber%i==0)
            return false
    }
    return true
}

fun main() {
    var number:Int=71
    println(isPrime(number))
}
