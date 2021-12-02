import java.io.File

class TaskTwo {
    var horizontal = 0 ;var depth = 0 ;var aim = 0

    fun readFile(input: String) : Int {
        File(input).forEachLine{
            val split = it.split(" ").toTypedArray()
            val pos = split[0]
            val num = split[1].toInt()
            if(pos == "forward") {
                horizontal += num
                depth += (num * aim)
            }
            if(pos == "up") aim -= num
            if(pos == "down") aim += num
        }
        return horizontal * depth
    }
}