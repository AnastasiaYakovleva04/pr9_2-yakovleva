package InternetShop

open class Customer() {
    var name: String = ""
    var address: String = ""
    var isBL: Boolean = false
    //Проверка на нахождение заказчика в черном списке
    fun isInBL(): Boolean{
        return isBL
    }
}