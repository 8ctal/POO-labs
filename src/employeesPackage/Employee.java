package employeesPackage;

import mainPackage.*;

public class Employee extends Person {

    private long salary;
    private String field;
    private int yearsOfWork;

    public Employee(long salary, String field, int yearsOfWork, String name, String surname, int age) {
        super(name, surname, age);
        this.salary = salary;
        this.field = field;
        this.yearsOfWork = yearsOfWork;
    }

    @Override
    public String greet() {
        return super.greet() + "I work at the field of " + field + " and my salary is around " + salary + " . I've got like " + yearsOfWork + " years here.";
    }

}
