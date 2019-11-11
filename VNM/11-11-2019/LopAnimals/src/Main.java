public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chickens();
        for (Animal animal:animals){
            System.out.println(animal.makeSound());

            if (animal instanceof Tiger){
                Edible edibler1 = (Tiger) animal;
                System.out.println(edibler1.howToEat());
            }

            if (animal instanceof Chickens) {
                Edible edibler = (Chickens) animal;
                System.out.println(edibler.howToEat());
            }



        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] =new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
