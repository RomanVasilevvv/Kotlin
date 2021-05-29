/*fun main(args:Array<String>)
{
    println("Hello ${args[0]} ")
}*/

/*fun main(args:Array<String>)
{
    print("Your favorite language? ->")
    val coutt = readLine()
    when(coutt)
    {
        "Kotlin", "Prolog" -> println("You podliza")
        else -> println("You not podliza")
    }
}*/
 //Задание 6. Работа с числами. Операторы ?. и ?:
/*fun sumOfNumber(number: Int, sum: Int = 0) : Int
= if (number == 0)
sum
else
{
val digit = number % 10
sumOfNumber(number / 10, sum + digit)
}

fun main(args: Array<String>)
{

/*Использование ?. вызывает метод только в том случае, если значение не равно null,
в противном случае он просто передает null.
Использование ?: означает, что значение слева возвращается, если оно не является null,
в противном случае возвращается значение справа*/

print("Number -> ")
try {
val number = readLine()?.toInt() ?: 0
println("Сумма цифр числа $number равна ${sumOfNumber(number)}")
}
catch (ex: NumberFormatException)
{
println("Некорректный ввод")
}
}*/
//задание 7. минимум, максимум, произв
// сумма цифр числа
/*fun sumOfNumber(number: Int, sum: Int = 0) : Int
        = if (number == 0)
    sum
else
    sumOfNumber(number / 10, sum + (number % 10))

// произведение цифр числа
fun prodOfNumber(number: Int, prod: Int = 1) : Int
        = if (number == 0)
    prod
else
    prodOfNumber(number / 10, prod * (number % 10))

// минимальная цифра числа
fun minDigitInNumber(number: Int, min: Int = 9) : Int
        = if (number == 0)
    min
else
    minDigitInNumber(number / 10, (if (number % 10 < min) number % 10 else min))

// максимальная цифра числа
fun maxDigitInNumber(number: Int, max: Int = 0) : Int
        = if (number == 0)
    max
else
    maxDigitInNumber(number / 10, (if (number % 10 > max) number % 10 else max))

fun main(args: Array<String>)
{
    print("Number -> ")
    try {
        val number = readLine()?.toInt() ?: 0
        println("Сумма цифр числа $number равна ${sumOfNumber(number)}")
        println("Произведение цифр числа $number равно ${
            if (number != 0) prodOfNumber(number) else 0}")
        println("Минимальная цифра числа $number равна ${
            if (number != 0) minDigitInNumber(number) else 0}")
        println("Максимальная цифра числа $number равна ${maxDigitInNumber(number)}")
    }
    catch (ex: NumberFormatException)
    {
        println("Некорректный ввод")
    }
}*/
//задание 8.1

// НОД двух чисел
/*fun nodTwoNumbers(number1: Int, number2: Int, nod: Int = (if (number1 > number2) number2 else number1)) : Int =
    when
    {
        (number1 == 0 || number2 == 0) -> -1
        (number1 % nod == 0 && number2 % nod == 0) -> nod
        else -> nodTwoNumbers(number1, number2, nod - 1)
    }
fun kolvoprost(number: Int, current: Int = 1, count: Int = 0) :Int =
    when
    {
        number == current -> count
     nodTwoNumbers(number,current)==1 -> kolvoprost(number,current+1,count+1)
     else -> kolvoprost(number, current+1, count)
    }
fun main()
{
   println( kolvoprost(10))

}*/
// задания 8.2
fun sumOfNumber(number: Int, sum: Int = 0) : Int
        = if (number == 0)
    sum
else
{
    val digit = number % 10

    sumOfNumber(number / 10, if (digit%3==0) sum + digit else sum)
}

fun main(args: Array<String>) {

    print("Number -> ")
    try {
        val number = readLine()?.toInt() ?: 0
        println("Сумма цифр числа $number равна ${sumOfNumber(number)}")
    } catch (ex: NumberFormatException) {
        println("Некорректный ввод")
    }
}

