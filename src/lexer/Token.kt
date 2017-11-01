package lexer

class Token(val col: Int, val row: Int, val value: String, val type: Pair) {
    override fun toString(): String {
        return "$col \t $row \t ${type.tokenType} \t ${type.tokenValue} \t\t $value"
    }
}