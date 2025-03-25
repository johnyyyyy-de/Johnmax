import java.util.Scanner

fun main() {
    var read = Scanner(System. `in`)

    println("enter day(number):")
    var day = read.nextInt()

    var result = when(day){
        1 -> "Monday"
        2 -> "Tueday"
        3 -> "Wednesday"
        4 -> "Thurday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "invalid day of the week"
    }
    println("the day of the week is :")



}