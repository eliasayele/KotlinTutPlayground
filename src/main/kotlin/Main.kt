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
    var age = readLine()?.toInt()
    when (age){
     in 0..5 -> println("You are yunger kid")
     in 6..17 -> println("you are a tinager")
     19,20 -> println("Your young adult ")
        in 21..65 -> println("you are adult")
        else -> println("You are really old")
    }

}