import java.io.File

// https://adventofcode.com/2021/day/1

class SecondTask {

    var counter = 0
    var newValue = 602;
    var previousValue = 0;

    val list = arrayListOf<Int>()

    fun readFile(input: String) = File(input).forEachLine {
        if(list.size < 3){
            list.add(it.toInt())
            if(list.size == 3){
                previousValue = list[0] + list[1] + list[2]
            }
        }else{
            list.removeAt(0)
            list.add(it.toInt())
            newValue = list[0] + list[1] + list[2]
        }
        if(list.size == 3){
            println("PREVALUE $previousValue")
            println("NEW VALUE$newValue")
            if(newValue > previousValue){
                counter++
            }
            previousValue = newValue
        }
    }
}