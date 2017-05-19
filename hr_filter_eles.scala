import scala.io.StdIn.{readLine, readInt}
object Solution {

    def filter_elements(arr: Array[Int], tar: Int): Array[Int] = {
        val counts = arr.map(i => arr.filter(_ == i).size)
        return arr.zip(counts).filter(_._2 >= tar).map(_._1).distinct
    }

    def main(args: Array[String]) {
        val n_cases = readInt()
        for (i <- 0 until n_cases) {
            var n_tar = readLine().split(' ')
            var n_ele = n_tar(0).toInt
            var tar_filter = n_tar(1).toInt
            var res = filter_elements(readLine.split(' ').map(_.toInt), tar_filter)
            if (res.size > 0) println(res.mkString(" "))
            else println(-1)
        }
    }
}

import scala.io.StdIn.{readLine, readInt}
object Solution {
    
    def filter_elements(arr: Array[Int], tar: Int): Array[Int] = {
        val counts = arr.groupBy(identity).mapValues(_.size)
        return arr.filter(i => counts(i) >= tar).distinct
    }

    def main(args: Array[String]) { 
        val n_cases = readInt()
        for (i <- 0 until n_cases) {
            var n_tar = readLine().split(' ')
            var n_ele = n_tar(0).toInt
            var tar_filter = n_tar(1).toInt
            var res = filter_elements(readLine.split(' ').map(_.toInt), tar_filter)
            if (res.size > 0) println(res.mkString(" "))
            else println(-1)               
        }
    }
}
