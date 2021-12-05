import java.io.File
import kotlin.collections.MutableList

class TaskTwoDayThree {

    fun readFile(input: String) : Int {
        var secondDimensionList: MutableList<List<String>> = mutableListOf()
        File(input).forEachLine{
            val firstDimensionList: List<String> = it.chunked(1)
            secondDimensionList.add(firstDimensionList)
        }

        fun getRatings(input: String) : String {
            val one: MutableList<List<String>> = mutableListOf()
            val zero: MutableList<List<String>> = mutableListOf()
            var list: MutableList<List<String>>
            list = secondDimensionList.toMutableList()
        var counter = 0;
            for (i in 0 until list[0].size)  {
                if(list.size == 1) break;
                for (i in list.indices) {

                when (list[i][counter]) {
                    "0" -> zero.add(list[i])
                    "1" -> one.add(list[i])
                }
            }
            var check = zero.size > one.size
            if(input == "1"){
                check = !check
            }
                list = if(check){
                    list.clear()
                    zero.toMutableList()
                }else{
                    list.clear()
                    one.toMutableList()
                }
            zero.clear()
            one.clear();
            counter++;
            }
            return list[0].joinToString("")
        }
        return (getRatings("0").toInt(2)) * getRatings("1").toInt(2)
    }
}