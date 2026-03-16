package oop_118051_gavrieldonovan.week07

import javax.xml.crypto.Data

fun main() {
    /*
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")
    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }

    println("Message UI: $uiMessage")
     */
    println("Status Game: ${GameManager.isGameRunning}")

    println("=== STARTING GAME ===")
    GameManager.startGame()
    println("Status Game: ${GameManager.isGameRunning}")

    println("\nChance Drop Legendary: ${ItemRarity.LEGENDARY.dropChance}%")
    val playerWeapon = Weapon.forgeStarterSword()
    println("\n=== PLAYER WEAPON DATA ===")
    println("Weapon Name: ${playerWeapon.item.name}")
    println("Weapon Damage: ${playerWeapon.item.damage}")
    println("Weapon Rarity: ${playerWeapon.item.rarity}")
    println("Weapon Durability: ${playerWeapon.durability}")

    playerWeapon.item = playerWeapon.item.copy(damage = 25)
    println("\n=== NEW UPGRADED PLAYER WEAPON DATA ===")
    println("Weapon Name: ${playerWeapon.item.name}")
    println("Weapon Damage: ${playerWeapon.item.damage}")
    println("Weapon Rarity: ${playerWeapon.item.rarity}")
    println("Weapon Durability: ${playerWeapon.durability}\n")

    val monsterName: String = "Nicholas"
    val gameExecutor: GameExecutor = GameExecutor()
    val eventBattleState: List<BattleState> = listOf(
        BattleState.LootDropped(GameItem("Diamond Sword", 10, ItemRarity.UNCOMMON)),
        BattleState.SafeZone,
        BattleState.MonsterEncounter(monsterName),
        BattleState.GameOver("Dibunuh $monsterName"),
    )

    for (event in eventBattleState) {
        gameExecutor.processEvent(event)
    }
}