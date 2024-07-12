class outer 
{
    class inner
    {
        void fun ()
        {
            System.out.println("inner function");
        }
    }
}

class demo
{
    public static void main(String[] args)
    {
        //  by creating outer class refferance to acess inner class
        outer oref=new outer();
        outer.inner iref=oref.new inner();
        iref.fun();

        //without outer class refferance to acress inner class;
        outer.inner iref2=new outer().new inner();
        iref2.fun();

        // only acees direct   fun methoo  
        new outer().new inner().fun();
        
    }
}