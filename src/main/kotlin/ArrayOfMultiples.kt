// a program to get all multiples of a number until a specific length
// arrayOfMultiples(here take a number to get multiples , here take the length of the array)
// the function calculate num x (numbers from 1 to the length)

fun main(){
    println(arrayOfMultiples(7, 5)) // [7, 14, 21, 28, 35]
    println(arrayOfMultiples(12, 10)) // [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
    println(arrayOfMultiples(17, 6)) // [17, 34, 51, 68, 85, 102]
}
fun arrayOfMultiples(num:Int,length:Int):ArrayList<Int>{
    val array = ArrayList<Int>()
    for(i:Int in 1..length){
        array.add(num*i)
    }
    return array
}