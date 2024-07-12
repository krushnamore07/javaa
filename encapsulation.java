class Employee
{
    private int empid;
    public void setempid(int eid)
    {
        empid=eid;
    }
    public int getempid()
    {
        return empid;
    }
}

class Manager
{
    public static void main(String args[])
    {
        Employee e=new Employee();
        e.setempid(100);
        System.out.println(e.getempid());
    }
}