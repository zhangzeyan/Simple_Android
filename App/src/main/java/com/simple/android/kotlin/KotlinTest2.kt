package com.simple.android.kotlin

/**
 * @fileName:
 * *
 * @author: zhangzeyan
 * *
 * @date: 2017/6/22
 * *
 * @time: 下午10:34
 * *
 * @description:
 */


class KotlinTest2 {

    fun printNumbers(vararg numbers: Int) {
        for (number in numbers) {
            //print(number)
        }
    }


    fun main(args: Array<String>) {
        val kt = KotlinTest2()
        kt.printNumbers(1, 2, 3, 4, 5, 6)

        val a: Int = 10000
        println(a === a) // true，值相等，对象地址相等

        //经过了装箱，创建了两个不同的对象
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a

        //虽然经过了装箱，但是值是相等的，都是10000
        println(boxedA === anotherBoxedA) //  false，值相等，对象地址不一样
        println(boxedA == anotherBoxedA) // true，值相等


        val b: Byte = 1 // OK, 字面值是静态检测的
        val i: Int = b.toInt() // OK
    }


    fun decimalDigitValue(c: Char): Int {
        if (c !in '0'..'9')
            throw IllegalArgumentException("Out of range")
        return c.toInt() - '0'.toInt() // 显式转换为数字
    }


    fun main1(args: Array<String>) {
        val text = """
    多行字符串
    多行字符串
    """.trimMargin()
        println(text)   // 输出有一些前置空格
    }

}
