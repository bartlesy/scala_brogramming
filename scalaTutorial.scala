object scalaTutorial {
    def main(args: Array[String]){
        var i = 0

        while (i <= 10){
            println(i)
            i += 1
        }

        for (i <- 11 to 20){
            println(i)
        }

        val watup = "nuggggets"

        for (i <- 0 until watup.length){
            println(watup(i))
        }

        for (i <- watup){
            println(i)
        }

        val a_list = List(4, 2, 0, 6, 9)
        for (i <- a_list){
            println(i)
        }

        val evenList = for {i <- 1 to 20
            if i % 2 == 0
            } yield i

        println(evenList)

    }
}

