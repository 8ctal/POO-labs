package mainPackage;

import employeesPackage.*;
import studentsPackage.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Person> uisCommunity = new ArrayList<>();
        uisCommunity = initUisCommunity(uisCommunity);
        System.out.println("----------- UIS COMMUNITY ------------");
        for (Person person : uisCommunity) {
            System.out.println("[" + person.getClass().getSimpleName() + "]: - " + person.greet());
        }
    }

    static List<Person> initUisCommunity(List<Person> uisCommunity) {
        uisCommunity.add(new Posgraduate_student(4, 4.2, "Computer Science PhD", 3, "Juan Camilo", "Jaimes Avila", 23));
        uisCommunity.add(new Degree_student(6, 3.8, "Philosophy", 6, "Teo", "Rodriguez", 18));
        uisCommunity.add(new Teacher(32000000, "Discrete Maths", 5, "Jonathan", "Ramos Chaux", 28));
        uisCommunity.add(new Msc_Student(4, 4.5, "Master of system engeenier", 2, "Oliver", "Jaimes", 24));
        uisCommunity.add(new Admin(25000000, "Liquidations office", 2, "Patricia", "Gonzales", 32));
        uisCommunity.add(new Phd_Student(2, 4.7, "Maths PhD", 1, "Eduardo", "Saenz", 26));
        return uisCommunity;
    }
}
