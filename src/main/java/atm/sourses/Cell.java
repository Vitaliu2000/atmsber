package atm.sourses;

import atm.mainInterfaces.ATM;
import atm.mainInterfaces.ATMservice;
import atm.mainInterfaces.CellInterface;
import java.util.ArrayList;


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
        this.count = 0;
    }

    /**
     * Закладываем в ячейку купюры
     * @return
     */
    @Override
    public void put(int count) {
        //this.count += count;//В сокращенном виде
        this.count = this.count + count;//Не в сокращенном виде
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
    public Integer getCount() {
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

    /**
     * Получить данные о всех купюрах по каждому номиналу и вернуть это значение
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
        //count = count + cashList.get(0).getValue();
        for (int i = 0; i < cashList.size(); i++) {
            put(cashList.get(i).getValue());
        }
    }
}