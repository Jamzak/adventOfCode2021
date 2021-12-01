import java.io.File

// https://adventofcode.com/2021/day/1

class Task1Day1 {

    fun readFile(input: String) : Int {
        var counter = 0 ; var previousNumber = 0 ; var first = true
        File(input).forEachLine{
            if (it.toInt() > previousNumber && !first) counter++
                previousNumber = it.toInt()
                first = false;
        }
        return counter
    }
}