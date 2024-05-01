class SUM{
    void sum4()
    {
        int a=10,b=10;
        System.out.println(a+b);
    }
    int sum1()
    {
        int a=10,b=5;
        return a+b;
    }
    void sum2(int a, int b)
    {
        System.out.println(a+b);
    }
    int sum3(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        SUM c=new SUM();
        int a=10,b=5;
        c.sum4();
        System.out.println(c.sum1());
        c.sum2(a,b);
        System.out.println(c.sum3(a,b));
    }
    
}