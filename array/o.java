class outer2 {
    void func()
    {
        class inner2
        {
            void gun()
            {
             System.out.println(" inner gun ");
            }
        }

    
        inner2 iref=new inner2();
        iref.gun();
        
    }
    public static void main(String[] args) {
        outer2 oref=new outer2();
        oref.func();
    }
    
}