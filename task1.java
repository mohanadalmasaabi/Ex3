public class task1 {
    public static void main(String[] args) throws IOException{

        float firstNumberalmasaabi, secondNumberalmasaabi, sum, subtraction, product, quotient;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program calculates the simplest of all calculations.");
        System.out.println("Enter the first number:");
        firstNumberalmasaabi = Float.parseFloat(br.readLine());
        System.out.println("Enter the second number:");
        secondNumberalmasaabi = Float.parseFloat(br.readLine());

        sum = firstNumberalmasaabi + secondNumberalmasaabi;
        subtraction = firstNumberalmasaabi - secondNumberalmasaabi;
        product = firstNumberalmasaabi * secondNumberalmasaabi;
        quotient = firstNumberalmasaabi / secondNumberalmasaabi;

        System.out.printf("The first number that was entered was: " + "%2.2f", firstNumberalmasaabi);
        System.out.printf(" and the second number was: " + "%2.2f", secondNumberalmasaabi);

        System.out.println();

        System.out.printf("Sum is: " + "%2.2f, \n",sum);
        System.out.printf("Difference is: " + "%2.2f, \n",subtraction);
        System.out.printf("Product is: " + "%2.2f, \n",product);
        System.out.printf("Quotient is: " + "%2.2f, \n",quotient);
}
