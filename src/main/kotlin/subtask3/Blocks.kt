package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        var resultI = 0
        var resultS = ""
        val templateOut = DateTimeFormatter.ofPattern("dd.MM.yyyy")
        var resultD = LocalDate.parse("0001-01-01")

        for (obj in blockA) {
            when (obj) {
                is Int -> resultI += obj
                is String -> resultS += obj
                is LocalDate -> if (obj.isAfter(resultD)) resultD = obj
            }
        }

        return when (blockB) {
            Int::class -> resultI
            String::class -> resultS
            LocalDate::class -> resultD.format(templateOut)
            else -> "No result"
        }
    }
}
