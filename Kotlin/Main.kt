import java.util.Scanner
fun main() {
    val s = Scanner(System.`in`)
    print("Length: ")
    val l = s.nextFloat()
    print("Breadth: ")
    val b = s.nextFloat()
    s.close()
    val a = l*b
    println("Area of rectangle with length $l unit and breadth $b unit is $a unit².")
}
// Run by:
// kotlinc Main.kt -include-runtime -d Main.jar
// java -jar Main.jar