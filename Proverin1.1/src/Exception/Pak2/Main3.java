package Exception.Pak2;



public class Main3 {
    public  void Met1() /*throws ArithmeticException*/ {
int a=10,b=0;

try {
    a = a / b;

}catch (RuntimeException e) {
    System.out.println("Met "+e);
    //throw e;
}finally {
    System.out.println("Finally");
    Met2();
}

    }
    public  void Met2() throws ArithmeticException {
        int a=10,b=0;

            a = a / b;


    }

    public static void main(String[] args) {
        char choice;
        for (int i = 0; i < 2; i++) {
            if (i==1) break;
            System.out.println(i);

        }

    }
}
