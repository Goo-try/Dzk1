fun main() {

    // 1
    println()
    val booleanVar: Boolean = true
    val byteVar: Byte = 111
    val shortVar: Short = 32767
    val intVar: Int = 44
    val longVar: Long = 1234567890L
    val floatVar: Float = 3.14f
    val doubleVar: Double = 3.14159
    val charVar: Char = 'K'
    val stringVar: String = "Hello"

    println("$booleanVar $byteVar $shortVar $intVar $longVar " +
            "$floatVar $doubleVar $charVar $stringVar")
    println()

    // 2
    print("Введите имя: ")
    val inputName = readln()
    printHello(inputName)
    println()

    // 3
    print("Введите целое число для проверки: ")
    val inputNum1 = readln().toInt()
    val check1 = isNegative(inputNum1)
    println("Число $inputNum1 отрицательное? Ответ: $check1")
    println()

    // 4
    print("Введите целое число для определения положительное или отрицательное : ")
    val inputNum2 = readln().toInt()
    printNumberSign(inputNum2)
    println()

    // 5
    printNumbersDivisibleByThree()
}

// 2
fun printHello(name: String) {
    println("Привет, $name!")
}

// 3
fun isNegative(number: Int): String {
    if (number < 0) {
        return "да"
    } else {
        return "нет"
    }
}

// 4
fun printNumberSign(number: Int) {
    if (number > 0) {
        println("Число $number положительное")
    } else if (number < 0) {
        println("Число $number отрицательное")
    } else {
        println("Число $number (ноль)")
    }
}

// 5
fun printNumbersDivisibleByThree() {
    for (i in 1000 downTo 0) {
        if (i % 3 == 0) {
            print("$i ")
        }
    }
    println()
}
