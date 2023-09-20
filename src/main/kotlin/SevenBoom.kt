// a program that return the string "boom!" if any number of its array contains digit "7"
// otherwise the program return "there is no 7 in the array"

fun main() {
    println(sevenBoom(arrayOf(1, 2, 3, 4, 5, 6, 7))) // Boom!
    println(sevenBoom(arrayOf(8, 6, 33, 100))) // there is no 7 in the array
    println(sevenBoom(arrayOf(2, 55, 60, 97, 86))) // Boom!
}

fun sevenBoom(array:Array<Int>):String{
    var txt = "there is no 7 in the array"
    for (i:Int in array){
        val newTxt = i.toString()
        for(j:Char in newTxt){
            if(j == '7'){
                txt = "Boom!"
                break
            }else{
                continue
            }
        }
    }
    return txt
}