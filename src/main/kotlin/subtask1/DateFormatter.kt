package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.util.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {

        val strDate = "$day $month $year"

        val locale = Locale("ru")

        val templateIn = DateTimeFormatter.ofPattern("d M yyyy", locale)
        val templateOut = DateTimeFormatter.ofPattern("d MMMM, EEEE", locale)

        // println("input String: $strDate")

        return try {
            val myDate = LocalDate.parse(strDate, templateIn)
            //println("Date: $myDate")

            if (myDate.dayOfMonth.toString() == day) {
                myDate.format(templateOut)
            } else "Такого дня не существует"

        } catch (e: DateTimeParseException) {
            "Такого дня не существует"
        }
    }
}
