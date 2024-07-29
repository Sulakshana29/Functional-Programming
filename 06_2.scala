import scala.io.StdIn._

object StudentRecords {

  // Function to validate user input
  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty"))
    } else if (marks < 0 || marks > totalMarks) {
      (false, Some("Marks must be a positive integer not exceeding the total possible marks"))
    } else {
      (true, None)
    }
  }

  // Function to get student info
  def getStudentInfo(): (String, Int, Int, Double, Char) = {
    println("Enter student name:")
    val name = readLine()

    println("Enter student marks:")
    val marks = readInt()

    println("Enter total possible marks:")
    val totalMarks = readInt()

    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = if (percentage >= 90) 'A'
                else if (percentage >= 75) 'B'
                else if (percentage >= 50) 'C'
                else 'D'

    (name, marks, totalMarks, percentage, grade)
  }

  // Function to get student info with retries
  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    var validInput = false
    var studentInfo: (String, Int, Int, Double, Char) = null

    while (!validInput) {
      val info = getStudentInfo()
      validateInput(info._1, info._2, info._3) match {
        case (true, None) =>
          studentInfo = info
          validInput = true
        case (false, Some(errorMessage)) =>
          println(s"Invalid input: $errorMessage. Please try again.")
        // Handle logically impossible cases to make the match exhaustive
        case (true, Some(_)) =>
          println("Unexpected valid input with error message. Please try again.")
        case (false, None) =>
          println("Unexpected invalid input without error message. Please try again.")
      }
    }

    studentInfo
  }

  // Function to print student record
  def printStudentRecord(student: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = student
    println(s"Student Name: $name")
    println(s"Marks: $marks / $totalMarks")
    println(f"Percentage: $percentage%.2f%%")
    println(s"Grade: $grade")
  }

  def main(args: Array[String]): Unit = {
    val student = getStudentInfoWithRetry()
    printStudentRecord(student)
  }
}
