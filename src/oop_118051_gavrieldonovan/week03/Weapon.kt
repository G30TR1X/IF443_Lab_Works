package oop_118051_gavrieldonovan.week03

class Weapon(
    val name: String
) {
    var damage: Int = 100
        set(dmg: Int) {
            if (dmg < 0) {
                println("Damage tidak boleh negatif!")
            } else if (dmg > 1000) {
                field = 1000
            } else {
                field = dmg
            }
        }

    val tier: String
        get() = if (damage > 800) "Legendary" else if (damage > 500) "Epic" else "Common"
}