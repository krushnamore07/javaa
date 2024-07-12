import java.io.BufferedReader;
class demo
{
    public static void main(String args[])
    {
        try{
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=a/b;  
        System.out.println(c);
        }catch( java.lang.ArrayIndexOutOfBoundsException AIOBE)
        {
            System.out.println("value of cannot be greter than 2");

            
        }
          catch (java.lang.NumberFormatException nfe)
        {
            System.out.println("value cannot  be string");
        }
        catch(java.lang.ArithmeticException aE)
        
        {
             System.out.println("value  of b must be no ");
            
        }
    }
}