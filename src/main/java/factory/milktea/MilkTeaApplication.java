package factory.milktea;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MilkTeaApplication {
    
    public static void main(String[] args)
    {
        SimpleMilkTeaFactory factory = new SimpleMilkTeaFactory();
        MilkTeaStore store = new MilkTeaStore(factory);
        printChoice();
        try (Scanner in = new Scanner(System.in))
        {
            String choice = "a";
            List<MilkTea> milkTeaList = new ArrayList<>();
            while (!choice.equals("e"))
            {
                printChoice();
                choice = in.nextLine();
                System.out.println("your choice is " + choice);

                if (choice.equals("o"))
                {
                    System.out.println("enter milk tea name(e.g. BrownSugarBubbleMilkTea)");
                    String type = in.nextLine();
                    MilkTea milkTea = store.orderMilkTea(type);
                    milkTeaList.add(milkTea);
                }
                else if (choice.equals("s"))
                {
                    for (MilkTea milkTea : milkTeaList)
                    {
                        System.out.println(milkTea);
                    }
                }
                else {
                    System.out.println("Please enter correct choice");
                }
            }
            System.out.println("Thank you for coming and we're looking forward to your next coming again");
            return ;
        }
    }

    public static void printChoice()
    {
        System.out.println("----------- XITea Mini Application -------------");
        System.out.println("please make a choice");
        System.out.println("(o)rder MilkTea");
        System.out.println("(s)how your order");
        System.out.println("(e)xit application");
    }
    
}
