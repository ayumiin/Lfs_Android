package app.takemoto.ayumin.album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //プレビュー画面に変数を送る準備をする
        val preview = Intent(this,PreviewActivity::class.java)

        //海の写真がタップされた時に
        albumImage1.setOnClickListener{

            //海の写真をセットする
            preview.putExtra("image",R.drawable.sea_image)
            //タイトルをセットする
            preview.putExtra("title","海")
            //プレビュー画面に送る
            startActivity(preview)
        }

        //ネコの写真がタップされた時に
        albumImage2.setOnClickListener{

            //猫の写真をセット
            preview.putExtra("image",R.drawable.cat_image)
            //タイトルをセット
            preview.putExtra("title","猫")
            //プレビュー画面に送る
            startActivity(preview)
        }

        //犬の写真がタップされた時に
        albumImage3.setOnClickListener{

            //犬の写真をセット
            preview.putExtra("image",R.drawable.dog_image)
            //タイトルをセット
            preview.putExtra("title","子犬")
            //プレビュー画面に送る
            startActivity(preview)
        }

        //ケーキの写真がタップされた時に
        albumImage4.setOnClickListener{

            //ケーキの写真をセット
            preview.putExtra("image",R.drawable.cake_image)
            //タイトルをセット
            preview.putExtra("title","ケーキ")
            //プレビュー画面に送る
            startActivity(preview)
        }

        //夜景の写真がタップされた時に
        albumImage5.setOnClickListener{

            //夜景の写真をセット
            preview.putExtra("image",R.drawable.night_image)
            //タイトルをセット
            preview.putExtra("title","夜景")
            //プレビュー画面に送る
            startActivity(preview)
        }

        //桜の写真がタップされた時に
        albumImage6.setOnClickListener{

            //桜の写真をセット
            preview.putExtra("image",R.drawable.flower_image)
            //タイトルをセット
            preview.putExtra("title","桜")
            //プレビュー画面に送る
            startActivity(preview)
        }
    }
}