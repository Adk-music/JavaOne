package geekbrains.lessons.lessonfive;

public class Bird extends Animal {

    Bird(int running, int swimming, double jumping){
        super(running,swimming,jumping);
    }

    @Override
    protected void run(int length) {
        if (length <= running) {
            System.out.println("Bird run " + length + " metre");
        }
    }

    @Override
    protected void swim(int length1) {
        System.out.println("Bird can't swim");
    }
    // Вариант если птичка плавает(утка например)
 /*
 @Override
    protected void swim(int length1) {
       if (length1 <= swimming)
        System.out.println("Bird swim " + swimming + " metre");
    } else { System.out.println("Bird can't swim");
    }
   */

    @Override
    protected void jump(double high) {
        if (high <= jumping){
            System.out.println("Bird jump " + high + " metre");
        }

    }

}