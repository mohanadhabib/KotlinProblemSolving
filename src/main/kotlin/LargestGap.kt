// a program to find the largest gap "subtraction" between two consecutive numbers
// in a given sorted array
// if array not sorted, first sort it ascending , and then get the largest gap

fun main() {
    println(largestGap(arrayOf(9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5))) // 11
    println(largestGap(arrayOf(14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7))) // 4
    println(largestGap(arrayOf(13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9))) // 2
}
fun largestGap(arr:Array<Int>):Int{
    arr.sort()
    var gap = 0
    var temp:Int
    for(i:Int in 0..arr.size-2){
        if(i==0){
            gap = arr[1]-arr[0]
        }else{
            temp = arr[i+1]-arr[i]
            if(temp>gap){
                gap = temp
            }
        }
    }
    return gap
}