fun main(args: Array<String>) {

    val firstTask = FirstTask()
    println(firstTask.readFile("src/main/resources/input.txt"))

    val secondTask = SecondTask()
    println(secondTask.readFile("src/main/resources/input.txt"))
}