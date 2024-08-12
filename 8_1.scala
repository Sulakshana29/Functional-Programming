import scala.io.StdIn._

object CaesarCipher {
  // Function to encrypt text using Caesar cipher
  def encrypt(plaintext: String, shift: Int): String = {
    plaintext.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        val shiftedChar = (base + (char - base + shift) % 26).toChar
        shiftedChar
      } else {
        char
      }
    }
  }

  // Function to decrypt text using Caesar cipher
  def decrypt(ciphertext: String, shift: Int): String = {
    ciphertext.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        val shiftedChar = (base + (char - base - shift + 26) % 26).toChar
        shiftedChar
      } else {
        char
      }
    }
  }

  // Function to process data using either encryption or decryption
  def cipher(text: String, shift: Int, mode: String): String = {
    mode.toLowerCase match {
      case "encrypt" => encrypt(text, shift)
      case "decrypt" => decrypt(text, shift)
      case _ => throw new IllegalArgumentException("Invalid mode. Use 'encrypt' or 'decrypt'.")
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter the text:")
    val text = readLine()

    println("Enter the shift value:")
    val shift = readInt()

    println("Enter the mode (encrypt/decrypt):")
    val mode = readLine()

    try {
      val result = cipher(text, shift, mode)
      println(s"Result: $result")
    } catch {
      case e: IllegalArgumentException => println(e.getMessage)
    }
  }
}
