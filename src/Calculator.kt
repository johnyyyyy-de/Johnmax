import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Display the menu
    println("Simple Calculator")
    println("Choose an operation:")
    println("1. Add")
    println("2. Subtract")
    println("3. Multiply")
    println("4. Divide")

    // Read the operation choice
    print("Enter your choice (1/2/3/4): ")
    val choice = scanner.nextInt()

    // Read the numbers
    print("Enter first number: ")
    val num1 = scanner.nextDouble()

    print("Enter second number: ")
    val num2 = scanner.nextDouble()

    // Perform the operation based on the user's choice
    when (choice) {
        1 -> println("Result: ${num1 + num2}")
        2 -> println("Result: ${num1 - num2}")
        3 -> println("Result: ${num1 * num2}")
        4 -> {
            if (num2 != 0.0) {
                println("Result: ${num1 / num2}")
            } else {
                println("Error! Division by zero.")
            }
        }
        else -> println("Invalid choice!")
    }
}
