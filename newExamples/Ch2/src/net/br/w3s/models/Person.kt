package net.br.w3s.models

class Person {

  private var firstName: String
  private var lastName: String

  constructor(firstName: String, lastName: String) {
    this.firstName = firstName
    this.lastName = lastName
  }

  protected fun getFirstName(): String {
    return this.firstName
  }

  protected fun getLastName(): String {
    return this.lastName
  }

  public fun getName(): String {
    return "${this.getFirstName()} ${this.getLastName()}"
  }
  
}

class Person2(firstName: String, lastName: String) {
  private var firstName = firstName
  private var lastName = lastName

  public fun getName(): String {
    return "${this.firstName} ${this.lastName}"
  }
}

class Person3(firstName: String, lastName: String, old: Int?) {
  private val name: String
  private val age: Int?

  init {
    this.name = "$firstName $lastName"
    this.age = old
  }

  public fun getInfo(): String {
    return "${this.name} ${this.age}"
  }

}