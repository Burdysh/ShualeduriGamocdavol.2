import java.lang.NumberFormatException
import java.math.BigInteger
import java.util.*

//class Man
//{
//    fun think()
//    {
//        println("Real Thinking")
//    }
//}
//
//fun main(args: Array<String>)
//{
//    var mayank = Man()
//    mayank.think()
//}

open class Man
{
    open fun think()
    {
        println("Real Thinking")
    }
}

class Alien : Man()
{
    override fun think()
    {
        println("Virtual Thinking")
    }
}

fun main(args: Array<String>)
{
    var mayank : Man = Alien()
    mayank.think()
}
