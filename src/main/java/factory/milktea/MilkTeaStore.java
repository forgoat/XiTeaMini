package factory.milktea;

public class MilkTeaStore {

    private SimpleMilkTeaFactory factory;
    
    public MilkTeaStore(SimpleMilkTeaFactory factory)
    {
        this.factory = factory;
    }

    public MilkTea orderMilkTea(String type)
    {
        MilkTea milkTea;
        milkTea = factory.createMilkTea(type);
        return milkTea;
    }
}
