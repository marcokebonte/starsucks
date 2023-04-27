package st10082201.opsc7311.starsucks
import android.content.Context
import android.content.Intent
import android.os.Bundle


fun openIntent(context: Context, order: String, activityToOpen: Class<*>) {

    //declare intent with context and class to pass value too
    val intent = Intent(context, activityToOpen)

    //pass through the string with the key "order"
    input.putExtra("order", order)
    //start the activity
    context.startActivity(intent)
}//End of openIntent


fun shareIntent(context: Context, order: String){

    var sendIntent = Intent()
    sendIntent.setAction(Intent.ACTION_SEND)


    //create a bundle and add multiple values to it
    var shareOrderDetails = Bundle()
    shareOrderDetails.putString("productName", order.productName)
    shareOrderDetails.putString("customerName", order.customerName)
    shareOrderDetails.putString("customerCell", order.customerCell)



    //Share the whole bundle
    sendIntent.putExtra(Intent.EXTRA_TEXT, shareOrderDetails)
    sendIntent.setType("text/plain")

    var shareIntent = Intent.createChooser(sendIntent, null)
    context.startActivity(shareIntent)
}

class IntentHelper {



}//End of Class
//------------------------------------------oooo0000End of File0000oooo--------------------------------------------------