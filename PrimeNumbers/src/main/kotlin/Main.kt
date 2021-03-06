import kotlin.math.sqrt

fun isPrime(testNumber:Int):Boolean {
    if(testNumber<2)
        return false
    var prime:Boolean=true
    for(i in 2..sqrt(testNumber.toDouble()).toInt()) {
        if(testNumber%i==0)
            return false
    }
    return true
}

fun writePrimesInInterval(lower:Int, higher:Int) {
    for(i in lower..higher) {
        if(isPrime(i)) {
            println(i)
        }
    }
}

fun main() {
    var number:Int=71
    println("The program writes all primes within an interval to the screen")
    var lower:Int = 100
    var upper:Int = 200
    println(writePrimesInInterval(2,100))
}
