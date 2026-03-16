package oop_118051_gavrieldonovan.week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan!")
            return
        }

        isGameRunning = true
        println("Memulai Game Engine...")
    }
}