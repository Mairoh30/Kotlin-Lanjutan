fun main(args: Array<String>) {
    //nullable types
    var maybeNumber: Int? = 15
    maybeNumber = null
    println("maybeNumber: $maybeNumber ${maybeNumber?.hashCode()}")
}