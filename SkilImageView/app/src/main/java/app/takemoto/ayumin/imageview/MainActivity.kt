package app.takemoto.ayumin.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.api.load

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "http://life-is-tech.com/materials/images/logo-square.png"
        val imageView = findViewById<ImageView>(R.id.imageView)

        imageView.load(url)
    }
}