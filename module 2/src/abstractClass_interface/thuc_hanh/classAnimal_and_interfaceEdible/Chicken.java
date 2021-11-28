package abstractClass_interface.thuc_hanh.classAnimal_and_interfaceEdible;
import abstractClass_interface.thuc_hanh.classAnimal_and_interfaceEdible.edible.Edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    public String howToEat() {
        return "Could be fried";
    }
}
