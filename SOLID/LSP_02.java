package SOLID;

public class LSP_02 {

    public static class Bird {
        public void move() {
            System.out.println("The bird is moving...");
        }
    }

    public interface Flyable {
        void fly();
    }

    public static class Sparrow extends Bird implements Flyable {
        @Override
        public void fly() {
            System.out.println("The sparrow is flying...");
        }
    }

    public static class Penguin extends Bird {
        @Override
        public void move() {
            System.out.println("The penguin is swimming...");
        }
    }

    public static void moveBird(Bird bird) {
        bird.move();
    }

    public static void flyBird(Flyable bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        moveBird(sparrow);
        flyBird(sparrow);

        moveBird(penguin);
    }
}
