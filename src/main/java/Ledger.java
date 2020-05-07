import java.util.ArrayList;
import java.util.List;

public class Ledger
{
    private List<Double> sales = new ArrayList<Double>();
    private int numberOfSales = 0;

    public void addSale(double value)
    {
        if (value > 0)
        {
            sales.add(value);
            numberOfSales++;
        }
        else
        {
            System.out.println("Cannot add sale that is less than or equal to zero.");
        }
    }

    public int getNumberOfSales()
    {
        return numberOfSales;
    }

    public double getTotalSales()
    {
        double total;
        if (sales.size() == 0)
        {
            System.out.println("No sales recorded.");
            total = 0;
        }
        else
        {
            total = sales.get(0);
            for (int i = 1; i < sales.size(); i++)
            {
                total += sales.get(i);
            }
        }
        return total;
    }

    public double getAverageSale()
    {
        double average;
        if (sales.size() == 0)
        {
            System.out.println("No sales recorded.");
            average = 0;
        }
        else
        {
            double total = getTotalSales();
            average = total/sales.size();
        }
        return average;
    }

    public int getCountAbove(double value)
    {
        int numberOfSalesAboveValue = 0;
        for (int i = 0; i < sales.size(); i++)
        {
            if (sales.get(i) > value)
            {
                numberOfSalesAboveValue++;
            }
        }
        return numberOfSalesAboveValue;
    }
}