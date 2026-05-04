package oop_118051_gavrieldonovan.week11

fun main() {
    println("=== TEST LET FUNCION ===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama terdeteksi: ${it}")
        it.length
    }
    println("Panjang nama: $length")
}