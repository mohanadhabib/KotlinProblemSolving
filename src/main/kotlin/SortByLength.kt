// a program that take a text then sort the words of this text based on the length of its words
// the word with the lowest number of letters comes first and
// the word with the highest number of letters comes last

fun main() {
    println(sortByLength("Hello my friend")) // my Hello friend
    println(sortByLength("Have a wonderful day")) // a day Have wonderful
    println(sortByLength("My son loves pineapples")) // My son loves pineapples
}
fun sortByLength(txt:String):String{
    val array:MutableList<String> = txt.split(" ").toMutableList()
    var temp:String
    var newTxt = ""
    for(i:Int in 0..<array.size){
        for(j:Int in i+1..<array.size){
            if(array[i].length > array[j].length){
                temp = array[i]
                array[i] = array[j]
                array[j] = temp
            }
        }
    }
    for(i in array){
        newTxt+=" $i"
    }
    return newTxt
}