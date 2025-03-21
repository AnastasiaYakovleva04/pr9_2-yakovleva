package InternetShop

class Order(val orderId: UInt, val items: List<Product>, val totalPrice: Double):Customer() {

    //Вывод информации о заказе
    fun OrderInfo():String {
        val itemInfo = items.joinToString { it.Info() }
        return "ID заказа: $orderId, заказ содержит:\nitemInfo\n , итого: $totalPrice"
    }
}