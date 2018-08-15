object App{
    def main(){

        var listsz = List(4, 2, 0, 6, 9)

        def watup(x: List[Int]): Unit = {
            for (n <- x){
                println(n)
            }
        }

        watup(listsz)

        /*
        * anonymous function format
        */

        listsz.foreach{item: Int => println(item)}

        val summed_list = listsz.reduce((a, b) => a + b)
        println(summed_list)
    }
}

