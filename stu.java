class address implements Cloneable
{  int a=1,b=2,c=3;
   
    public address clone() throws CloneNotSupportedException
    {
       return (address)super.clone();
    }  
}
class student implements Cloneable
{
    int rollNO=32;
    String name="pranav";
    address add=new address();
    public student clone() throws CloneNotSupportedException
    {
       return (student)super.clone();
    }
   
}
class test
{
    
    public static void main(String[] args) throws CloneNotSupportedException
    {
        student s1=new student();
        student s2=s1.clone();
        s2.add=s1.add.clone();
        System.out.println(s1.rollNO);
        System.out.println(s1.name);
        System.out.println(s1.add.a);
        System.out.println(s1.add.b);
        System.out.println(s1.add.c);

        System.out.println(s2.rollNO);
        System.out.println(s2.name);
        System.out.println(s2.add.a);
        System.out.println(s2.add.b);
        System.out.println(s2.add.c);
        System.out.println();
        

        s1.rollNO=50;
        System.out.println(s1.rollNO);
        System.out.println(s1.name);
        System.out.println(s1.add.a);
        System.out.println(s1.add.b);
        System.out.println(s1.add.c);

        System.out.println(s2.rollNO);
        System.out.println(s2.name);
        System.out.println(s2.add.a);
        System.out.println(s2.add.b);
        System.out.println(s2.add.c);
        System.out.println();
        s1.add.a=100;
        System.out.println(s1.rollNO);
        System.out.println(s1.name);
        System.out.println(s1.add.a);
        System.out.println(s1.add.b);
        System.out.println(s1.add.c);

        System.out.println(s2.rollNO);
        System.out.println(s2.name);
        System.out.println(s2.add.a);
        System.out.println(s2.add.b);
        System.out.println(s2.add.c);
        System.out.println();


        Class cref=s1.getClass();
        System.out.println(cref.getName());
    }
}