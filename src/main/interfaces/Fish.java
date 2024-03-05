package interfaces;

public class Fish implements Swim {
    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
