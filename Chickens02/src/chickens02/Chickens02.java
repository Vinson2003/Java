
package chickens02;

public class Chickens02 {
    public static void main(String[] args) {
        double dailyAverage;
        double monthlyAverage;
        double monthlyProfit;

        dailyAverage = (100 + 121 + 117) / 3.0;
        monthlyAverage = dailyAverage * 30;
        monthlyProfit = monthlyAverage * 0.18;

        System.out.println("Daily Average:    " + dailyAverage);
        System.out.println("Monthly Average:  " + monthlyAverage);
        System.out.println("Monthly Profit:   $" + monthlyProfit);
    }
    
}
