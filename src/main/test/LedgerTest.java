import org.junit.Test;
import edu.ti.caih313.collections.Ledger;

import static org.junit.Assert.assertEquals;

public class LedgerTest
{
    @Test
    public void testAddSale()
    {
        Ledger test = new Ledger();
        test.addSale(3);
        assertEquals(3, test.getSale(0), .001);
        test.addSale(8.20);
        assertEquals(8.2, test.getSale(1), .001);
        test.addSale(-23);
        assertEquals(2, test.getNumberOfSales());
        test.addSale(0);
        assertEquals(2, test.getNumberOfSales());
    }

    @Test
    public void testGetNumberOfSales()
    {
        Ledger test = new Ledger();
        assertEquals(0, test.getNumberOfSales());
        test.addSale(34);
        assertEquals(1, test.getNumberOfSales());
        test.addSale(23);
        test.addSale(54);
        assertEquals(3, test.getNumberOfSales());
    }

    @Test
    public void testGetTotalSales()
    {
        Ledger test = new Ledger();
        assertEquals(0, test.getTotalSales(), .001);
        test.addSale(65.3);
        assertEquals(65.3, test.getTotalSales(), .001);
        test.addSale(20);
        test.addSale(30);
        assertEquals(115.3, test.getTotalSales(), .001);
        test.addSale(0);
        assertEquals(115.3, test.getTotalSales(), .001);
    }

    @Test
    public void testGetAverageSale()
    {
        Ledger test = new Ledger();
        assertEquals(0, test.getAverageSale(), .001);
        test.addSale(23.1);
        assertEquals(23.1, test.getAverageSale(), .001);
        test.addSale(20);
        test.addSale(30);
        assertEquals(24.3666, test.getAverageSale(), .001);
        test.addSale(0);
        assertEquals(24.3666, test.getAverageSale(), .001);
    }

    @Test
    public void testGetCountAbove()
    {
        Ledger test = new Ledger();
        assertEquals(0, test.getCountAbove(5));
        test.addSale(3);
        test.addSale(23);
        test.addSale(5);
        assertEquals(1, test.getCountAbove(5));
        assertEquals(3, test.getCountAbove(0));
    }
}
