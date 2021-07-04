public class currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

    Locale hindia = new Locale("en", "IN");

    NumberFormat in = NumberFormat.getCurrencyInstance(hindia);
    String india = in.format(payment);

    NumberFormat usa = NumberFormat.getCurrencyInstance(Locale.US);
    String us = usa.format(payment);
    NumberFormat cny = NumberFormat.getCurrencyInstance(Locale.CHINA);
    String china = cny.format(payment);
    NumberFormat fra = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    String france = fra.format(payment);

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
