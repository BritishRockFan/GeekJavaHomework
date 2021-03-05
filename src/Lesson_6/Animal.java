package Lesson_6;

import java.util.Random;

class Animals {
    int maxRunDistance;
    int maxSwimDistance;
    double maxJumpHeight;
    Random random = new Random();
    String animal;
    
    void run(int dist) {
        if (this.maxRunDistance >= dist) {
            System.out.println(this.animal + " can run " + dist + " m.");
        } else
            System.out.println(this.animal + " can't run so far.");
    }

    public void swim(int dist) {
        if (this.maxSwimDistance >= dist) {
            System.out.println(this.animal + " can swim " + dist + " m.");
        } else
            System.out.println(this.animal + " can't swim so far.");
    }

    void jump(double height) {
        if (this.maxJumpHeight >= height){
            System.out.println(this.animal + " can jump " + height + " m.");
        } else
            System.out.println(this.animal + " can't jump so high");
    }

    void info() {
        System.out.println(this.animal + " Run " + this.maxRunDistance + " m., Swim " + this.maxSwimDistance + " m., " +
                "Jump " + this.maxJumpHeight + " m.");
    }
}
