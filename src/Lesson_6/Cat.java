package Lesson_6;

public class Cat extends Animals {
    public Cat() {
        this.animal = "Cat";
        this.maxRunDistance = random.nextInt(45) + 155;
        this.maxJumpHeight = 2.0;
    }

    @Override
    public void swim(int dist) {
        System.out.println("Cat's don't like water");
    }
}
