package atm.sourses;

import atm.mainInterfaces.ATM;
import atm.mainInterfaces.ATMservice;
import atm.mainInterfaces.CellInterface;
import java.util.ArrayList;
import static atm.sourses.Nominal.*;


/**
 * Ячейча внутри банкомата содержит:
 * Определенное количество купюр
 * У каждой купюры есть свой номинал
 */
public class Cell implements CellInterface, ATMservice, ATM {

    private Nominal nominal;
    private Integer count;

    public Cell(Nominal nominal, Integer count) {
        this.nominal = nominal;
        this.count = count;
    }

    public Cell(Nominal nominal) {
        this.nominal = nominal;
    }

    public Cell() {
    }

    //todo Как это писать не в сокращенном виде???
    /**
     * Закладываем в ячейку купюры
     * @return
     */
    @Override
    public void put(int count) {
        this.count += count;
        //count++;
    }

    //todo Как это писать не в сокращенном виде???
    /**
     * Берем из ячейки нужнок кол-во купюр
     * @return
     */
    @Override
    public int get(int count) {
        Integer toReturn = (this.count>=count)?count:this.count;
        this.count -= toReturn;
        return toReturn;
    }

    /**
     * Показывает остатки купюр в ячейке
     * @return
     */
    public int getCount() {
        return this.count;
    }

    /**
     * Показывает номинал купюры
     * @return
     */
    @Override
    public Nominal getNominal() {
        return this.nominal;
    }

    //todo получить данные о кол-ве купюр по каждому номиналу и вернуть это значение
    /**
     * Получение баланса ячейки
     * @return
     */
    @Override
    public int getBalance() {
        int summ = 0;
        for (int i = 0; i < Nominal.getSummaryCount(); i++){
            int countR = Nominal.values()[i].getValue();
            summ += countR;
        }
        return summ;
    }

    @Override
    public void putCash(ArrayList<Nominal> cashList) {
        //cashList.add(0, this.nominal);

        ArrayList list = new ArrayList();
    }
}
