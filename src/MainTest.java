import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Material meat = new Meat("1", "meat1", LocalDate.parse("2020-01-07"), 10000, 5);
        Material meat1 = new Meat("2", "meat2", LocalDate.parse("2020-01-15"), 20000, 3);
        Material meat2 = new Meat("3", "meat3", LocalDate.parse("2020-01-01"),  30000, 5);
        Material cripsyFlour = new CrispyFlour("4","cripsyFlour",LocalDate.parse("2020-07-13"),5000,5);
        Material cripsyFlour1 = new CrispyFlour("5","cripsyFlour1",LocalDate.parse("2020-01-15"),5000,5);
        Material cripsyFlour2 = new CrispyFlour("6","cripsyFlour2",LocalDate.parse("2020-01-15"),10000,2);
        manager.addMaterial(meat);
        manager.addMaterial(meat1);
        manager.addMaterial(meat2);
        manager.addMaterial(cripsyFlour);
        manager.addMaterial(cripsyFlour1);
        manager.addMaterial(cripsyFlour2);
        System.out.println(manager.checkDifferenceMeat());
        System.out.println(manager.checkDifferenceCripsyFlour());

    }

}
