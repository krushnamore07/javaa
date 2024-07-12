class demo
{
    int a=1,b=2;
    public static void main(String[] args)
    {
        demo d1=new demo();
        demo d2=new demo();
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());

        Integer iref1=new Integer(10);
        Integer iref2=new Integer(10);
        System.out.println(iref1.hashCode());
        System.out.println(iref2.hashCode());


        String s1 =new String("sangmner");
        String s2 =new String("sangmner");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        Integer iref3=10;
        Integer iref4=10;
        String s3="sangmner";
        String s4="sangmner";
        System.out.println(iref3.hashCode());
        System.out.println(iref4.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());


    }

    public native int hashCode()
    {
        return this.a;
        return this.b;
        System.out.println(System.Identity hashCode(d1));
    }
    
}