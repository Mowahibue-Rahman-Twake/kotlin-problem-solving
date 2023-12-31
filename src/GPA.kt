fun main() {
    print("Enter the student's score: ")
    val score = readLine()?.toIntOrNull()

    if (score != null) {
        val grade = when {
            score in 90..100 -> "A"
            score in 80..89 -> "B"
            score in 70..79 -> "C"
            score in 60..69 -> "D"
            score < 60 -> "F"
            else -> "Invalid score"
        }

        println("Grade: $grade")
    } else {
        println("Invalid input. Please enter a valid numeric score.")
    }
}
