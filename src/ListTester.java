import java.util.ArrayList;

public class ListTester
{
    public static void main(String[] args)
    {
        ArrayList<String> nameList = new ArrayList<String>();
        String name1 = "Diego";
        String name2 = "Grace";
        nameList.add(name1);
        nameList.add(name2);
        nameList.add(name1);
        System.out.println(nameList);
        System.out.println(nameList.size());
    }
}