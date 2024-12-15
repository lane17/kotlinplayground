package com.playground.chapter04.c441

object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary() {
        for (person in allEmployees) {
        }
    }
}

fun main() {
    Payroll.allEmployees.add(Person("person1"))
    Payroll.calculateSalary()
}
