class Mobile_user
{
    public static void main(String args[]) 
    {  Mobile redmi=new Mobile();
          redmi.insert_sim(new jio());
        
    }
}

class Mobile
{

    void insert_sim(sim s)
    {
        s.sms();
        s.calling();

    }
}

interface sim
{
   void calling();

   void sms();

}

class jio implements sim
{  public void calling()
    {
       System.out.println("jio calling");
    }
   public void sms()
   {
    System.out.println("jio sms");
   }


}

interface demo
{
    default void fun()
    {

    }
}



