package oop_118051_gavrieldonovan.week07

class GameExecutor {
    fun processEvent(event: BattleState) {
        when (event) {
            is BattleState.MonsterEncounter -> {
                println("Player telah menemukan ${event.monsterName}")
            }
            is BattleState.LootDropped -> {
                println("Dropped ${event.item.name} dengan rarity ${event.item.rarity}")
            }
            is BattleState.GameOver -> {
                println("Game Over!\nPlayer telah kalah karena ${event.reason}!")
            }
            BattleState.SafeZone -> {
                println("Player telah memasuki safe zone")
            }
        }
    }
}