package geekbrains.lessons.lessonfive;

public class Horse extends Animal {

    Horse(int running, int swimming, double jumping){
        super(running,swimming,jumping);
    }

    @Override
    protected void run(int length) {
        if (length <= running) {
            System.out.println("Horse run"+ length + " metre");
        }
    }

    @Override
    protected void swim(int length1) {
        if (length1 <= swimming)
            System.out.println("Horse swim " + length1 + " metre");
    }

    @Override
    protected void jump(double high) {
        if (high <= jumping){
            System.out.println("Horse jump " + high + " metre");
        }

    }

}

