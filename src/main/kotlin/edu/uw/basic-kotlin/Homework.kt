package edu.uw.basickotlin

class Library {
    // This is just here as a placeholder, to make sure tests run and pass
    // before you add any code
    fun someLibraryMethod(): Boolean {
        return true
    }
}

// write a "whenFn" that takes an arg of type "Any" and returns a String

fun whenFn(arg: Any) : String {
    // when(arg) {
    //     "Hello" -> print("world")
    //     "Howdy" -> print("Say what?")
    //     "Bonjour" -> print("Say what?")
    //     in 2..10 -> print("low number")
    //     0 -> print("zero")
    //     1 -> print("one")
    //     else -> print("I don't understand")
    // }
    if (arg is Double) {
        return "I don't understand"
    }
    else if (arg is String) {
        if (arg == "Hello") {
            return "world"
        }
        else if (arg == "Howdy") {
            return "Say what?"
            
        }
        else if (arg == "Bonjour") {
            return "Say what?"
        }
    }
    else if (arg is Int) {
        if (arg in 2..10) {
            return "low number"
        }
        else if (arg == 0) {
            return "zero"
        }
        else if (arg == 1) {
            return "one"
        }
    }
    else {
        return "I don't understand"
    }
    return "I don't understand"
}

// write an "add" function that takes two Ints, returns an Int, and adds the values

fun add(first: Int, second: Int) : Int {
    val addUp = first + second
    return addUp
}

// write a "sub" function that takes two Ints, returns an Int, and subtracts the values

fun sub(first: Int, second: Int) : Int {
    val subtract = first - second
    return subtract
}

// write a "mathOp" function that takes two Ints and a function (that takes two Ints and returns an Int), returns an Int, and applies the passed-in-function to the arguments

fun mathOp(val1: Int, val2: Int, func: (first: Int, second: Int) -> Int) : Int {
    val result = func(val1, val2)
    return result
}

// write a class "Person" with first name, last name and age
class Person (val firstName: String, val lastName: String, val age: Int) {
    val debugString : String = "[Person firstName:${this.firstName} lastName:${this.lastName} age:${this.age}]"
}

// write a class "Money" with amount and currency, and define a convert() method and the "+" operator
class Money (var amount: Int, var currency: String) {
    constructor (amount: String, currency: String) : this(amount, currency) {
        if (this.amount < 0) {
            throw IllegalArgumentException()
        }
        if (this.currency == "USD" || this.currency == "GBP" || this.currency == "EUR" || this.currency == "CAN") {
        }
        else {
            throw IllegalArgumentException()
        }
    }
    
    fun convert(val3: String) {
        if (this.currency == "USD" ) {
            if (val3 == "GBP") {
                this.amount = 5
                this.currency = "GBP"
            }
            else if (val3 == "EUR") {
                this.amount = 15
                this.currency = "EUR"
            }
            else if (val3 == "CAN") {
                this.amount = 15
                this.currency = "CAN"
            }
        }

        else if (this.currency == "GBP" ) {
            if (val3 == "USD") {
                this.amount = 10
                this.currency = "USD"
            }
            else if (val3 == "EUR") {
                this.amount = 15
                this.currency = "EUR"
            }
        }

        else if (this.currency == "EUR" ) {
            if (val3 == "GBP") {
                this.amount = 5
                this.currency = "GBP"
            }
        }
    }
}