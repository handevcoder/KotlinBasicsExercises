package main
/*
given string : ilmiah
output : 6
given string: lari pagi
output: 9
*/

fun main() {
    val givenString = "ilmiah"
    val givenString1 = "lari pagi"

    val hitung = givenString.toCharArray()
    val hitung1 = givenString1
            .replace("\\s".toRegex(), "")
            .toCharArray()

    println(hitung.indices.last + 1)
    println(hitung1.indices.last + 1)

}