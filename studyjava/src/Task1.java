import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        Number num = new Number(n1, n2);
        System.out.println(num.getN1() + " + " + num.getN2() + " = " + num.addition());
        System.out.println(num.getN1() + " - " + num.getN2() + " = " + num.subtraction());
        System.out.println(num.getN1() + " × " + num.getN2() + " = " + num.multiplication());
        System.out.println(num.getN1() + " ÷ " + num.getN2() + " = " + num.division());
    }
}
    class Number {
        private int n1;
        private int n2;
        public Number(int n1,int n2) {
            this.n1 = n1;
            this.n2 = n2;
        }

        public int addition() {
            return n1 + n2;
        }

        public int subtraction() {
            return n1 - n2;
        }

        public int multiplication() {
            return n1 * n2;
        }

        public double division() {
            if (n2 == 0) {
                System.out.println("除数不能为0！");
                return 0.0;
            }
            return (double) n1 / n2;
        }

        public int getN1() {
            return n1;
        }
        public int getN2() {
            return n2;
        }
    }