package main

fun main() {
    val numbers = listOf(3, 1, 7, 4, 5, 6, 8, 2)
    var jumlah = 0
    for ((index, value) in numbers.sorted().withIndex()) {
        when {
            index != numbers.lastIndex -> jumlah += value
        }
    }
    println(jumlah)
}
    
