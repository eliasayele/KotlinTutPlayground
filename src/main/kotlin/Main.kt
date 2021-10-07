fun main(args: Array<String>) {
    //  println("Hello World!")
    ///declaring array
//  var myarr = arrayOf("hello","getter","world")
//    println(myarr[0])
///accept form console input
//    val age  = readLine()?.toInt()
//    print(age)
    ///while loop
//    var num = 1
//    while (num < 10) {
//        println("mum index $num")
//        num++
//    }

    ///for loop
//    for (i in 1..4){
//        println(i)
//    }
//    for (i  in 10 downTo 5 step 2){
//        println(i)
//    }
//    for (i in '1'..'z'){
//        println(i.uppercaseChar())
//    }
//    println("Enter Number 1: ")
//    var x =  readLine()?.toInt()
//    println("Enter number 2: ")
//    var y  = readLine()?.toInt()
//    var result = 1
//    var i = 0
//    while (x != null && y != null && i <y){
//        result *=x
//        i++
//    }
//    print("the result is $result")

    ///list and mutable list
//    var list = listOf(1,3,4,5)
//    var list2 = mutableListOf(1,3,4,5)
//    list2.add(7)
//    list2.remove(3)
//    println(list2)


    /// "when" loop that replace long if else block
//    var age = readLine()?.toInt()
//    when (age){
//     in 0..5 -> println("You are yunger kid")
//     in 6..17 -> println("you are a tinager")
//     19,20 -> println("Your young adult ")
//        in 21..65 -> println("you are adult")
//        else -> println("You are really old")
//    }

//var list  = mutableListOf<Int>()
//    println("please enter 5 numbers")
//    for (i in 1..5){
//        val x = readLine()?.toInt()
//        if (x != null){
//            list.add(x)
//        }
//    }
//    println("the 5 numbers in reverse order is: ")
//    for (i in list.size - 1 downTo 0){
//        println(list[i])
//    }

    ///working with Fibonacci series

//var list  = mutableListOf(0,1)
//    println("Enter a numbern >1")
//    var n = readLine()?.toLong()
//    if (n !=null){
//        for (i in 2 until n){
//            list.add(list[(i-2).toInt()] + list[(i-1).toInt()])
//        }
//
//    }
//    println(list)
//println("Enter your country")
//    var country = readLine()
//    when (country){
//        "Eth" -> println("Salam")
//        "India" -> println("namaste")
//        "usa" -> println("Hello")
//        else -> println("I don't know that")
//    }

///Working with FUNCTIONS IN KOTLIN
//println(printPow(3,6))
//
//    println(multiply(3,5))
//
//    //print first item of the list in fun
//    var items = listOf<Int>(1,2,4)
//    printListItem(items)

    ///vararg usage
//    val max = getMax(1,4,6,8,2,9,0,34,5,6,78,54,3,33)
//    println("The maximum value is $max")

    ///usage in named parameter of functions
//searchFor("How to become kotlin programmer","Bing")
//    searchFor(search = "how to pass values to func" ,searchEngine = "duckDuckgo")
//    searchFor(searchEngine = "Bing", search = "how to become programmer")

    ///Extension to a function for Int
//println("please insert a number")
//   var input =  readLine()?.toInt()?.toInt()
//    if (input != null){
//        if (input.isPrime()){
//            println("$input is prime")
//        }
//        else {
//            println("$input is not prime")
//        }
//    }


    ///extension to List<Int>
//    var list  = listOf<Int>(9,5,3,6,7)
//    println("the product off this list is")
//    println(list.productOf())

    ///classes and objects
//    var rec = Rectangle(10,40)
//    println("the area of the rectangle is ${rec.area()}")
//    println("the perimeter of the  rectangle is ${rec.perimeter()} ")
//    println("Is the square is rectangle ? ${rec.isSquare()}")
//   rec.changeName("Circle")
//    print("the area of ${rec.name} is ${rec.area()}")
//    //print(rec)


    ///use other constructors
//    var rec = Rectangle(5.0)
//    println(rec.perimeter())

    ///user function overloading
//    var rec1 = Rectangle(5.0)
//    var rec2 = Rectangle(7.0,9.0)
//    var maxArea = maxArea(rec1,rec2)
//    println("the maximum area of the rectangle and the circle is $maxArea")
}

///take a look this function overloading in maxArea
fun maxArea(shape1:Shape,shape2:Shape):Double{
    val areaShape1 = shape1.area()
    val areaShape2  = shape2.area()
 return    if (areaShape1 > areaShape2)  areaShape1 else areaShape2
}
fun maxArea(shape1:Shape,shape2:Shape,shape3:Shape):Double{
    val maxAreaShape1Shape2 = maxArea(shape1,shape2)
    val areaShape3  = shape3.area()
    return    if (maxAreaShape1Shape2 > areaShape3)  maxAreaShape1Shape2 else areaShape3
}

/* outside of main function*/

///extension function to Int
//fun Int.isPrime():Boolean{
//  for (i in 2 until this -1){
//      if (this % 1 ==0){
//          return false
//      }
//  }
//    return  true
//}


///extension to List
//fun List<Int>.productOf():Int{
//    var result = 1
//    for (i in this){
//        result *= i
//    }
//    return  result
//}


///default value for parameters
//fun searchFor(search:String,searchEngine:String="Google"){
//    println("Searching for $search  on $searchEngine")
//}


///vararg in fun parameter, we can treat numbers like array
//fun getMax(vararg numbers:Int):Int{
//   var max = numbers[0]
//    for (number in numbers){
//        if (number > max){
//            max = number
//        }
//    }
//    return  max
//}

//calculates base power of exponent
//fun printPow(base:Int,exponent:Int): Int {
//    var result = 1
//    for( i in 1 until  exponent){
//        result *= base
//    }
//    return result
//}
//
////another function declaration
//fun multiply(a:Int,b:Int) = a * b

//pass list for func parameter
//fun printListItem(list:List<Int>) = println(list[0])