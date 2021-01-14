import java.time.LocalDate;

public abstract class Material {
    public static final LocalDate CURRENT_DAY = LocalDate.now();
    private String id;
    private String name;
    private LocalDate manufacturingDate;
    private int cost;

    // constructor


    public Material(String id, String name, LocalDate manufacturingDate, int cost) {
        this.id = id;
        this.name = name;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;
    }

    //get and set


    public int getCost() {
        return cost;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    //abstract method
    public abstract double getAmount();

    public abstract LocalDate getExpiryDate();


}
