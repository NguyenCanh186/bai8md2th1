public class Chicken extends Animal implements Edible{
    public String makeSound(){
        return "o o o";
    }

    @Override
    public String howToEat() {
        return "an it";
    }
}
