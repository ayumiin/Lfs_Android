package app.takemoto.ayumin.a05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var people = arrayOf<String>("あひる","ねこ","パンダ","ペンギン")
    var food = arrayOf<String>("カレー","みそしる","チャーハン","えびちり")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun serveFood(view: View){

        var randomName = Random
        val index = randomName.nextInt(4)
        val name = people[index]
        nameTextView.text = name + "に"

        foodTextView.text = food[Random.nextInt(4)] + "を"

        if(Random.nextInt(100)<50){
            verbTextView.text = "よそえました^^"
        }else{
                verbTextView.text ="よそえませんでした"
            }
        }
    }