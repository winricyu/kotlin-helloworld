package kt.`fun`.dooit.helloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnGo: Button
    private var num: Int = 0

    fun Country.isGood() = {
        this.code = 789
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tp = City()
        val nrt = Country(23, "Tokyo")
        val tpe = nrt.copy(name = "Taipei")

//        Destructuring Declarations
//        tpe.component1()
        val (myName, isCool, what, okok) = nrt
        println("$myName,$isCool,$what,$okok")

        val ctList = listOf(Country(11), Country(22), Country(33))
        ctList.forEach { (a, b, c, d) ->

        }




        nrt.isGood()
        tp.name = "YJJ"
        tp.name = ""
        tp.name = " "
        tp.name = "  "
        println("tp:${tp.name}")

        val user = User("MARK")
        user.age = 99
        user.name = "JACK"


        println("\"\":${"".isBlank()}")
        println("\"\":${"".isEmpty()}")
        println("\"\":${"".isNotBlank()}")
        println("\"\":${"".isNotEmpty()}")
        println("\"\":${"".isNullOrBlank()}")
        println("\"\":${"".isNullOrEmpty()}")

        val test: String? = null
        println("test:${test?.isBlank()}")
        println("test:${test?.isEmpty()}")
        println("test:${test?.isNotBlank()}")
        println("test:${test?.isNotEmpty()}")
        println("test:${test.isNullOrBlank()}")
        println("test:${test.isNullOrEmpty()}")


        btnGo = this.findViewById(R.id.btn_go)
        btnGo.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                num = view?.getTag() as Int? ?: 0
                num++
                view?.setTag(num)
                startTest(num)

                val x = returnVal()
                println("x: $x")


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

    fun returnVal(): String {
        return when {
            num > 4 -> "small"
            num <= 20 -> "medium"
            else -> "wow"
        }
    }


}
