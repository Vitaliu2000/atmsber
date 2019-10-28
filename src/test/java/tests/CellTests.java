package tests;

import atm.sourses.Cell;
import atm.sourses.Nominal;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static atm.sourses.Nominal.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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
     * Получить данные о всех купюрах по каждому номиналу и вернуть это значение
     */
    @Test
    public void testBalance(){
        Cell cell = new Cell();
        assertEquals(cell.getBalance(), 8800);
    }

    /**
     * Проверить зачисления на счет.
     */
    @Test
    public void testPutCash(){
        Cell cell = new Cell();
        ArrayList<Nominal> nominals = new ArrayList<>();
        nominals.add(ONE_HUNDRED);
        nominals.add(ONE_THOUSAND);
        cell.putCash(nominals);
        assertEquals(1100, cell.getCount());
    }
}
