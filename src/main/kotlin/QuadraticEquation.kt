import kotlin.math.pow

// program to calculate number of real solutions of a quadratic equation

// a x^2 + b x + c = 0 // Quadratic Equation Formula
// b^2 - 4 a c

/*
if > 0 have 2 solutions
if == 0 have 1 solution
if < 0 have 0 solution
*/

fun main() {
    println(solutions(1, 0, -1)) // 2
    println(solutions(1, 0, 0))  // 1
    println(solutions(1, 0, 1))  // 0
}

fun solutions (a:Int,b:Int,c:Int):Int {
    val x : Int = ((b.toDouble().pow(2))-(4*a*c)).toInt()
    val sol :Int = if(x>0){
        2
    }else if(x==0){
        1
    }else{
        0
    }
    return sol
}