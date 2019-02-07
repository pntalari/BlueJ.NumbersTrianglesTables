 

public class TableUtilities {
    public static String getSmallMultiplicationTable() 
    {
        String str = new String();
    
        for (int i = 1; i <=5; i++)
        {
           for (int j=1; j <=5; j++)
           {
            str = str + String.format("%3d |",i*j);
           }
           str = str + "\n";
        }
        return str;
    }

    public static String getLargeMultiplicationTable() 
    {
        String str = new String();
    
        for (int i = 1; i <=10; i++)
        {
           for (int j=1; j <=10; j++)
           {
            str = str + String.format("%3d |",i*j);
           }
           str = str + "\n";
        }
        return str;
    }

    public static String getMultiplicationTable(int tableSize) 
    {
        String str = new String();
    
        for (int i = 1; i <=tableSize; i++)
        {
           for (int j=1; j <=tableSize; j++)
           {
            str = str + String.format("%3d |",i*j);
           }
           str = str + "\n";
        }
        return str;
    }
}
