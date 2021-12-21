package app.takemoto.ayumin.anzan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_answer.*

class AnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        //クイズ画面から問題を受け取る
        var displayQuestion = intent.getStringExtra("question")
        //クイズ画面から入力された数字を受け取る
        var yourAnswer = intent.getStringExtra("answer")
        //クイズ画面から正解の数字を受け取る
        var correctAnswer = intent.getStringExtra("correct")

        //問題をTextViewに反映
        questionText.text = displayQuestion
        // 入力された数字をTextViewに反映
        yourAnswerText.text = yourAnswer

        //入力された数字と正解の数字を比べて
        if(yourAnswer == correctAnswer){
            markImage.setImageResource(R.drawable.correct_image)
            randyImage.setImageResource(R.drawable.randy_happy_image)
        }else{
            markImage.setImageResource(R.drawable.miss_image)
            randyImage.setImageResource(R.drawable.randy_sad_image)
        }

        //戻るボタンがタップされた時
        backButton.setOnClickListener {
            //クイズ画面を表示する画面に情報を送る変数を準備する
             var questionPage = Intent(this,MainActivity::class.java)
            //クイズ画面を起動する
            startActivity(questionPage)
            //答え合わせ画面を閉じる
            finish()
        }
    }
}