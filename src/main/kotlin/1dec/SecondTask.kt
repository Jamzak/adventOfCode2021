import java.io.File

// https://adventofcode.com/2021/day/1

class SecondTask {

    var counter = 0; var newValue = 0; var oldValue = 0; val list = arrayListOf<Int>()

    fun readFile(input: String) : Int{
        File(input).forEachLine {
            if(list.size < 4){
                list.add(it.toInt())
                if(list.size == 4){
                    newValue = list[1] + list[2] + list[3]
                    oldValue = list[0] + list[1] + list[2]
                }
            }else{
                list.removeAt(0)
                list.add(it.toInt())
                newValue = list[1] + list[2] + list[3]
            }
            if(list.size == 4){
                if(newValue > oldValue) counter++
                    oldValue = newValue
            }
        }
        return counter
    }
}