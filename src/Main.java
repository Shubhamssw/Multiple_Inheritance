interface Swimming {
    void swim();
}

interface Flying {
    void fly();
}

class Bird implements Flying {
    @Override
    public void fly() {
        System.out.println("The bird flaps its wings and flies.");
    }
}

class Fish implements Swimming {
    @Override
    public void swim() {
        System.out.println("The fish swims by moving its tail and fins.");
    }
}

class Duck implements Flying, Swimming {
    @Override
    public void fly() {
        System.out.println("The duck flaps its wings and takes off into the sky.");
    }

    @Override
    public void swim() {
        System.out.println("The duck paddles in the water with its feet.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Fish fish = new Fish();
        Duck duck = new Duck();

        bird.fly();
        fish.swim();
        duck.fly();
        duck.swim();
    }
}
