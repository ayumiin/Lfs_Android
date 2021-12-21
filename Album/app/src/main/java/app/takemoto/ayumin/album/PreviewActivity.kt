package app.takemoto.ayumin.album

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_preview.*

class PreviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        //前の画面から写真を受け取る
         var imageId =intent.getIntExtra("image",0)

        //前の画面からタイトルを受け取る
        var displayTitle = intent.getStringExtra("title")

        //受け取った写真をセット
        previewImage.setImageResource(imageId)

        //受け取ったタイトルをセット
        titleText.text = displayTitle

        //戻るボタンがタップされた時に
        backButton.setOnClickListener {
            //画面を閉じる
            finish()
        }
    }
}