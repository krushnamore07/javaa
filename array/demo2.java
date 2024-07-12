class demo2
{// {  public String toString(hhhhhhhreturn "sangamner");
    public static void main(String[] args) {
     
            int a=10;
            Integer iref=new Integer(a);
            Integer iref2=Integer.valueOf(a);
            iref.toString();
            demo2 d=new demo2();
            d.toString();

            //wrapper classe to intger
            int b=iref.intValue();

            // primitive data type to string object
            String s1=Integer.toString(10);
            String s2=Integer.toString(20);
            //string object to wrapper class object
            Integer iref3=new Integer ("30");
            //wrapper class object to string object
            

            System.out.println(iref);
            System.out.println(iref2);
            System.out.println(d);
            System.out.println(b);
            System.out.println(s1+s2);
            System.out.println(iref3);
        }
    }