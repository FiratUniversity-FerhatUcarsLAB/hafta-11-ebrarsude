public class Exercise4_6_Multadd {
    
    public static double multadd(double a, double b, double c) {
        // 2) multadd metodu: a * b + c işlemini yapar
        return a * b + c;
    }

    public static double expSum(double x) {
        // 5) expSum metodu:  x * e^(-x) + sqrt(1 - e^(-x))
        return multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
    }

    public static void main(String[] args) {
        // 3) Basit testler
        System.out.println("multadd(2, 3, 4) = " + multadd(2, 3, 4));  
        System.out.println("multadd(1.5, 4, 10) = " + multadd(1.5, 4, 10));

        // 4.1) sin(π/4) + cos(π/4)/2
        double expr1 = multadd(Math.sin(Math.PI / 4),
                               1,
                               Math.cos(Math.PI / 4) / 2);
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + expr1);

        // 4.2) log 10 + log 20   (Java log = doğal log, ln)
        double expr2 = multadd(Math.log(10), 1, Math.log(20));
        System.out.println("ln(10) + ln(20) = " + expr2);

        // 5) expSum testi
        double x = 2.0;
        System.out.println("expSum(" + x + ") = " + expSum(x));
    }
}
