import scala.annotation.tailrec
import scala.io.StdIn.readLine
    
object Solution {
    def make_p(n: BigInt, k: Int): BigInt = {
        return BigInt(n.toString.map(_.asDigit).sum) * k
    }
    
    def superdigit(p: BigInt): Int = {
        return (1 + (p - 1) % 9).toInt
    }
    

    def main(args: Array[String]) {
        val nk = readLine().split(" ")
        val n = BigInt(nk(0))
        val k = nk(1).toInt
        val p = make_p(n, k)
        println(superdigit(p))
    }
}
    
/*
object Solution {
    def make_p(n: String, k: Int): String = {
        return n * k
    }
    
    @tailrec
    def superdigit(p: String): Int = {
        if (p.size == 1) return p.toInt
        val new_p = p.map(_.asDigit).sum.toString
        return superdigit(new_p)
    }
    

    def main(args: Array[String]) {
        val nk = readLine().split(" ")
        val n = nk(0)
        val k = nk(1).toInt
        val p = make_p(n, k)
        println(superdigit(p))
    }
}
*/

