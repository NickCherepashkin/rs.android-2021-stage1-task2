package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        if (b.isEmpty()) {
            return "YES"
        }

        var index = 0
        var result = ""
        for (symbol in a) {
            if (symbol.toUpperCase() == b[index]) {
                result += symbol
                index++

                if (index > b.length - 1)
                    return "YES"
            }
        }
        return if (result == b) "YES" else "NO"
    }
}