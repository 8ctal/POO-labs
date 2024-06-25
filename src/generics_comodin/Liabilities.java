package generics_comodin;

import java.util.Date;

public class Liabilities extends Incomes {

    private Category category;

    public Liabilities(Category category, int date, double value, String label) {
        super(date, value, label);
        this.category = category;
    }

}
