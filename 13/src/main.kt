import java.lang.Math.sqrt

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
fun nodTwoNumbers(number1: Int, number2: Int, nod: Int = (if (number1 > number2) number2 else number1)) : Int =
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

/*fun main()
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

    /*fun main(args:Array<String>)
{

    print("Number -> ")
    try {
        val number = readLine()?.toInt() ?: 0
        println("Сумма цифр числа $number равна ${sumOfNumber(number)}")
    } catch (ex: NumberFormatException) {
        println("Некорректный ввод")
    }
}*/
//задание 8.3
fun del(s:Int):Int {
    var d = 2
    var max = 0
    var maxd = 1
    while (d < s) {
        if (s % d == 0) {
            var k = 0
            var num = s
            while (num > 0) {
                var a = 2
                var flag = false
                while (a <= num % 10) {
                    if ((num % 10) % a == 0 && d % a == 0) {
                        flag = true
                        break
                    }
                    a++
                }
                if (!flag) k++
                num /= 10
            }
            if (max < k) {
                max = k
                maxd = d
            }
        }
        d++
    }
    return maxd
}

/*fun main()
{
    println(del(26))
}*/
fun continueMode() : String
{
    print("Continue? y/n -> ")
    return when (readLine()) {
        "y" -> "mainRelease"
        "n" -> "return"
        else -> continueMode()
    }
}

fun mainRelease()
{
    print("Number -> ")
    try {
        val number = readLine()?.toInt() ?: 0
        print("Method 1/2/3 -> ")
        when(readLine()?.toInt() ?: 1)
        {
            1 -> println("Найти количество чисел, взаимно простых с заданным.: ${kolvoprost(number)}")
            2 -> println("Найти сумму цифр числа, делящихся на 3: ${sumOfNumber(number)}")
            3 -> println("Найти делитель числа, являющийся взаимно простым с\n" +
                    "наибольшим количеством цифр данного числа.: ${del(number)}")
            else -> println("Такого метода нет в списке")
        }
    }
    catch (ex: NumberFormatException)
    {
        println("Некорректный ввод")
    }

    when(continueMode())
    {
        "mainRelease" -> mainRelease()
        "return" -> return
    }
}

/*fun main(args: Array<String>)
{
    mainRelease()
}*/

fun countDel(s:Int):Int {
    var d = 2
    var k = 0
    while (d <= Math.sqrt(s.toDouble())) {
        if (s % d == 0) k++
        d++
    }
    k *= 2
    val sqrt: Int = (Math.sqrt(s.toDouble())).toInt()
    if (Math.pow(sqrt.toDouble(), 2.0) == s.toDouble()) k--
    return k
}
fun treangle():Int {
    var num = 1
    var index = 1
    var kolvo = countDel(num)
    while (kolvo <= 500) {
        index++
        num += index
        kolvo = countDel(num)
    }
    return num
}
//10,53
fun pandigit(num:Int):Boolean {//123
    var n = num
    while (n>10)
    {
        if (n%10>(n/10)%10)
            n/=10
        else return false
    }
    return true
}
fun sumProizveden ():Int {
    var num = 999
    var sum: Int = 0
    while (num.toString().length * 2 + 1 <= 9) {
        var d = 1
        while (d <= sqrt(num.toDouble())) {
            if (num % d == 0) {
                var n: String = num.toString() + d.toString() + (num / d).toString()
                if (n.length == 9) {
                    var ar = n.toCharArray().sorted().joinToString("")
                    if (ar[0] != '0' && pandigit(ar.toInt())) {
                        sum += num
                        break
                    }
                }
            }
            d++
        }
        num++
    }
    return sum
}
//10.53
fun check23456(num:Int):Boolean {
    var n2 = (num * 2).toString().toCharArray().sorted().joinToString("")
    var n3 = (num * 3).toString().toCharArray().sorted().joinToString("")
    var n4 = (num * 4).toString().toCharArray().sorted().joinToString("")
    var n5 = (num * 5).toString().toCharArray().sorted().joinToString("")
    var n6 = (num * 6).toString().toCharArray().sorted().joinToString("")
    var a = 0
    while (a < 10 && n2.isNotEmpty() && n3.isNotEmpty() && n4.isNotEmpty() && n5.isNotEmpty() && n6.isNotEmpty()) {
        if (n2[0].toString() == a.toString() && n3[0].toString() == a.toString() && n4[0].toString() == a.toString() && n5[0].toString() == a.toString() && n6[0].toString() == a.toString()) {
            n2 = n2.substringAfterLast(a.toString())
            n3 = n3.substringAfterLast(a.toString())
            n4 = n4.substringAfterLast(a.toString())
            n5 = n5.substringAfterLast(a.toString())
            n6 = n6.substringAfterLast(a.toString())
            a++
        } else if (n2[0].toString() != a.toString() && n3[0].toString() != a.toString() && n4[0].toString() != a.toString() && n5[0].toString() != a.toString() && n6[0].toString() != a.toString())
            a++
        else return false
    }
    return true
}
fun minKrat():Int {
    var num = 1
    while (!check23456(num)) {
        num++
    }
    return num
}

fun main(args: Array<String>)
{
    //println(treangle())
    //println(sumProizveden())
    //println(minKrat())
}