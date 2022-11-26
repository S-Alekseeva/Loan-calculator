public class CreditPaymentService {

    public double calculate(double percent, double month, double amount) {
        double monthlyRate = percent / 12 / 100;
        double power = Math.pow((1 + monthlyRate), month);
        double coefficient = monthlyRate * power / (power - 1);
        double payment = coefficient * amount;
        {

        }
        return payment;
    }
}
