class parent
{
    void fun()
    {
        System.out.println("fun parent");

    }
    void gun()
    {
        System.out.println("gun parent");

    }
}

class child extends parent
{
    void fun ()
    {
        System.out.println("fun child");
    }
    void run()
    {
        System.out.println("run child");
    }
}

class demo
{
   public static void main(String args[])
   {
    parent pref=new child();
    pref.fun();
    pref.gun();
   // pref.run();
   }
}