package generics_comodin;

import java.time.Instant;
import java.util.*;

public class Generics_Comodin {

    public static void main(String[] args) {
        ArrayList<Assets> assets = new ArrayList<>();
        assets.add(new Assets(120304, 2000000, "Pago de sueldo"));
        createReport(assets);
        ArrayList<Liabilities> liabilities = new ArrayList<>();
        liabilities.add(new Liabilities(Category.REAL_STATE,230409, 1500000, "Pago de arrendaje"));
        createReport(liabilities);
    }

    public static void createReport(List<? extends Incomes> incomes) {
        for (Incomes income : incomes) {
            System.out.println(income);
        }
    }

}
