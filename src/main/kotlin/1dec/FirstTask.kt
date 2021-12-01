import java.io.File

// https://adventofcode.com/2021/day/1

class FirstTask {

    var previousNumber = 0
    var counter = 0
    var first = true

    fun readFile(input: String) = File(input).forEachLine {
        if((it.toInt() > previousNumber) && !first){
            counter++
        }
        previousNumber = it.toInt()
        first = false;
    }
}