// a program that take two array of integers that represent a cards numbered from
// 0 to 9 and make all possible combinations to get the largest combination of two digits
// from both arrays and then return true if your cards "first array"
// is greater than the opponent cards "second array"

fun main() {
    println(winRound(arrayOf(2, 5, 2, 6, 9), arrayOf(3, 7, 3, 1, 2))) // true
    println(winRound(arrayOf(2, 5, 2, 6, 9), arrayOf(3, 7, 3, 1, 2))) // true
    println(winRound(arrayOf(1, 2, 3, 4, 5), arrayOf(9, 8, 7, 6, 5))) // true
    println(winRound(arrayOf(4, 3, 4, 4, 5), arrayOf(3, 2, 5, 4, 1))) // true

}
fun winRound(a1:Array<Int>,a2:Array<Int>):Boolean{
    val num1 = calculateLargestNum(a1)
    val num2 = calculateLargestNum(a2)
    return num1>num2
}
fun calculateLargestNum(array:Array<Int>):Int{
    var numTxt = ""
    var num = 0
    var temp:Int
    for(i:Int in 0..<(array.size)){
        for(j:Int in 1..<(array.size)){
            if(array[i]!=array[j]){
                numTxt = array[i].toString() + array[j].toString()
            }
            if(i==0 && j==0){
                num = numTxt.toInt()
            }
            else{
                temp = numTxt.toInt()
                if(temp > num){
                    num = temp
                }
            }
        }
    }
    return num
}