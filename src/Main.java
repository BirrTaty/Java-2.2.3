public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        long monthlyPaymentForOneYear = service.calculate(1_000_000, 12);
        System.out.println(monthlyPaymentForOneYear);

        long monthlyPaymentForTwoYears = service.calculate(1_000_000, 24);
        System.out.println(monthlyPaymentForTwoYears);

        long monthlyPaymentForThreeYears = service.calculate(1_000_000, 36);
        System.out.println(monthlyPaymentForThreeYears);
    }
}
