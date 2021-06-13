package ex26;

import java.util.Scanner;

public class PaymentCalculator {
    public static int calculateMonthsUntilPayoff(){
        Scanner in=new Scanner(System.in);

        double i, b, p, apr, var;
        System.out.print("What is the balance? ");
        String balance=in.nextLine();

        System.out.print("What is the APR on the card (as a percent)? ");
        String percent=in.nextLine();

        apr=Double.parseDouble(percent);
        apr=apr/100.0;

        double mapr=apr/12.0;

        b = Double.parseDouble(balance);
        System.out.print("What is the monthly payment you can make? ");
        String payment=in.nextLine();

        p = Double.parseDouble(payment);

        i = apr / 365.0;
        var = 1.0 - (1.0 + i);
        //n = (-(1.0 / 30.0) * (Math.Log(1 + (b / p) * Math.Pow(var, 30.0))) / (Math.Log(1 + i)));

        return getMonths(b,mapr,p,i,apr,var);
    }

    public static int getMonths(double b, double mapr, double p, double i, double apr, double var){

        double n;

        i = apr / 365.0;
        var = 1.0 - (1.0 + i);

        n = Math.ceil(-1.0 * (Math.log(1.0 - (b * mapr) / p) / Math.log(1.0 + mapr)));
        return (int)n;
    }


}
