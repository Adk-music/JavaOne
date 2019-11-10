package geekbrains.lessons.lessonfour;

public class LessonFour {

    public static void main(String[] args) {
        Employee employee = new Employee("Фирсун Евгений","директор", 0, 0);
        System.out.println(employee.getName() + ", " + employee.getPosition());

        Employee[] employees = {
                new Employee("Фирсун Евгений","директор", 150000, 42),
                new Employee("Хромова Ксения", "менеджер", 50000, 3),
                new Employee("Кузнецова Ольга", "старший менеджер", 73000, 52),
                new Employee("Кац Борис", "ген. директор", 213000,47)
        };

        for(int i = 0; i< employees.length; i++){
            Employee x = employees[i];
            if (x.getAge() >= 40){
                System.out.println(x.getName() + ", " + x.getPosition() + ", " + x.getSalary() + ", " + x.getAge());
            }
        }
        salaryUp(employees);

    }

   public static void salaryUp(Employee[] emps){

       for(int i = 0; i< emps.length; i++){
           Employee x = emps[i];
           if (x.getAge() >= 45){
               x.setSalary(x.getSalary() + 5000);
               System.out.println("Id: " + x.getId() + " " + x.getName() + ", " + x.getPosition() + ", " + x.getSalary() + ", " + x.getAge());
           }
       }
   }

}
