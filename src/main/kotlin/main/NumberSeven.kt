package main

fun main() {
    val start = 1
    val end = 50

    for (i in start..end){
        if (i % 4 == 0) println("$i Tahun Kabisat") else println("$i")
    }
}
