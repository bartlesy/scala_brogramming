/*
import scala.io.StdIn.readLine


object Solution {

    def mingle(str1: String, str2: String): String = {
        return str1.zip(str2)
                .map(r => (r._1.toString + r._2.toString))
                .reduce((a, b) => a + b)
    }

    def main(args: Array[String]) {
        val s1 = readLine()
        val s2 = readLine()
        println(mingle(s1, s2))
        return
    }
}
*/

import scala.io.StdIn.readLine


object Solution {

    def mingle(str1: String, str2: String): Unit = {
        str1.zip(str2).foreach(r=> print("%s%s".format(r._1, r._2)))
    //def mingle(str1: String, str2: String): String = {
        //return str1.zip(str2)
        //        .map(r => (r._1.toString + r._2.toString))
        //        .mkString
        //        //.reduce((a, b) => a + b)
    }

    def main(args: Array[String]) {
        val s1 = readLine()
        val s2 = readLine()
        mingle(s1, s2)
        //println(mingle(s1, s2))
        return
    }
}
