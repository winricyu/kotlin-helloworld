package kt.`fun`.dooit.helloworld

class City {
    var name: String = ""
        get() = field ?: "empty"
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }
        }
    var code: Int = 0
        get() = when (field) {
            in 1..10 -> 99
            else -> 500
        }

}

fun main(args: Array<String>) {
    val taipei = City();
    taipei.name = "Taipei"
    taipei.code = 123
    println("taipei:${taipei.name}")
}


class User(var name: String = "default", var age: Int = 78) {

    var level:Int=0

    constructor(name:String):this(name,45)

    fun growup(name:String,lv:Int){
        this.name=name
        level=lv
    }

    fun growup(lv:Int){
        growup("none",lv)
    }

}