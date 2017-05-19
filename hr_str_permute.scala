import scala.io.StdIn.{readInt, readLine}

object Solution {
    def swapper(s1: String): String = {
        val idx1 = (0 until s1.size by 2)
        val idx2 = (1 until s1.size by 2)
        return idx2.zip(idx1).map(r => (s1(r._1).toString + s1(r._2).toString)).mkString

    }

    def main(args: Array[String]) {
        val n = readInt()
        for (i <- 0 until n){
            println(swapper(readLine()))
        }
    }
}
