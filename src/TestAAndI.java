public class TestAAndI {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal: animals
             ) {
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }

        fruit[] fruits = new fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (fruit a: fruits
             ) {
            System.out.println(a.howToEat());
        }
    }
}
