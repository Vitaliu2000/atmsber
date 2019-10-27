package atm.mainInterfaces;

import atm.sourses.Nominal;
import java.util.ArrayList;

public interface ATM {
    void putCash(ArrayList<Nominal> cashList);
    //ArrayList<Nominal> getCash(Integer sum);
}
