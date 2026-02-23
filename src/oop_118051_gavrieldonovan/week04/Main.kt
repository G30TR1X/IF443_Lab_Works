package oop_118051_gavrieldonovan.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generateVehicle = Vehicle("Sepeda Onthel")
    generateVehicle.honk()
    generateVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar("Tesla", 4, 100)
    myElectricCar.openTrunk()
    myElectricCar.honk()
    myElectricCar.accelerate()

    println("\n--- Testing Manager ---")
    val manager = Manager("Clemens Putra Kusmeri", 13000000)
    manager.work()
    println("Bonus ${manager.name}: ${manager.calculateBonus()}")

    println("\n--- Testing Developer ---")
    val dev= Developer("Gregorius William Tanuwijaya", 10000000, "Python")
    dev.work()
    println("Bonus ${dev.name}: ${dev.calculateBonus()}")
}