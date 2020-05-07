import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountFamilies
{
    public static void main(String[] args)
    {
        CountFamilies tester = new CountFamilies();
        tester.findValuesUnderTenPercent();
    }

    private List<Double> data = new ArrayList<Double>();

    public void findValuesUnderTenPercent()
    {
        readValues();
        double max = findMax();
        List<Double> lessThanTenPercent;
        lessThanTenPercent = findLessThanTenPercent(max);
        printValues(lessThanTenPercent);
    }

    private void readValues()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter values that represent family incomes. Enter a negative value to stop.");
        double value = keyboard.nextDouble();
        while (value >= 0)
        {
            data.add(value);
            value = keyboard.nextDouble();
        }
    }

    private double findMax()
    {
        double max = 0;
        for (int i = 0; i < data.size(); i++)
        {
            if (data.get(i) > max)
            {
                max = data.get(i);
            }
        }
        return max;
    }

    private List<Double> findLessThanTenPercent(double max)
    {
        List<Double> lessThanTenPercent = new ArrayList<Double>();
        double tenPercent = max * .10;
        for (int i = 0; i < data.size(); i++)
        {
            if (data.get(i) < tenPercent)
            {
                lessThanTenPercent.add(data.get(i));
            }
        }
        return lessThanTenPercent;
    }

    private void printValues(List<Double> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
