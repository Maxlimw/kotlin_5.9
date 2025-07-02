abstract class Animal(val name: String, val height: Double, val weight: Double) {
    abstract val foodPreferences: List<String>
    private var isFull = false

    fun eat(food: String) {
        if (food in foodPreferences) {
            isFull = true
            println("$name съел(а) $food и теперь сыт(а)!")
        } else {
            println("$name не хочет есть $food.")
        }
    }

    abstract class CarnivorousAnimal(name: String, height: Double, weight: Double) : Animal(name, height, weight) {
        override val foodPreferences = listOf("мясо", "птица", "рыба")
    }

    abstract class HerbivorousAnimal(name: String, height: Double, weight: Double) : Animal(name, height, weight) {
        override val foodPreferences = listOf("трава", "листья", "фрукты", "овощи")
    }

    abstract class OmnivorousAnimal(name: String, height: Double, weight: Double) : Animal(name, height, weight) {
        override val foodPreferences = listOf("мясо", "трава", "листья", "фрукты", "овощи")
    }

    class Lion(name: String, height: Double, weight: Double) : CarnivorousAnimal(name, height, weight)

    class Tiger(name: String, height: Double, weight: Double) : CarnivorousAnimal(name, height, weight)

    class Hippopotamus(name: String, height: Double, weight: Double) : HerbivorousAnimal(name, height, weight)

    class Wolf(name: String, height: Double, weight: Double) : CarnivorousAnimal(name, height, weight)

    class Giraffe(name: String, height: Double, weight: Double) : HerbivorousAnimal(name, height, weight)

    class Elephant(name: String, height: Double, weight: Double) : HerbivorousAnimal(name, height, weight)

    class Chimpanzee(name: String, height: Double, weight: Double) : OmnivorousAnimal(name, height, weight)

    class Gorilla(name: String, height: Double, weight: Double) : HerbivorousAnimal(name, height, weight)
}