import java.io.BufferedReader;

class demo
{
    
    public static void main(String[] args)
    {
        try{

     BufferedReader br=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
     br.readLine();
        }catch(java.io.IOException ioe)
        {
            ioe.printStackTrace();

        }
    }

}