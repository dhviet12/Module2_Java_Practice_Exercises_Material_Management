import java.time.LocalDate;

public class Meat extends Material implements Discount {
    private double weight;

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return weight * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        double discount = checkDiscountRate();
        return getAmount() - (getAmount() * discount);

    }

    public double checkDiscountRate() {
        double discount = 0.1;
        if (getExpiryDate().isAfter(CURRENT_DAY.plusDays(5))) discount = 0.3;
        else if (getExpiryDate().isAfter(CURRENT_DAY.plusDays(3))) discount = 0.5;
        return discount;
    }
}
