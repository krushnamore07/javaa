import java.io.BufferedReader;

class demo
{
    
    public static void main(String[] args)
    {
        try{
      Class.forName("sample");

        }catch(ClassNotFoundException cnfe)
        {
             cnfe.printStackTrace();
        }
    }

}