package InternetShop

class ProductManager(val name: String) {

    //Изменить количество товаров
    fun UpdateQuanity(product: Product, newQuanity: UInt){
        product.quanity = newQuanity
    }

    //Регистрация заказа
    fun RegisterSale(order: Order){
        println("Номер зарегистрированного заказа ${order.orderId}")
        println(order.OrderInfo())
    }

    fun AddCustomerToBlackList(customer: Customer){
        customer.isBL = true
        println("Заказчик добавлен в черный список")
    }

    //Добавление товара
    fun AddProduct(name: String, price: Double, quanity: UInt): Product{
        return InternetShop.Product(name, price, quanity)
    }
    //Добавление товара
    fun AddProduct(): Product{
        try {
            print("Введите название товара: ")
            val t1Name = readln()
            print("Введите цену: ")
            val t1Price = readln().toDouble()
            print("Введите количество: ")
            val t1Quanity = readln().toUInt()
            return AddProduct(t1Name, t1Price, t1Quanity)
        }
        catch (e:Exception)
        {
            println("Неверный формат данных")
            return AddProduct("Неизвестно", 0.0, 0u)
        }
    }
}