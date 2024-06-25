package generics_comodin;

import java.util.*;

public abstract class Incomes {

    private String label;
    private int date;
    private double value;

    public Incomes(int date, double value, String label) {
        this.date = date;
        this.value = value;
        this.label= label;
    }

    /* <?> wildcard unbounded para recibir cualquier parametro de object
upper bounded <? extends...interface or class>
lower bounded <? super...interface or class>
     */

    @Override
    public String toString() {
        return "Date: {"+date+"} Value: {"+value+ "} label: {"+label+"}";
    }
}
