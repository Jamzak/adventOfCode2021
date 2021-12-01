fun main(args: Array<String>) {

    val firstTask = FirstTask()
    firstTask.readFile("src/main/resources/input.txt")
    println(firstTask.counter)

    val secondTask = SecondTask()
    secondTask.readFile("src/main/resources/input.txt")
    println(secondTask.counter)
}