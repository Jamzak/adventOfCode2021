import java.io.File

class TaskOneDayThree {

    fun readFile(input: String) : Int {
        var counter0 = 0;
        var counter1 = 0;
        val secondDimensionList: ArrayList<List<String>> = ArrayList()

        File(input).forEachLine{
            val firstDimensionList: List<String> = it.chunked(1)
            secondDimensionList.add(firstDimensionList)
        }

        fun getBytes(type: String): String {
            var rate = ""
            var counter = 0;
            repeat(secondDimensionList[0].size){
                for (i in secondDimensionList.indices) {
                    if (secondDimensionList[i][counter] == type){
                        counter0++
                    }else{
                       counter1++
                    }
                }
                rate = if (counter0 > counter1) {
                    rate + "0"
                }else{
                    rate + "1"
                }
                counter0 = 0;
                counter1 = 0;
                counter++
            }
            return rate
        }

        val gammaRate = getBytes("1").toInt(2)
        val epsilonRate = getBytes("0").toInt(2)
        return gammaRate * epsilonRate
    }
}