class Demo {
    int a, b, c;

    Demo() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Demo[] d = new Demo[5];
        for(int i=0;i<5;i++)
        {
            d[i]=new Demo();
        }
        d[0].a = 10;
        d[1].a = 20;
        d[2].a = 30;
        System.out.println(d[0].a);
        System.out.println(d[1].a);
        System.out.println(d[2].a);
    }
}