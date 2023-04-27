package st10082201.opsc7311.starsucks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import st10082201.opsc7311.starsucks.databinding.ActivityOrderDetailsBinding

class OrderDetailsActivity : AppCompatActivity() {

    var order = Order()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityOrderDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //get the name of the ordered product from the intent
        order.productName = intent.getStringExtra("order").toString()

        binding.YourOrder.text = order.productName


        when(order.productName){
            "Soy Latte" -> binding.imgOrderedBev.setImageResource(R.drawable.sb1)
            "Choco Frapp" -> binding.imgOrderedBev.setImageResource(R.drawable.sb2)
            "Bottled Americano" -> binding.imgOrderedBev.setImageResource(R.drawable.sb3)
            "Rainbow Frapp" -> binding.imgOrderedBev.setImageResource(R.drawable.sb4)
            "Caramel Frapp" -> binding.imgOrderedBev.setImageResource(R.drawable.sb5)
            "Black Forest Frapp" -> binding.imgOrderedBev.setImageResource(R.drawable.sb6)


        }
    }//End of method



}