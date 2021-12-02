import java.io.File

class TaskOne {
    var horizontal = 0;
    var depth = 0;

    fun readFile(input: String) : Int {
        File(input).forEachLine{
            val split = it.split(" ").toTypedArray()
            val pos = split[0]
            val num = split[1].toInt()
            if(pos == "forward") horizontal += num
            if(pos == "up") depth -= num
            if(pos == "down") depth += num
        }
        return horizontal * depth
    }
}