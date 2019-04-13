package pavanjdot.com.ecomerceapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class RVAdapter(var context: Context, var arrayList: ArrayList<EProducts>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        var productView = LayoutInflater.from(context).inflate(R.layout.rv_row, parent, false)

        return ProductViewHolder(productView)
    }

    override fun getItemCount(): Int {


        return arrayList.size

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        (holder as ProductViewHolder).initilizeUIComponents(
            arrayList[position].id,
            arrayList[position].name,
            arrayList[position].price,
            arrayList[position].productPictre)
    }


    inner class ProductViewHolder(myView: View) : RecyclerView.ViewHolder(myView){


        var productID_textview = myView.findViewById<TextView>(R.id.RV_row_ProductID)

        var productName_textview = myView.findViewById<TextView>(R.id.RV_row_ProductName)

        var productPrice_textview = myView.findViewById<TextView>(R.id.RV_row_ProductPrice)

        var productImageview =myView.findViewById<ImageView>(R.id.RV_row_ProductImage)



        fun initilizeUIComponents(pID: Int, pName: String, pPrice: Int, pPicture: Int) {

            productID_textview.text = pID.toString()

            productName_textview.text = pName.toString()

            productPrice_textview.text = pPrice.toString()

            productImageview.setImageResource(pPicture)





        }
    }
}