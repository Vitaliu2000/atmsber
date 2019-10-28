package tests;

import atm.sourses.Cell;
import atm.sourses.Nominal;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static atm.sourses.Nominal.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellTests {

    /**
     * Проверка пустой ячейки на закладку новых купюр.
     */
    @Test
    public void testPutInEmptyCell(){
        Cell cell = new Cell(ONE_HUNDRED, 0);
        cell.put(20);
        assertEquals(cell.getCount(), 20);
    }

    /**
     * Проверка не пустой ячейки на закладку новых купюр.
     */
    @Test
    public void testPutInNotEmptyCell(){
        Cell cell = new Cell(ONE_HUNDRED, 10);
        cell.put(20);
        assertEquals(cell.getCount(), 30);
    }

    /**
     * Из ячейки забираем определенное кол-во купюрь и проверяем верность остатку
     */
    @Test
    public void testGetInNotEmptyCell(){
        Cell cell = new Cell(ONE_HUNDRED, 10);
        cell.get(4);
        assertEquals(cell.getCount(), 6);
    }

    /**
     * Проверка номинала
     */
    @Test
    public void testNominal(){
        Cell cell = new Cell(ONE_HUNDRED);
        assertEquals(cell.getNominal(), ONE_HUNDRED);
    }

    /**
     * Получить баланс банкомата
     */
    @Test
    public void testBalance(){
        Cell cell = new Cell();
        assertEquals(cell.getBalance(), 8800);
    }

    @Test
    public void test(){
        Cell cell = new Cell();
        cell.putCash(new ArrayList <Nominal>());
        //assertEquals(cell.put(1),2);
    }
}
