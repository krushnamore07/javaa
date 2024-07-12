interface demo
{
    default void fun()
    {
        System.out.println("interface demo");

    }
}

class test implements demo
{

}

class abstrctiondemo
{
    public static void main(String args[])
    {
        demo d=new test();
        d.fun();
    }
}


