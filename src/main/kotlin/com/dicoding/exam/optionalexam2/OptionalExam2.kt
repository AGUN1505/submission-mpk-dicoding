package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val numberString = number.toString()
    var minDigit = Int.MAX_VALUE
    var maxDigit = Int.MIN_VALUE

    for (char in numberString) {
        val digit = char.toString().toInt()
        if (digit < minDigit) {
            minDigit = digit
        }
        if (digit > maxDigit) {
            maxDigit = digit
        }
    }
    return minDigit + maxDigit
}
