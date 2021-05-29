import java.lang.Math.abs
//задание 1
/*fun sumOfNumber(number: Int) : Int
        = if (number == 0)
    0
else
{
    val digit = number % 10
    sumOfNumber(number / 10) + digit
}*/

//задание 2 хвостовая рекурсия
fun sumOfNumber(number: Int, sum: Int = 0) : Int
        = if (number == 0)
    sum
else
    sumOfNumber(number / 10, sum + number % 10)

fun main(args: Array<String>)
{
/*

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
//2 задание
Хвостовая рекурсия - это особый случай рекурсии, когда вызывающая функция
больше не выполняет вычисления после выполнения рекурсивного вызова.
Пример:
return 5
return sumOfNumber(a, b)
return sumOfNumber(a, b + number % 10)
Антипример:
return 5 * n
return n * sumOfNumber(a, b)
*/
    print("Number -> ")
    try {
        val number = readLine()?.toInt() ?: 0
        println("Сумма цифр числа $number равна ${sumOfNumber(abs(number))}")
    }
    catch (ex: NumberFormatException)
    {
        println("Некорректный ввод")
    }

}
