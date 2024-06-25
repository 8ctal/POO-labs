package Logic;

public class ExchangeHouse {

    private double mexican;
    private double euro;
    private double dolar;

    public ExchangeHouse(double mexican, double euro, double dolar) {
        this.mexican = mexican;
        this.euro = euro;
        this.dolar = dolar;
    }

    public double getMexican() {
        return mexican;
    }

    public double getEuro() {
        return euro;
    }

    public double getDolar() {
        return dolar;
    }

    public double calculateTotalCop() {
        return (this.mexican * (4636 / 18.10)) + (this.dolar * (4636)) + (this.euro * (4636) / 0.92);
    }

}
