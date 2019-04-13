package pavanjdot.com.ecomerceapp

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var sharedP: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetData.setOnClickListener {

            val serverurl: String = "http://192.168.1.100/phptest/test_file.php"
            val requestQ: RequestQueue = Volley.newRequestQueue(this@MainActivity)

            var stringRequest = StringRequest(Request.Method.GET, serverurl,

                Response.Listener { response ->

                    txtHelloWorld.text = response



            }, Response.ErrorListener {error ->


                    txtHelloWorld.text = error.message

                })

            requestQ.add(stringRequest)
        }








    }
}
