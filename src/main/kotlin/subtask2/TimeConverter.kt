package subtask2

class TimeConverter {

    fun toTextFormat(hour: String, minute: String): String {
        val arrayOfNumbers = arrayOf(
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen",
            "twenty",
            "twenty one",
            "twenty two",
            "twenty three",
            "twenty four",
            "twenty five",
            "twenty six",
            "twenty seven",
            "twenty eight",
            "twenty nine"
        );
        val hourToInt = Integer.parseInt(hour);
        val minuteToInt = Integer.parseInt(minute);
        if (hourToInt > 12) {
            return "";
        }
        return when (minuteToInt) {
            0 -> "${arrayOfNumbers[hourToInt - 1]} o' clock"
            in (1..29).filter { it != 15 } -> {
                if (minuteToInt == 1) {
                    "one minute past ${arrayOfNumbers[hourToInt - 1]}";
                } else {
                    "${arrayOfNumbers[minuteToInt - 1]} minutes past ${arrayOfNumbers[hourToInt - 1]}";
                }
            }
            15 -> "quarter past ${arrayOfNumbers[hourToInt - 1]}";
            30 -> "half past ${arrayOfNumbers[hourToInt - 1]}";
            45 -> "quarter to ${arrayOfNumbers[hourToInt]}";
            in (31..59).filter { it != 45 } -> {
                if (minuteToInt == 31) {
                    "one minute to ${arrayOfNumbers[hourToInt - 1]}";
                } else {
                    "${arrayOfNumbers[59 - minuteToInt]} minutes to ${arrayOfNumbers[hourToInt]}";
                }
            }
            else -> "";
        }
    }
}
