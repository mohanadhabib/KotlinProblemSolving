// a program that return the number of digits of a specific number recursively

fun main() {
    println(count(318)) // 3
    println(count(-92563)) // 5
    println(count(4666)) // 4
    println(count(-314890)) // 6
    println(count(654321)) // 6
    println(count(638476)) // 6
}
fun count(num:Int):Int{
    return if(num!=0){
        1 + count(num/10)
    }
    else {
        0
    }
}