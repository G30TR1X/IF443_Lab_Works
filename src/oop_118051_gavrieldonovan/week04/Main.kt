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
    val myElectricCar = ElectricCar("Toyota", 4, 100)
    myElectricCar.openTrunk()
    myElectricCar.honk()
    myElectricCar.accelerate()
}