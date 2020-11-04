package main

fun main() {
    for (i in 1..1000){
        if (i % 100 == 0){
            println("$i. Kelipatan seratus")
        } else if (i % 2 == 1){
            if (i % 7 == 0){
                println("$i. Ganjil kelipatan tujuh")
            } else {
                println("$i. Ganjil")
            }
        } else if (i % 2 == 0){
            if (i % 8 == 0){
                println("$i. Genap kelipatan delapan")
            } else {
                println("$i. Genap")
            }
        }
    }
}