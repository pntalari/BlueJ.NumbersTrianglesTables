 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        char star = '*';
        String str = new String();
        for (int i=0; i<numberOfStars; i++)
        {
            str = str + star;
        }
        return str;
    }
    
    public static String getTriangle(int numberOfRows) 
    {
        String str = new String();
        for (int i =1; i<=numberOfRows;i++)
        {
            str = str + getRow(i) + "\n";
        }
        return str;
    }


    public static String getSmallTriangle() {
        String str = new String();
        str = str + getTriangle(4);
        return str;
    }

    public static String getLargeTriangle() {
        String str = new String();
        str = str + getTriangle(9);
        return str;
    }
}
