import  InternetShop.*


fun main() {
    print("Введите имя товароведа: ")
    val nameManager = readln()
    val manager1 = ProductManager(nameManager)

    val t1 = manager1.AddProduct()
    val t2 = manager1.AddProduct()
    val t3 = manager1.AddProduct()
    val products = listOf(t1, t2, t3)

    println(t1.Info())
    println(t2.Info())
    println(t3.Info())

    val customer1 = Customer()
    print("Введите имя заказчика: ")
    customer1.name  = readln()
    print("Введите адрес заказчика: ")
    customer1.address = readln()
    customer1.MakeOrder(products)
    println("Сумма заказа = ")
}
