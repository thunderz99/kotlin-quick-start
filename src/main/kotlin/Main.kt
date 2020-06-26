fun main(args: Array<String>) {

	println("""System.getenv("MESSAGE"): ${System.getenv("MESSAGE")} """)

	println("Begin sleep for 10 seconds...")
	Thread.sleep(10000)
	println("Hello world")
}
