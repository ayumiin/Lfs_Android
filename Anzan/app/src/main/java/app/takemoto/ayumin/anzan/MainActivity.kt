package app.takemoto.ayumin.anzan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //0~999の数字をランダムに作る
        val randomNumber1 = Random.nextInt(1000)
        val randomNumber2 = Random.nextInt(1000)

        //数字をTextViewに反映する
        number1Text.text = randomNumber1.toString()
        number2Text.text = randomNumber2.toString()

        //0か1の数字をランダムに作る
        val randomOperator = Random.nextInt(2)

        //符号を入れる変数をつくる
        var operatorText = ""

        //答えを入れる変数を作る
        var correctAnswer = 0

        //ランダムに作った数字が0の場合は
        if(randomOperator == 0){

            //プラス記号をセットする
            operatorText = " + "
            //プラス記号をTextViewに反映する
            signText.text = operatorText
            //正しい答えを変数に入れる
            correctAnswer = randomNumber1 + randomNumber2
        }

        //ランダムに作った数字が1の場合は
        else{
            //マイナス記号をセットする
            operatorText = " - "
            //マイナス記号をTextViewに反映する
            signText.text = operatorText
            //正しい答えを変数に入れる
            correctAnswer = randomNumber1 - randomNumber2
        }

        //答えるがタップされたら
        checkButton.setOnClickListener {

            //入力された数字を受け取る
            val yourAnswer = inputText.text.toString()

            //入力された数字が空でなければ
            if(yourAnswer.isNotEmpty()){

                //正解不正解を表示する画面に除法を送る変数を準備する
                var answerPage = Intent(this,AnswerActivity::class.java)

                //問題を文字列で作る
                var questionText = randomNumber1.toString() + operatorText + randomNumber2.toString()+ "="

                //問題をセットする
                answerPage.putExtra("question",questionText)
                //入力された数字をセットする
                answerPage.putExtra("answer",yourAnswer)
                //正しい答えをセットする
                answerPage.putExtra("correct",correctAnswer.toString())
                //判定を表示する画面を起動する
                startActivity(answerPage)
                //クイズ画面を閉じる
                finish()
            }
        }

    }
}