# Java OOP Journey

## Week 1 — Bank Account System

### What I built
A Bank Account System built from scratch in Java demonstrating 
core OOP concepts.

### Project structure

src/
├── model/
│   ├── Transaction.java
│   ├── BankAccount.java
│   └── SavingsAccount.java
├── exception/
│   └── InsufficientFundsException.java
└── Main.java


### Concepts covered
- Encapsulation — private fields, getters/setters
- Constructors — overloading, chaining with this()
- Access modifiers — private, protected, public
- static vs instance — totalAccounts shared counter
- Immutability — final fields on Transaction
- Custom exceptions — checked vs unchecked
- Inheritance — SavingsAccount extends BankAccount
- Polymorphism — List<BankAccount> holding mixed types