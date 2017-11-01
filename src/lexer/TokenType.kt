package lexer

enum class TokenType(val value: String = "") {
    IDENTIFIER,
    KEYWORD,
    OPERATOR,
    SEPARATOR,
    INTEGER,
    DOUBLE,
    STRING,
    HEX,
    CHARACTER,
    END_OF_FILE,
    UNDEFINED,
    DIRECTIVE
}