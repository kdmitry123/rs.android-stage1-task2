package subtask3

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var count = 0;
        val firstArr = a.toCharArray().toMutableList();
        val secondArr = b.toCharArray().toMutableList();

        for (elem in secondArr) {
            while (firstArr.size != 0) {
                if (firstArr[0] == elem || firstArr[0].toUpperCase() == elem) {
                    count++;
                    break;
                }
                firstArr.removeAt(0);
            }
        }
        return if (count == secondArr.size) "YES" else "NO";
    }
}
