package factory.milktea;

public class SimpleMilkTeaFactory {
   
    public MilkTea createMilkTea(String type)
    {
        MilkTea milkTea = null;
        if (type.equals("BrownSugarBubbleMilkTea")) {
            milkTea = new BrownSugarBubbleMilkTea();
        } else if (type.equals("CheeseStrawberryMilkTea")) {
            milkTea = new CheeseStrawberryMilkTea();
        } else if (type.equals("SucculentsGrapeMilkTea")) {
            milkTea = new SucculentsGrapeMilkTea();
        } else if (type.equals("SucculentMongoMilkTea")) {
            milkTea = new SucculentsMangoMilkTea();
        }
        return milkTea;
    }
}
