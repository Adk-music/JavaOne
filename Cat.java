package geekbrains.lessons.lessonfive;

public class Cat extends Animal {

    Cat(int running, int swimming, double jumping){
        super(running,swimming,jumping);
    }
    @Override
    protected void run(int length) {
        if (length <= running) {
            System.out.println("Kitty run "+ length + " metre");
        }
    }

    @Override
    protected void swim(int length1) {
        System.out.println("Kitty can't swim");
    }
 // Вариант если кошечка плавает, все таки такие есть.
 /*
 @Override
    protected void swim(int length1) {
       if (length1 <= swimming)
        System.out.println("Kitty swim " + swimming + " metre");
    } else { System.out.println("Kitty can't swim");
    }
   */

    @Override
    protected void jump(double high) {
        if (high <= jumping){
            System.out.println("Kitty jump " + high + " metre");
        }

    }
}
