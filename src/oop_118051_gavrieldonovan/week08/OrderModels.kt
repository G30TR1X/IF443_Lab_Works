package oop_118051_gavrieldonovan.week08

class City(val name: String)
class Address(val city: City?)
class DeliveryDetails(val address: Address?)
class Order(val delivery: DeliveryDetails?, val totalPrice: Int?)