fun main(args: Array<String>) {
    //elvis operator ?:
    var maybeNumber: String? = "Hello world"
    println(maybeNumber?.length ?: 0)
}