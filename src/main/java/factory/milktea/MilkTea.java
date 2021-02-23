package factory.milktea;
import java.util.List;
import java.util.ArrayList;

public abstract class MilkTea {

    public String name;
    public String temperature;
    public String size;
    public List<String> toppings = new ArrayList<String>();

    public String getName()
    {
        return name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("--- " + name + " ---\n");
        display.append(temperature + "\n");
        display.append(size + "\n");
        for (String topping : toppings)
        {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
