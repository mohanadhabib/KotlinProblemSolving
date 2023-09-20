import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.tan

// a program to get the second and third side of a 30 , 60 , 90 triangle

fun main(){
    println(otherSides(1F)) // [2.0, 1.7320508]
    println(otherSides(12F)) // [24.0, 20.784609]
    println(otherSides(2F)) // [4.0, 3.4641016]
    println(otherSides(3F)) // [6.0, 5.196152]
}

// secondSide"largest Side" = side / cos (60)
// thirdSide = side * tan (60)

fun otherSides(side:Float):ArrayList<Float>{
    val array = ArrayList<Float>()
    array.add((side / (cos(60*(PI/180)))).toFloat())
    array.add((side * (tan(60*(PI/180)))).toFloat())
    return array
}