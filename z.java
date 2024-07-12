class demo
{
    public static void main(String [] args)
    {
        try{
        int a=Integer.parseInt(args[0]);
        try{
        int[] arr=new int[a];
        }catch(java.lang.NegativeArraySizeException NAE)
        {
            System.out.println("value size cannot be negative");
        }


        }catch( java.lang.ArrayIndexOutOfBoundsException AIOBE)
        {
            System.out.println("value of cannot be greter than size");

            
        }
          catch (java.lang.NumberFormatException nfe)
        {
            System.out.println("value cannot  be string");
        }

    }
}