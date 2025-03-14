import  InternetShop.*

fun main() {
    print("Введите имя товароведа: ")
    val nameManager = readln()
    val manager1 = ProductManager(nameManager)

    val t1 = AddPr(manager1)
    val t2 = AddPr(manager1)
    val t3 = AddPr(manager1)

    println(t1.Info())
    println(t2.Info())
    println(t3.Info())

    val customer1 = Customer()
    print("Введите имя заказчика: ")
    customer1.name  = readln()
    print("Введите адрес заказчика: ")
    customer1.address = readln()



}
fun AddPr(manager: ProductManager): Product{
    try {
        print("Введите название товара: ")
        val t1Name = readln()
        print("Введите цену: ")
        val t1Price = readln().toDouble()
        print("Введите количество: ")
        val t1Quanity = readln().toUInt()
        return manager.AddProduct(t1Name, t1Price, t1Quanity)
    }
    catch (e:Exception)
    {
        println("Неверный формат данных")
        return manager.AddProduct("Неизвестно", 0.0, 0u)
    }
}