# Simple RPG Game in Kotlin

## Seminar Outcomes

In this seminar, you will implement a simple RPG game in Kotlin, where multiple characters can battle with each other. This exercise will cover the following concepts:

- Class hierarchy and inheritance
- Interfaces and polymorphism
- Iterable implementation

## Overview

Each RPG game consists of multiple characters, each with unique features. Additionally, they have their own inventory containing items such as armor, weapons, elixirs, and more, which affect their abilities. We will implement both the character system and the inventory system, then simulate a battle between these characters.

---

## Task 1: Character System

### Task 1.1: Create a Base Class

Define a base class `GameCharacter` that will serve as the foundation for different types of fighters.

**Requirements:**

The class should store the following properties:

- `name: String`
- `health: Int`
- `damage: Int`
- `inventory: Inventory`

**Methods to implement:**

- `isAlive()`: Returns `true` if health is greater than zero.
- `attack(target: GameCharacter)`: Deals damage to another character.
- `defend(incomingDamage: Int)`: Defines how much damage a character takes.

### Task 1.2: Implement Subclasses

Create two subclasses of `GameCharacter` representing different fighter types:

#### **Warrior**
- Starts with **100 HP** and **10 DMG**.
- Takes **20% less damage** when defending.

#### **Mage**
- Starts with **70 HP** and **15 DMG**.
- Takes **full damage** when defending.

Each class should override:

- `attack(target: GameCharacter)`: Prints an attack message.
- `defend(incomingDamage: Int)`: Modifies damage taken.

### Bonus Task

Consider a scenario where not all characters should have combat abilities. Introduce a **Citizen** class—a character without fighting behavior. Discuss the idea with the TA before implementing it.

---

## Task 2: Implement the Item System

Define an abstract class `Item` with different item types:

- **Weapon**: Increases damage when equipped.
- **Armor**: Increases health when equipped.
- **Elixir**: Restores health or increases damage.

---

## Task 3: Inventory System

In any RPG game, players have an inventory where they store items like weapons, elixirs, and more. Let’s provide such functionality to our characters.

### Task 3.1: Define the `Item` Class

Define a class `Item` with the following properties:

- `id: Int`
- `name: String`
- `effect: String`

### Task 3.2: Create the `Inventory` Class

Implement an `Inventory` class that:

- Holds a collection of `Item` objects.
- Implements `Iterable<Item>` to allow iteration over items.

---

## Task 4: Implement the Inventory System

Extend the `Inventory` class with the following functionalities:

- `addItem(item: Item)`: Adds an item to the inventory.
- `removeItem(item: Item)`: Removes an item from the inventory.
- `hasItems()`: Returns `true` if there are items in the inventory.
- `getRandomItem()`: Returns a random item from the inventory.

---

## Bonus Tasks

- **Enhance Inventory Organization**: Organize items based on their type. Store all elixirs in one container, all weapons in another, etc.
- **Fix Logical Errors in the `Battle` Class**: Identify and resolve issues related to how new equipment is used. Discuss your findings with the TA.
- **Battle Royale Mode**: Modify the `Battle` class (you can name it `BattleRoyal`) to allow multiple characters to fight until only one remains.
