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
fun sumOfNumber(number: Int, sum: Int = 0) : Int
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
}


