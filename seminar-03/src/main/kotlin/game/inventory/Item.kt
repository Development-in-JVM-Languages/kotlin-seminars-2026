package game.inventory

abstract class Item(open val name: String) {
    abstract fun use(character: GameCharacter)
}
