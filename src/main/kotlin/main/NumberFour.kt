package main

fun printAll(kata: Collection<String>) {
    for(kalimat in kata) print("$kalimat ")
    println()
}

fun main() {
    val list = listOf("Aku", "bukanlah", "Superman", "Aku", "juga", "bisa", "nangis")
    printAll(list)
}