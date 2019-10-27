package atm.sourses;

import atm.mainInterfaces.InterfaceCell;

/**
 * Ячейча внутри банкомата содержит:
 * Определенное количество купюр
 * У каждой купюры есть свой номинал
 */
public class Cell implements InterfaceCell {
    int count;
    Nominal nominal;

    //Инплементировать методы интерфейса
    @Override
    public void put(int count) {
        this.count += count;
    }
}
