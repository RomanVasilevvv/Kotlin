import java.lang.Math.abs

fun sumOfNumber(number: Int) : Int
        = if (number == 0)
    0
else
{
    val digit = number % 10
    sumOfNumber(number / 10) + digit
}





fun main(args: Array<String>)
{
/*
Использование ?. вызывает метод только в том случае, если значение не равно null,
в противном случае он просто передает null.
Использование ?: означает, что значение слева возвращается, если оно не является null,
в противном случае возвращается значение справа
*/
    //1
    /*print("Number -> ")
    try {
        val number = readLine()?.toInt() ?: 0
        println("Сумма цифр числа $number равна ${sumOfNumber(abs(number))}")
    }
    catch (ex: NumberFormatException)
    {
        println("Некорректный ввод")
    }*/

}
