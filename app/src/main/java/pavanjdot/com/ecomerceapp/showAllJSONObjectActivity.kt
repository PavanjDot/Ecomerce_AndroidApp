package pavanjdot.com.ecomerceapp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_show_all_jsonobject.*

class showAllJSONObjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_all_jsonobject)

        txtAllProducts.setBackgroundColor(Color.GREEN)
        txtAllProducts.setTextColor(Color.BLACK)


        txtAllProducts.setOnClickListener {

            val allProductsURL = "http://192.168.1.101/ecom/present_json_array.php"

            var allProductsstring = ""

            val requestQ: RequestQueue = Volley.newRequestQueue(this@showAllJSONObjectActivity)

            val jsonAR = JsonArrayRequest(Request.Method.GET, allProductsURL, null,
                Response.Listener {

                response ->

                    for(productIndex in 0.until(response.length())){

                        allProductsstring = allProductsstring + response.getJSONObject(productIndex).getString("name") + " - " + response.getJSONObject(productIndex).getString("price") + "\n"

0
                    }

                    txtAllProducts.text  = allProductsstring




            }, Response.ErrorListener {

                        error ->

                    txtAllProducts.text =  error.message


                })

            requestQ.add(jsonAR)

        }
    }
}
