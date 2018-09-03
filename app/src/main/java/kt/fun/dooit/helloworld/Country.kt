package kt.`fun`.dooit.helloworld

import android.support.annotation.ColorRes

data class Country(var code: Int, var name: String?, var desc: String?, var isFar: Boolean) {

    constructor(code: Int) : this(code, "", null, false)
    constructor(code: Int, name: String?) : this(code, name, null, false)
}

enum class Color(hex: String) {
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF")
}

open class Shape(val name: String, var color: Color = Color.BLUE) {


    open fun area() = 0
    open fun mixColor(c1: Color, c2: Color): Color = Color.BLUE
}

class Square(name: String, val wdith: Int) : Shape(name) {

    constructor(newColor: Color) : this("default", 500) {
        super.color = newColor
    }

    override fun mixColor(c1: Color, c2: Color): Color {
        return Color.GREEN
    }
}

abstract class Animal{
    abstract fun walk()
    abstract fun run()
}

abstract class Dog:Animal(){


    abstract fun bow()
}

class Husky:Dog(){
    override fun walk() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun run() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun bow() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}



fun main(args: Array<String>) {
    val taipei = City()
    taipei.name = "Taipei"
    taipei.code = 123
}
