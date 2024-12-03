fun main() {
    var l: Double
    while (true) {
        try {
            print("Length: ")
            l = readLine()?.toDoubleOrNull() ?: throw NumberFormatException()
            if (l <= 0) {
                println("Please input a number > 0.")
                continue
            }
            break
        } catch (e: NumberFormatException) {
            println("Invalid input. Please enter a valid number.")
        }
    }
    var b: Double
    while (true) {
        try {
            print("Breadth: ")
            b = readLine()?.toDoubleOrNull() ?: throw NumberFormatException()
            if (b <= 0) {
                println("Please input a number > 0.")
                continue
            }
            break
        } catch (e: NumberFormatException) {
            println("Invalid input. Please enter a valid number.")
        }
    }
    val area = l * b
    println("The area of a rectangle with length $l units and breadth $b units is $area unit².")
}
// Run by:
// kotlinc Main.kt -include-runtime -d Main.jar
// java -jar Main.jar