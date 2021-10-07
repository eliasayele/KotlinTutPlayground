import kotlin.random.Random

class Rectangle(val a: Double, val b:Double) : Shape("Rectangle"){
    constructor(a:Double) :this(a,a) //can accept one value if it is square
    constructor(a:Int,b:Int) : this(a.toDouble(),b.toDouble())  //can accept two integer but converts to double


    //companion it creates singleton
    companion object {
        fun reandomRectangle():Rectangle{
            val a   = Random.nextDouble(3.0,15.0)
            val b = Random.nextDouble(5.0,9.0)
            return  Rectangle(a,b)
        }
    }
    init {
        println("$name created with a= $a and b= $b")
    }
    override fun area() = a * b

   override fun  perimeter() = 2*a + 2*b

    fun  isSquare() = a==b

}