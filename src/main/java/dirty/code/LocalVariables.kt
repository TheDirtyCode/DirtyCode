package dirty.code

class LocalVariables {
    // Declare variable inside classes
    var sum: Int = 0

    // DIRTY
    private fun dirty(first: Int, second: Int): Int {
        // Use the variable from the class even if you only need it inside the function
        sum = first + second
        return sum
    }

    // CLEAN
    private fun clean(first: Int, second: Int): Int {
        // Declare variables inside functions as long as you don't need them outside
        // the function
        // READ MORE: shared mutable values
        val sum = first + second
        return sum
    }

    private fun x() {
        clean(0, 0)
        clean(1, 1)
        dirty(0, 0)
        dirty(1, 1)
    }
}