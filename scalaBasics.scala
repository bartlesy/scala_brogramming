case class Patient(val name: String, val id: Int)

def main(){
    val patient = new Patient("Bob", 1)

	println(patient)

	val payment:Any = 21
	payment match {
		case p: String => println("payment is a String")
		case p: Int if p > 30 => println("payment > 30")
		case p: Int if p == 0 => println("zero payment")
		case _ => println("otherwise")
	}


	patient match {case Patient("Bob", id) => println(s"matching id is $id")}
}

main()
