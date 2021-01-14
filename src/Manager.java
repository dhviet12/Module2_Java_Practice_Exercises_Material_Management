import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Material> list = new ArrayList<>();

    public void addMaterial(Material material) {
        list.add(material);
    }

    public double checkDifferenceMeat() {
        double result = 0;
        for (Material mats : list
        ) {
            if (mats instanceof Meat) {
                Meat objMeat = (Meat) mats;
                result += objMeat.getAmount() - objMeat.getRealMoney();
            }
        }
        return result;
    }

    public double checkDifferenceCripsyFlour() {
        double result = 0;
        for (Material mats : list) {
            if (mats instanceof CrispyFlour) {
                CrispyFlour objCripsy = (CrispyFlour) mats;
                result += objCripsy.getAmount() - objCripsy.getRealMoney();
            }
        }
        return result;
    }
}
