package pattern.observer.study

import java.util.*


    fun main() {
        val teachers: List<Observer> = ArrayList(
            listOf(
                GraphTeacher(),
                ScoreTeacher()
            )
        )

        val students: List<Generator> = ArrayList<Generator>(
            Arrays.asList(
                Student("StudentA"),
                Student("StudentB"),
                Student("StudentC")
            )
        )

        for (student in students) {
            student.addObservers(teachers)
        }

        for (student in students) {
            (student as Student).work()
        }
    }
