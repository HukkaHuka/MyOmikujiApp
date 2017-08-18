package animation.myomikujiapp

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getOmikuji(view: View){
        //TextViewの取得
        val tv = findViewById(R.id.myTextView) as TextView

        //運勢
        val resultText = arrayOf<String>("大吉","吉","凶")

        //乱数の生成
        val resultNum = Random().nextInt(resultText.size)

        /*
            Color.RED
            Color.rgb(255,0,0)
            Color.argb(127,255,0,0)
            Color.parseColor("#ff0000")
         */

        val colorNum = if(resultNum == 0) Color.RED else Color.rgb(0, 0, 0)
        tv.setTextColor(colorNum)

        //結果の表示
        tv.setText(resultText[resultNum])
    }
}
