package geekbrains.lessons.lessonfive;

public class Main {

    public static void main(String[] args) {
       Animal c = new Cat(200,0,2.0);
       Animal d = new Dog(500,10,0.5);
       Animal h = new Horse(1500,100,3.0);
       Animal b = new Bird(5,0,0.2);
       Dog dog = new Dog(600,5,1);

        c.jump(1); c.swim(1);
        d.jump(0.3); d.swim(2);
        h.jump(2); h.swim(3);
        b.jump(0.1); b.swim(2);
        dog.run(600); dog.swim (5);

    }
}
