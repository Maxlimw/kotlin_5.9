open class Animal(val name: String, val height: Double, val weight: Double) {
    protected open val foodPreferences: List<String> = emptyList()
    private var isFull = false

    fun eat(food: String) {
        if (food in foodPreferences) {
            isFull = true
            println("$name съел(а) $food и теперь сыт(а)!")
        } else {
            println("$name не хочет есть $food.")
        }
    }
}

class Lion(name: String, height: Double, weight: Double) : Animal(name, height, weight) {
    override val foodPreferences = listOf("мясо", "антилопа")
}

class Tiger(name: String, height: Double, weight: Double) : Animal(name, height, weight) {
    override val foodPreferences = listOf("мясо", "олень")
}

class Hippopotamus(name: String, height: Double, weight: Double) : Animal(name, height, weight) {
    override val foodPreferences = listOf("трава", "фрукты")
}

class Wolf(name: String, height: Double, weight: Double) : Animal(name, height, weight) {
    override val foodPreferences = listOf("мясо", "рыба")
}

class Giraffe(name: String, height: Double, weight: Double) : Animal(name, height, weight) {
    override val foodPreferences = listOf("листья", "ветки")
}

class Elephant(name: String, height: Double, weight: Double) : Animal(name, height, weight) {
    override val foodPreferences = listOf("трава", "фрукты", "овощи")
}

class Chimpanzee(name: String, height: Double, weight: Double) : Animal(name, height, weight) {
    override val foodPreferences = listOf("фрукты", "орехи", "листья")
}

class Gorilla(name: String, height: Double, weight: Double) : Animal(name, height, weight) {
    override val foodPreferences = listOf("листья", "ветки", "фрукты")
}