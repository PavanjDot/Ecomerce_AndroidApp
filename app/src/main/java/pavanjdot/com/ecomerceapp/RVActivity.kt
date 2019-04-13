package pavanjdot.com.ecomerceapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_rv.*

class RVActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv)


        var myProductList = ArrayList<EProducts>()

        myProductList.add(EProducts(0,"iPhone", 1000, R.drawable.iphone))

        myProductList.add(EProducts(1,"MacBook",2000, R.drawable.macbook))

        myProductList.add(EProducts(2,"iMac",2000, R.drawable.ipad))

        myProductList.add(EProducts(3,"iPhone",200, R.drawable.ipodshuffle))

        myProductList.add(EProducts(4,"ipod",200, R.drawable.ipodnano))

        myProductList.add(EProducts(5,"iPod Touch",500, R.drawable.ipodtouch))


        var RVAdapter = RVAdapter(this@RVActivity, myProductList)

        recyclerView.layoutManager = LinearLayoutManager(this@RVActivity)

        recyclerView.adapter = RVAdapter
}
}
