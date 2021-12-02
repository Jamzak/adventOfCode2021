import kotlin.system.measureNanoTime

fun main() {
    val time = measureNanoTime {
        //println(Task1Day1().readFile("src/main/resources/day1input.txt"))
        //println(Task2Day1().readFile("src/main/resources/day1input.txt"))
        println(SecondDec().readFile("src/main/resources/day2input.txt"))
    }
    println(time / 1_000_000)
}