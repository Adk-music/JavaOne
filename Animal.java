package geekbrains.lessons.lessonfive;

public abstract class Animal {
    protected int running;
    protected int swimming;
    protected double jumping;

    Animal (int running, int swimming, double jumping) {
        this.running = running;
        this.swimming = swimming;
        this.jumping = jumping;

    }

    protected abstract void run(int length);
    protected abstract void swim(int length1);
    protected abstract void jump(double hight);
}
