abstract class Shape(
    var name:String
) {
    constructor(name: String,vararg  dimension:Double): this(name)

    init {
        println("I am supper class!")
    }
abstract fun area():Double
abstract  fun perimeter():Double
    fun changeName(newName:String){
        this.name = newName
    }
}

