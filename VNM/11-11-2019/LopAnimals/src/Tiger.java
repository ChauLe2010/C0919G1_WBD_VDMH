public class Tiger extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Tiger: Rooar!";
    }

    @Override
    public String howToEat() {
        return "could be alive";
    }
}
