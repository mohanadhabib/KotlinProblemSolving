// a program to validate entered pin
// if pin length == 4 or == 6
// and contains digits from 0 to 9
// and not contains any letters or whitespaces it return true otherwise return false

fun main() {
    println(validate("121317")) // true
    println(validate("1234")) // true
    println(validate("45135")) // false
    println(validate("89abc1")) // false
    println(validate("900876")) //true
    println(validate(" 4983")) //false
    println(validate("")) // false
}

fun validate(pin:String):Boolean{
    var flag = false
    if(pin.length == 4 || pin.length == 6){
        for(i:Char in pin){
            flag = when(i){
                '0','1','2','3','4','5','6','7','8','9' -> true
                ' ' -> false
                else -> false
            }
            if(!flag){
                break
            }
        }
    }
    return flag
}