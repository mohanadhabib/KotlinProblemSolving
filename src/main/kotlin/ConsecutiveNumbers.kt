// a program that take an array of integers
// return if this numbers are consecutive or not

fun main(){
    println(cons(arrayOf(5, 1, 4, 3, 2))) // true
    println(cons(arrayOf(5, 1, 4, 3, 2, 8))) // false
    println(cons(arrayOf(5, 6, 7, 8, 9, 9))) // false
}
fun cons(arr:Array<Int>):Boolean{
    arr.sort()
    var flag = false
    for(i:Int in 0..arr.size-2){
        if(arr[i+1]-arr[i] == 1){
            flag = true
        }
        else{
            flag =false
            break
        }
    }
    return flag
}