package subtask4

class Pangram {

    fun getResult(inputString: String): String {
        val vowels = arrayOf(
            'a', 'A',
            'e', 'E',
            'i', 'I',
            'o', 'O',
            'u', 'U',
            'y', 'Y'
        );
        val consonants = arrayOf(
            'b', 'B',
            'c', 'C',
            'd', 'D',
            'f', 'F',
            'g', 'G',
            'h', 'H',
            'j', 'J',
            'k', 'K',
            'l', 'L',
            'm', 'M',
            'n', 'N',
            'p', 'P',
            'q', 'Q',
            'r', 'R',
            's', 'S',
            't', 'T',
            'v', 'V',
            'w', 'W',
            'x', 'X',
            'z', 'Z'
        );
        var counter = 0;
        if (inputString.isEmpty()) {
            return "";
        }
        var arrOfWords = inputString.split(' ')
            .filter { it != "" }.filter { it != "\n" }
            .map { StringBuilder(it) }
            .toMutableList();
        if (inputString.isPangram()) {
            arrOfWords.forEachIndexed { i, it ->
                counter = 0;
                it.forEachIndexed { j, symbol ->
                    if (vowels.contains(symbol)) {
                        arrOfWords[i][j] = symbol.toUpperCase();
                        counter++
                    }
                };
                arrOfWords[i] = StringBuilder("$counter${arrOfWords[i]}");
            }
            arrOfWords.sortBy { it[0] };
            return arrOfWords.joinToString(" ");
        } else {
            arrOfWords.forEachIndexed { i, it ->
                counter = 0;
                it.forEachIndexed { j, symbol ->
                    if (consonants.contains(symbol)) {
                        arrOfWords[i][j] = symbol.toUpperCase();
                        counter++;
                    }
                };
                arrOfWords[i] = StringBuilder("$counter${arrOfWords[i]}");
            }
            arrOfWords.sortBy { it[0] };
            return arrOfWords.joinToString(" ");
        }
    }

    fun String.isEmpty(): Boolean {
        var actually = true;
        this.forEach {
            if (it != ' ') actually = false;
        }
        return actually;
    }

    fun String.isPangram(): Boolean {
        val alphabet = arrayListOf(
            'a',
            'b',
            'c',
            'd',
            'e',
            'f',
            'g',
            'h',
            'i',
            'j',
            'k',
            'l',
            'm',
            'n',
            'o',
            'p',
            'q',
            'r',
            's',
            't',
            'u',
            'v',
            'w',
            'x',
            'y',
            'z'
        );
        this.toLowerCase().forEach {
            if (alphabet.contains(it)) alphabet.remove(it);
        }
        return alphabet.isEmpty();
    }
}
