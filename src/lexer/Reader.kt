package lexer

import java.io.BufferedReader
import java.io.FileReader

class Reader(fileName: String) {
    val bufferedReader = BufferedReader(FileReader(fileName))
    var currentString : String = ""
    var posX: Int = 0
    var posY: Int = 0

    fun getChar() : Char {
        if (currentString.length - posY <= 0) {
            if (bufferedReader.ready()) {
                currentString = bufferedReader.readLine()
                posX++
                posY = 0
            }
            else return '\0'
        }
        return if (!currentString.equals("")) currentString[posY++] else '\n'
    }

}