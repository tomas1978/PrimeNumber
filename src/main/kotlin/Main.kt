import java.util.Scanner
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
    var counter:Int=0
    for(i in lower..higher) {
        if(isPrime(i)) {
            println(i)
            counter++
        }
    }
    print("Number of primes in interval "+lower+" to "+higher+": "+counter)
}

fun main() {
    var number:Int=71
    println("The program writes all primes within an interval to the screen")
    //var lower:Int = 100
    //var upper:Int = 200
    print("Enter lower limit: ")
    val lowerStr = Scanner(System.`in`)
    var lower:Int = lowerStr.nextInt()
    print("Enter upper limit: ")
    val upperStr = Scanner(System.`in`)
    var upper:Int = upperStr.nextInt()

    println(writePrimesInInterval(lower, upper))
}
