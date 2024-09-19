package com.dicoding.exam.optionalexam1

// TODO
fun sumOfBigThree(vararg numbers: Int): Int {
    val sortedNumbers = numbers.sortedDescending()
    val topThree = sortedNumbers.take(3)
    return topThree.sum()
}
