class Car {
    var brand = ""
    var model = ""
    var year = 0
}

fun main(args: Array<String>) {
    // Create a c1 object of the Car class
    val c1 = Car()

    // Access the properties and add some values to it
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    println(c1.brand)   // Outputs Ford
    println(c1.model)   // Outputs Mustang
    println(c1.year)    // Outputs 1969
//    println("Hello World!")
    // https://blog.csdn.net/qq_14876133/article/details/122363150
    val calculator = Calculator()
    calculator.start()

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
}