import scala.io.StdIn.{readInt, readLine}
import scala.collection.mutable.ListBuffer

object Solution {

    def main(args: Array[String]) {
        val lb = new ListBuffer[String]()
        val n = readInt();
        for(i <- 0 until n){
            lb.append(readLine());
        }
        val in_strs = lb.toList.groupBy(identity).mapValues(_.size);
        val n_q = readInt();
        for(i <- 0 until n_q){
            var q = readLine();
            try {
                println(in_strs(q))
            } catch {
                case e: NoSuchElementException => println(0)
            }
        }
        
    }
}
