package st10082201.opsc7311.starsucks

class Order {
    lateinit var productName: String
    lateinit var customerName: String
    lateinit var customerCell: String
    lateinit var orderDate: String

    // primary constructor
    constructor()

    // secondary constructor
    constructor(pName: String) : this() {
        productName = pName
    }

    // secondary constructor
    constructor(pName: String, cName: String, cCell: String, oDate: String) : this(pName) {
        customerName = cName
        customerCell = cCell
        orderDate = oDate
    }



}//End of Class
//------------------------------------------oooo0000End of File0000oooo--------------------------------------------------