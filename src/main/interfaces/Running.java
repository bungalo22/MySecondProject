package interfaces;

public class Running {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Plane plane = new Plane();
        Fish fish = new Fish();

        Swim[] swims = {duck, fish};
        for (Swim pool : swims) {
            pool.swim();
        }
        Fly[] flies = {plane, duck};
        for (Fly sky : flies) {
            sky.fly();
        }

    }
}
