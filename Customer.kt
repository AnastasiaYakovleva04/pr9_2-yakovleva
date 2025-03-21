package InternetShop

open class Customer() {
    var name: String = ""
    var address: String = ""
    var isBL: Boolean = false

    //Проверка на нахождение заказчика в черном списке
    fun isInBL(): Boolean{
        return isBL
    }

    fun MakeOrder(productList: List<Product>): Order{
        print("Сколько товаров хотите заказать: ")
        val ordSize = readln().toInt()
        val ord = mutableListOf<Product>()
        var totalPrice = 0.0
        var j = 0

        while (j <= ordSize) {
            var isInList = false
            print("Введите название товара: ")
            val prodName = readln()
            for (i in 0..productList.size) {
                if (productList[i].name == prodName) {
                    isInList = true
                    ord.add(i, productList[i])
                    totalPrice += productList[i].price
                    j += 1
                }
            }

            if (!isInList)
                println("Нет товара с таким названием")
        }
        val order = Order(1u, ord, totalPrice)
        return order
    }
}