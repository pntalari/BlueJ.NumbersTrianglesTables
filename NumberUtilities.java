public class NumberUtilities {

    public static String getRange(int stop) {
        String strCon = new String();
        for(int i = 0; i < stop; i++)
        {
           strCon = strCon + i;
        }
        return strCon;
    }

    public static String getRange(int start, int stop) {
        String strCon = new String();
        for (int i = start; i < stop; i++)
        {
            strCon = strCon + i;
        }
        return strCon;
    }


    public static String getRange(int start, int stop, int step) {
         String strCon = new String();
        for (int i = start; i < stop; i+=step)
        {
            strCon = strCon + i;
        }
        return strCon;
    }

    public static String getEvenNumbers(int start, int stop) 
    {
        String strCon = new String();
        for (int i = start; i < stop; i++)
        {
            if (i%2 == 0)
           {
            strCon = strCon + i;
           }
        }
        return strCon;
    }


    public static String getOddNumbers(int start, int stop) {
        String strCon = new String();
        for (int i = start; i < stop; i++)
        {
            if (i%2 != 0)
           {
            strCon = strCon + i;
           }
        }
        return strCon;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String strCon = new String();
        int temp = 0;
        for (int i = start; i <= stop; i++)
        {
            temp = (int)Math.pow(i,exponent);
            strCon = strCon + temp;
        }
        return strCon;
    }
}
