public class CreditPaymentService {
    public long calculate(double creditSum, int months) {

        double monthPercent = 9.99 / 100 / 12;
        long monthlyPayment = (long) (creditSum * (monthPercent + (monthPercent / (Math.pow((1 + monthPercent), months) - 1))));
        return monthlyPayment;
    }
}
