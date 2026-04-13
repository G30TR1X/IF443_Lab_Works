package oop_118051_gavrieldonovan.week08

fun main() {
    println("=== TEST SAFE CALL & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidal Diketahui"
    println("Tujuan Pengiriman: $destination")
}