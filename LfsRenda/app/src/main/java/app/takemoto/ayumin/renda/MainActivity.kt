package app.takemoto.ayumin.renda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //タップを数える変数を準備する
    var tapCount = 0

    //残り秒数10にセット
    var second = 10

    //タイマーを設定する
    val timer : CountDownTimer = object : CountDownTimer(10000,1000){

        //タイマーが終了するときに呼ばれる
        override fun onFinish()
        {
            //スタートボタンを見える状態にする
            startButton.isVisible = true
            //TAPボタンを灰色にセットする
            tapButton.setBackgroundResource(R.drawable.background_rounded_gray)
            //残り秒数を10秒に戻す
            second = 10
            //タップを数える変数を0に戻す
            tapCount = 0
        }

        //一秒ごとに呼ばれる
        override fun onTick(millisUntilFinished:Long) {
            //TAPボタンをピンク色にセット
            tapButton.setBackgroundResource(R.drawable.background_rounded_circle)
            //残り秒数にマイナス1する
            second = second-1
            //残り数字をテキストビューに反映する
            secondText.text = second.toString()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //スタートボタンがタップされた時
        startButton.setOnClickListener {
            //タップされた数をテキストビューに反映させる
            countText.text = tapCount.toString()
            //STARTボタンを見えない状態にする
            startButton.isVisible = false

            //タイマーを開始する
            timer.start()
        }

        //ボタンがタップされた時
        tapButton.setOnClickListener {

            if(second < 10)
            {
                //タップを数える変数にプラス1する
                tapCount = tapCount + 1

                //タップされた数をテキストビューに表示する
                countText.text = tapCount.toString()
            }
        }

    }
}