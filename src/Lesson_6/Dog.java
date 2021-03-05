package Lesson_6;

public class Dog extends Animals {//наследующий класс

    public Dog() {
        this.animal = "Dog";
        this.maxRunDistance = random.nextInt(300) + 300;
        this.maxSwimDistance = random.nextInt(6) + 5;
        this.maxJumpHeight = Math.random() * 0.7 + 0.1;
    }
}