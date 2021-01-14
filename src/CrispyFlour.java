import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    private int quantity;

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        double discount = checkDiscountRate();
        return getAmount() - (discount * getAmount());
    }

    public double checkDiscountRate() {
        double discount = 0.05;
        if (getExpiryDate().isAfter(CURRENT_DAY.plusMonths(4))) discount = 0.2;
        else if (getExpiryDate().isAfter(CURRENT_DAY.plusMonths(2))) discount = 0.4;
        return discount;
    }

}
