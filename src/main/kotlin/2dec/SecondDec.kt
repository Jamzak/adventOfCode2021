import java.io.File

class SecondDec {
    var horizontal = 0;
    var depth = 0;

    fun readFile(input: String) : Int {
        File(input).forEachLine{
            val split = it.split(" ").toTypedArray()
            val pos = split.get(0)
            val num = split.get(1).toInt()

            if(pos == "forward") horizontal += num
            if(pos == "up") depth -= num
            if(pos == "down") depth += num
        }
        return horizontal * depth
    }
}