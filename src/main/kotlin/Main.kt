fun main() {
    val animals = listOf(
        Lion("Лео", 1.2, 190.5),
        Tiger("Тигруля", 1.1, 220.0),
        Hippopotamus("Гиппо", 1.6, 3000.0),
        Wolf("Серый", 0.8, 40.0),
        Giraffe("Жора", 5.5, 1200.0),
        Elephant("Дамбо", 3.5, 5000.0),
        Chimpanzee("Чим", 1.3, 70.0),
        Gorilla("Гор", 1.8, 180.0)
    )

    for (animal in animals) {
        animal.eat("мясо")
    }

    val availableFoods = arrayOf("мясо", "трава", "листья", "яблоки", "овощи")

    feedAnimals(animals, availableFoods)
}
