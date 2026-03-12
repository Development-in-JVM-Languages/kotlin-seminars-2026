package json_serialization

import kotlin.reflect.full.memberProperties

class Creature(
    val name: String,
    val attack: Int,
    val defence: Int,
    val traits: List<Trait>,
    val cost: Map<Element, Int>
)

enum class Element {
    FOREST, ANY
}

enum class Trait {
    FLYING
}

fun Any.toJson(): String {
    return objectToJson(this)
}

private fun objectToJson(any: Any): String {
    TODO("Logic for serializing objects")
    // Use valueToJson, iterableToJson and mapToJson functions here
}

private fun valueToJson(value: Any?): String {
    TODO("Logic for serializing values")
}

private fun iterableToJson(any: Iterable<*>): String {
    TODO("Logic for serializing Iterable")
}

private fun mapToJson(any: Map<*, *>): String {
    TODO("Logic for serializing Map")
}

fun main() {
    val creature = Creature(
        name = "Cockatrice",
        attack = 2,
        defence = 4,
        traits = listOf(Trait.FLYING),
        cost = mapOf(
            Element.ANY to 3,
            Element.FOREST to 2
        )
    )
    println(creature.toJson())
    // {"attack": 2, "cost": {"ANY": 3, "FOREST": 2}, "defence": 4, "name": "Cockatrice", "traits": ["FLYING"]}
}
