package oop_118051_gavrieldonovan.week08

fun main() {
    println("=== TEST SAFE CALL & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidal Diketahui"
    println("Tujuan Pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: $tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"
    println(receipt)
}