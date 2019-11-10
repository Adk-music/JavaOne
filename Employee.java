package geekbrains.lessons.lessonfour;

public class Employee {
   private static int nextID = 0;
   private String name;
   private String position;
   private int salary;
   private int age;
   private int id;

    Employee(String name, String position, int salary, int age){
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.age = age;
        this.id = nextID++;

    }
    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public int getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

}
