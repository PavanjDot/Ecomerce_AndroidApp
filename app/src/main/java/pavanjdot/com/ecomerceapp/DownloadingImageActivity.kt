package pavanjdot.com.ecomerceapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_downloading_image.*

class DownloadingImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_downloading_image)


        btn_DownloadImage.setOnClickListener {

            val imageURL = "http://192.168.1.101/myimage.jpeg"



            Picasso.get().load(imageURL).into(imgDownloadedImage);

        }
    }
}
