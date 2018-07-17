package kt.`fun`.dooit.helloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btnGo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnGo = findViewById(R.id.btn_go)
        btnGo.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                var num: Int = view?.getTag() as Int? ?: 0
                num++
                view?.setTag(num)
                startTest(num)
            }
        })


    }

    fun startTest(price: Int) {
        when (price) {
            1 -> {
                println("$$price  dollor")
            }
            in 3..10 -> {
                println("$$price so cheap")
            }

            !in 17..22 -> println("$$price not bad")
            else -> println("$$price WTF")
        }
    }


}
