package oop_118051_gavrieldonovan.week12

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching { "42X".toInt() }
}