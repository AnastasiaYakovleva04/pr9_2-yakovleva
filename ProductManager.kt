package InternetShop

class ProductManager(val name: String) {

    //Добавление товара
    fun AddProduct(name: String, price: Double, quanity: UInt): Product{
        return InternetShop.Product(name, price, quanity)
    }

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
}