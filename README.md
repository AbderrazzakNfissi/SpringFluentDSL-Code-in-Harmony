# SpringFluentDSL-Code-in-Harmony : DSL for Generating Spring Boot REST APIs 🌱💻

Hey Coding Enthusiasts! 🚀 Welcome to an exciting project that's about to revolutionize the way we create Spring Boot REST APIs. This isn't just another app; it's a journey into the world of **Domain-Specific Language (DSL) for Generating Spring Boot REST APIs**. Buckle up for a coding adventure like never before! 🌟✨

<img width="218" alt="image" src="https://github.com/AbderrazzakNfissi/SpringFluentDSL-Code-in-Harmony/assets/110425764/496f30bf-cd5a-4b9f-9247-a55775405b92">

## Introduction

Creating Spring Boot APIs is about to become as delightful as choosing your favorite ice cream flavor. 🍦 We're not just building an app; we're creating a language, a DSL that will make Spring Boot dance to our commands! 🌐💃

## Language Design with Xtext

Our superhero for this journey is **Xtext**, the maestro of language creation. With Xtext, we'll design a language so slick, it'll feel like conversing in emojis with our computers. 🤖💬

## Sneak Peek into the DSL

Imagine crafting APIs with a few lines of magic code:

```c

prefix: "api/v1"
app_name: "appName"

dependencies {
  SpringDataJpa,
  DevTools,
  Lombok,
  SpringSecurity,
  SpringWeb,
  MySQLDriver,
  SpringWebServices
  
}

entities {
  entity Person {
    ops: "crud" // Operations c: create, r: read, u: update, d: delete
    id: Long pk // Primary key
    name: String
    age: Integer
  }

  entity Address {
  	ops: "crud"
    id: Long pk
    street: String
    city: String
    person: Person oto
  }

  //Utilisation de l'héritage (Single Table Strategy)
  entity Employee extends[strategy=SingleTable] Person{
    ops: "cru"
    id : Long pk
    salary: Double
  }

  entity Bank {
    ops: "cr" // Operations c: create, r: read, u: update, d: delete or none
    id: Long pk // Primary key
    name: String
    location: String
    // Relation ManyToOne
    employees: Employee mto
  }

  entity Customer {
    ops: "cru"
    id: Integer pk
    address: String
    accountNumber: Integer
    // Relation OneToMany
    transactions: Transaction otm
  }
  
  entity Transaction{
  	ops : "crud"
  	id : Long pk
  }
}


```

Exciting, isn't it? We'll be creating entities like Bank and Customer, and our DSL will effortlessly handle all CRUD operations. It's like programming with a magic wand! 🪄✨

## Workflow Magic

1. **DSL Creation with Xtext:** Craft our language using Xtext, turning our ideas into spells that our app will understand.

2. **Code Generation with Xtend:** Let Xtext work its wizardry, transforming our language into real, working code using Xtend.

3. **Implementation and Testing:** Fine-tune the generated code, make it future-proof, and witness our APIs come to life!

4. **Generate the Spring Boot App:** Hit a button, and voila! Our Spring Boot app will be generated and ready for action. 🚀

## Peek into the Generated Spring Boot Project Structure

```lua
DemoApp/
|-- src/
|   |-- main/
|       |-- java/
|       |   |-- com/
|       |       |-- demoapp/
|       |           |-- controllers/
|       |           |   |-- BankController.java
|       |           |   |-- CustomerController.java
|       |           |-- entities/
|       |           |   |-- Bank.java
|       |           |   |-- Customer.java
|       |           |-- services/
|       |               |-- BankService.java
|       |               |-- CustomerService.java
|       |           |-- repositories/
|       |               |-- BankRepository.java
|       |               |-- CustomerRepository.java
|       |           |-- exceptions/
|       |               |-- BankNotFoundException.java
|       |               |-- CustomerNotFoundException.java
|       |           |-- AppNameApplication.java
|       |-- resources/
|           |-- application.properties
|
|-- target/
|-- pom.xml
|-- README.md
```

This is just a glimpse - our generated Spring Boot project will have controllers, models, services, repositories, and everything neatly organized. Ready to take over the coding universe!

## 🔧 Technical architecture

![architecture__technique drawio](https://github.com/AbderrazzakNfissi/SpringFluentDSL-Code-in-Harmony/assets/110425764/34743d64-9e08-4250-8be1-83a8e6bf7446)

## Meta Model of SpringFluentDSL :)

![SpringFluentDS_Meta_Model](https://github.com/AbderrazzakNfissi/SpringFluentDSL-Code-in-Harmony/assets/110425764/8c30516d-8a9a-4802-ae68-28ce6196f83c)


## Getting Started

1. Clone this repository.
2. Follow the instructions in the [DSL Creation Guide](docs/DSL_CREATION_GUIDE.md) to create your own DSL.
3. Run the generated code and witness the magic!

## Contribution

We welcome contributions from the coding community! Fork the repository, create a branch, and make your improvements. Submit a pull request, and let's build this DSL together!

So, are you ready to dive into the future of coding with us? 🚀👩‍💻👨‍💻 Let's make this DSL project the coolest thing in the coding universe! Cheers to the future and our coding escapades! 🥂🌌
