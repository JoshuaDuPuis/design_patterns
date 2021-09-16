import java.util.ArrayList;


/**
 * The HousePlanFactory class contains one method that returns a HousePlan 
 * specific to the type of house the user wants to build.
 * @author Joshua DuPuis
 */
public class HousePlanFactory {
    
    protected ArrayList<String> materials;

    /**
     * The createHousePlan method returns a HousePlan fitted for the type of
     * house the user specifies.
     * @param typel The HousePlan type of house a user would like a plan for
     * @return The HousePlan for the type of house specified by the user
     */
    public static HousePlan createHousePlan(String typel) {
      if (typel.equals("log cabin")) {
        LogCabinPlan ret = new LogCabinPlan();
        ret.setFeatures();
        ret.setMaterials();
        return ret;
      }
      if (typel.equals("Tiny Home")) {
        TinyHomePlan ret = new TinyHomePlan();
        ret.setFeatures();
        ret.setMaterials();
        return ret;
      }
      
      ContemporaryPlan ret = new ContemporaryPlan();
      ret.setFeatures();
      ret.setMaterials();
      return ret;
      
    }
}
