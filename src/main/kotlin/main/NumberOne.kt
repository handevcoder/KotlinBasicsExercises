package main
/*
penjumlahan
pengurangan
perpangkatan
pengakaran
pembagian
perkalian
*/
fun main() {
    val x = 64
    val y = 2

    penjumlahan(x,y)
    pengurangan(x,y)
    perpangkatan(x,y)
    pengakaran(x,y)
    pembagian(x,y)
    perkalian(x,y)

}

fun penjumlahan(x: Int, y: Int) = println("Output Penjumlahan\t:"+x+y)

fun pengurangan(x: Int, y: Int){
    val hasil = x-y
    println("Output Pengurangan\t:$hasil")
}

fun perpangkatan(x: Int, y: Int){
    val pow = Math.pow(x.toDouble(),2.0)
    val pow1 = Math.pow(y.toDouble(),2.0)
    val pow2 = Math.pow(x.toDouble(),y.toDouble())
    println("Output Perpangkatan\t:$pow, $pow1, dan $pow2")
}

fun pengakaran(x: Int, y: Int){
    val sqrt = Math.sqrt(x.toDouble())
    val sqrt1 = Math.sqrt(y.toDouble())
    println("Output Pengakaran\t:$sqrt dan $sqrt1")
}

fun pembagian(x: Int, y: Int) = println("Output Pembagian\t:"+x/y)

fun perkalian(x: Int, y: Int) = println("Output Perkalian\t:"+x*y)