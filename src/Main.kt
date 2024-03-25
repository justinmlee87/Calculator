import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        println("Select an option:")
        println("1. Addition")
        println("2. Subtraction")
        println("3. Multiplication")
        println("4. Division")
        println("5. Exit")

        val choice = scanner.nextInt()

        when (choice) {
            1 -> performOperation("Addition", "+", scanner)
            2 -> performOperation("Subtraction", "-", scanner)
            3 -> performOperation("Multiplication", "*", scanner)
            4 -> performOperation("Division", "/", scanner)
            5 -> {
                println("Exiting the program...")
                return
            }
            else -> println("Invalid choice. Please enter a number between 1 and 5.")
        }
    }
}

fun performOperation(operationName: String, operator: String, scanner: Scanner) {
    println("Enter the first number:")
    val num1 = scanner.nextDouble()

    println("Enter the second number:")
    val num2 = scanner.nextDouble()

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 != 0.0) {
                num1 / num2
            } else {
                println("Error: Division by zero")
                return
            }
        }
        else -> {
            println("Error: Invalid operator")
            return
        }
    }

    println("$operationName Result: $num1 $operator $num2 = $result")
}