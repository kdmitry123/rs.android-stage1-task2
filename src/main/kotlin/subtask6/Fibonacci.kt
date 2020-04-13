package subtask6

class Fibonacci {

    fun productFibonacciSequenceFor(n: Int): IntArray {
        var first = 0;
        var second = 1;
        while (first * second < n) {
            val next = first + second;
            first = second;
            second = next;
        }
        return intArrayOf(first, second, if (first * second == n) 1 else 0);
    }
}
