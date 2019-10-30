package geekbrains.lessons.lessonone;

public class LessonOne {
//Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {
        One(1, 2, 3, 4);
        Two(5, 19);
        Three(10);
        Four(-1);
        Five("Darya");
        Six(100);
    }
//Создать переменные всех пройденных типов данных, и инициализировать их значения;
    boolean isFun = true;
    char c = 'f';
    byte b = 127;
    short s = 32767;
    int x = 213400;
    long l = 1435678;
    float f = 30.34f;
    double d = 3456.98;
 //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static int One(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
//Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static void Two(int a, int b) {
        int x = a + b;
        if ((x >= 10) && (x <= 20)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
// Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    public static void Three (int x){
        if (x >= 0){
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    //Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static boolean Four(int x) {
        return x < 0;
    }
// Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
  public static void Five(String s) {
        System.out.println("Привет " + s);
  }
// * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void Six (int year){
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Високосный");
              }
            }
        }

}
