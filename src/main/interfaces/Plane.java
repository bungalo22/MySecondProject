package interfaces;

public class Plane implements Fly {
    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }
}
