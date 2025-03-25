import java.util.Scanner

fun main() {

    var read = Scanner(System.`in`)
    println("Enter first number:")
    var firstnumber = read.nextInt()

    println("Enter second number:")
    var secondnumber = read.nextInt()

    println("Enter third number:")
    var thirdnumber = read.nextInt()

    if (firstnumber > secondnumber&& firstnumber > thirdnumber){
        println("$firstnumber is greatest")
    }
    else if (secondnumber > firstnumber&& secondnumber > thirdnumber ){
        println("$secondnumber is greatest")
    }
    else{
        println("$thirdnumber is greatest")

    }


}