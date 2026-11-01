# ☕ Java OOP Practice

My practice exercises for **object-oriented programming in Java**, written while I study OOP at university.
These are small learning programs, not production code.

## What's inside

| File | Concept | What it shows |
|---|---|---|
| [`src/BankAccount.java`](src/BankAccount.java) | Encapsulation | Private state, validation in methods, getters |
| [`src/Shapes.java`](src/Shapes.java) | Inheritance & polymorphism | Abstract `Shape`, `Circle` and `Rectangle` overriding `area()` |

## Run it

You need JDK 11 or newer.

```bash
cd src
javac BankAccount.java && java BankAccount
javac Shapes.java && java Shapes
```

Expected output:

```
After deposit: 1500.0
Withdraw 2000 allowed? false
Shahzaib's balance: 1200.0
```

```
Circle with area 12.57
Rectangle with area 12.00
```

## Next up

- [ ] Interfaces (`Comparable`, custom interfaces)
- [ ] Collections practice (`ArrayList`, `HashMap`)
- [ ] Design patterns: Singleton, Factory, Strategy

---
Learning in public 🌱
