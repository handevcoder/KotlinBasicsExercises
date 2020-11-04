package main

fun main() {
    var rating: String
    for(umur in 1..23){
        if (umur >= 21) rating = "DEWASA"
        else if (umur >= 13) rating = "REMAJA"
        else if (umur >= 9) rating = "BIMBINGAN ORANG TUA"
        else if (umur < 9 && umur > 0) rating = "SEMUA USIA"
        else rating = "UNKNOWN"
        println("$umur\t"+rating)
    }
}