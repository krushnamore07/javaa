class Demo
{

 
    public static void main(String[] args) 
    {
        StringBuffer s=new StringBuffer();
        System.out.println(s.capacity());
        StringBuffer s1=new StringBuffer("pranav");
        System.out.println(s1.capacity());
        StringBuffer s2=new StringBuffer(10);
        System.out.println(s2.capacity());

        // append to change in previous string capcity or to add  string in last    . 

        System.out.println(s1.append("karpe"));
        System.out.println(s1.capacity());

        System.out.println(s1.append("sangmner"));
        System.out.println(s1.capacity());

        System.out.println(s1.append("pimpalgonkonzira"));
        System.out.println(s1.capacity());

        System.out.println(s2.append("karpe"));
        System.out.println(s2.capacity());

        System.out.println(s2.append("sangmner"));
        System.out.println(s2.capacity());

        System.out.println(s2.append("pimpalgonkonzira"));
        System.out.println(s2.capacity());


        System.out.println(s1.insert(1, "thorat"));

        System.out.println(s1.reverse());

        System.out.println(s1.delete(1,6));

        System.out.println(s1.deleteCharAt(8));


        StringBuffer sb4=new StringBuffer();

        System.out.println(sb4.capacity());
        System.out.println(sb4.append("pranav"));
        
        sb4.trimToSize();
        System.out.println(sb4.capacity());
        System.out.println(sb4.append("thorat"));
        sb4.ensureCapacity(45);
        System.out.println(sb4.capacity());

        sb4.setLength(3);
        System.out.println(sb4);




        
        


    }



      

}