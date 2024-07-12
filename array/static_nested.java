class outer
{
    static class inner
    {
        static int a=10;
        int b=20;
        public static void main(String args[])
        {
            System.out.println("static inner class");
        }

    }


  public static void main(String args[])
  {
    System.out.println("outer main");
    System.out.println(inner.a);
    inner

   }
}