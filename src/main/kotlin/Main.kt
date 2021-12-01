fun main(args: Array<String>) {

    val firstTask = FirstTask()
    firstTask.readFile("src/main/kotlin/1dec/input.txt")
    println(firstTask.counter)

    val secondTask = SecondTask()
    secondTask.readFile("src/main/kotlin/1dec/input.txt")
    println(secondTask.counter)
}