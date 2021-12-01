fun main(args: Array<String>) {

   /* val inputStream: InputStream = File("input.txt").inputStream()
    val inputString = inputStream.bufferedReader().use { it.readText() }
    println(inputString)
*/

    val firstTask = FirstTask()

    firstTask.readFile("src/main/kotlin/1dec/input.txt")
    println(firstTask.counter)

}