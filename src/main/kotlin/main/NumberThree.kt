package main
/*
jika angka tersebut ganjil maka cetaklah Imperio.
jika angka tersebut ganjil dan kelipatan lima maka cetaklah Imperio Aberto.
jika angka tersebut genap maka cetaklah Crucio.
jika angka tersebut genap dan kelipatan empat maka cetaklah Crucio Reducto.
*/
fun main() {
    for (i in 1..20) {
        if (i % 2 == 1){
            if (i % 5 == 0){
                println("$i Imperio Aberto")
            } else {
            println("$i Imperio")
            }
        } else if (i % 2 == 0) {
            if (i % 4 == 0){
                println("$i Crucio Reducto")
            } else {
            println("$i Crucio")
            }
        }
    }
}