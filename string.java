class Demo
{    
    

    public static void main(String [] args)
    {   System.out.println("1");
        String s1=new String();
        s1="akash";
        System.out.println(s1);
        System.out.println();

        System.out.println("2");
        String s2=new String("akash");
        System.out.println("s2 "+s2);
        String s3=new String(s2);
        System.out.println("s3 "+s3);
        System.out.println();

        System.out.println("3");
        StringBuffer Sb1=new StringBuffer("Akash");
        String s4=new String(Sb1);
        System.out.println("s4 "+s4);
        System.out.println();

        System.out.println("4");
        StringBuilder sb2=new StringBuilder("akash");
        String s5=new String(sb2);
        System.out.println("s5 "+s5);

        System.out.println("5");
        char[] crr={'a','k','a','s','h'};
        String s6=new String(crr);
        System.out.println("s6 "+s6);

        //slice
        char[] crr2={'a','h','m','d','n','a','g','a','r'};
        String s7=new String(crr2,4,4);
        System.out.println(s7);

        byte[] brr={65,66,67};
        String s8=new String(brr);
        System.out.println(s8);
        
        
        byte[] brr2={97,98,99,100,101,102,103,104};
        String s9=new String(brr2, 3, 5);
        System.out.println(s9);

      

        String st1="akash";
        String st2=new String("akash");
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st1==st2);
        System.out.println(st1.equals(st2));

        System.out.println("length");
        System.out.println(s1.length());

        
        s1.concat(s2);
        System.out.println(s1);
        s1=s1.concat(s2);
        System.out.println(s1);

        System.out.println(s1+"giri");
       System.out.println( s1.charAt(3));

       System.out.println(s1.indexOf('a'));
       System.out.println(s1.indexOf("kas"));
       System.out.println(s1.indexOf("ka",1));
       System.out.println(s1.indexOf('k',1));


       System.out.println(s1.lastIndexOf('k'));
       System.out.println(s1.lastIndexOf("kas"));
       System.out.println(s1.lastIndexOf("kas",2));
       System.out.println(s1.lastIndexOf('k',2));

       System.out.println((s1).equalsIgnoreCase(s2));

       String p="NIKHILkawde";
       System.out.println(p.toUpperCase());


       System.out.println(p.isEmpty());
       System.out.println(p.startsWith("NI"));
       System.out.println(p.endsWith("kawde"));

// to remove front space;
       String sn="     maha  rashtra    ";
       System.out.println(sn.trim());

       System.out.println(sn.substring(4));
       System.out.println(sn.substring(3, 8));

       System.out.println(p.replace('N','p'));  
       System.out.println(p.replace('NIKHIL','pranav'));   
       
       
      
     




    }

}