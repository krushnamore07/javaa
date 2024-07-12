class demo
{
    public boolean equlas(Object obj)
    {
        demo dref=(demo)obj;
        return this.a==dref;
        return this.b==dref;
       return  this.a==dref.a && this.b==dref.b;
    }
    int a,b;
    demo(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public static void main(String [] args)
    {
        demo d1=new demo(10,20);
        demo d2=new demo(10,20);
        System.out.println((d1).equlas(d2));
        System.out.println(d1==d2);
        
        Integer iref1=10;
        Integer iref2=10;
        System.out.println(iref1==iref2);
    }
}