package oop_118051_gavrieldonovan.week03

class Player(
    val username: String
) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount < 0) {
            println("Exp harus angka positif")
        } else {
            val levelBefore = level
            xp += amount
            if (levelBefore != level)
                println("Level Up! Selamat $username naik ke level $level")
        }
    }
}