package atm.mainInterfaces;

import atm.sourses.Nominal;

public interface CellInterface {
    void put(int count);
    int get(int count);
    int getCount();
    Nominal getNominal();

}
