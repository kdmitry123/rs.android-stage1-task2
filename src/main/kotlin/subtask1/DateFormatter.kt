package subtask1

import java.time.LocalDate
import java.time.YearMonth
import java.time.format.TextStyle
import java.util.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        val yearToInt = year.toInt();
        val dayToInt = day.toInt();
        val monthToInt = month.toInt();
        if (monthToInt > 12 || dayToInt > YearMonth.of(yearToInt, monthToInt).lengthOfMonth()) {
            return "Такого дня не существует";
        }
        val date = LocalDate.of(yearToInt, monthToInt, dayToInt);
        val dayOfWeek = date.dayOfWeek.getDisplayName(TextStyle.FULL, Locale("ru"));
        val monthValue = date.month.getDisplayName(TextStyle.FULL, Locale("ru"));
        return "$day $monthValue, $dayOfWeek";
    }
}



