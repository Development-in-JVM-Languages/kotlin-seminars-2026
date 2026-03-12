# JSON Serialization

Serialization is the process of converting an object into a format that can be stored or transmitted and later reconstructed. In this seminar, we will implement a toJson function in Kotlin to serialize objects into JSON format.

## Objective:

* Implement a `toJson` function for serializing Kotlin objects to **JSON**.

* Handle primitive data types, collections, and maps.

* Use reflection to extract object properties.

* Support custom annotations for renaming fields and ignoring properties.

## Instructions

1. **Implement the `objectToJson` function**:
  - Use reflection to get the list of properties from the class.
  - Use the [`joinToString`](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/join-to-string.html) function to join property-value pairs into a JSON-like structure.

2. **Implement the `valueToJson` function**:
  - Handle different types of values (e.g., numbers, strings, collections).
  - Ensure proper formatting for JSON, like wrapping strings in quotes.

<!-- 3. **Implement Annotations**: -->
   <!-- - Uncomment annotation definitions and their usage in the `Creature` class -->

## Expected result from running the main function

```json
{"attack": 2, "cost": {"ANY": 3, "FOREST": 2}, "defence": 4, "name": "Cockatrice", "traits": ["FLYING"]}
```

Or the pretty-printed version:

```json
{
    "attack": 2,
    "cost": {
        "ANY": 3,
        "FOREST": 2
    },
    "defence": 4,
    "name": "Cockatrice",
    "traits": ["FLYING"]
}
```
