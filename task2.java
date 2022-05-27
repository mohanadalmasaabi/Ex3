public class task2 {
    public static void main(String[] args) throws IOException {

        float heightLusajo, weightLusajo, bmialmassabi;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program wil calculate your BMI.");
        System.out.println("Please enter your height in cm:");
        heightLusajo = Float.parseFloat(br.readLine())/100;
        System.out.println("Now enter your weight:");
        weightalmassabi = Float.parseFloat(br.readLine());

        bmialmassabi = (float)(weightalmassabi/(Math.pow(heightLusajo,2)));
        System.out.printf("Your BMI IS: " + "%2.2f, \n", bmialmassabi);

        if(bmialmassabi<16){
            System.out.println("You're starving");
        }else if ((bmialmassabi>=16)&&(bmialmassabi<16.99)){
            System.out.println("You're emaciated");
        }else if ((bmialmassabi>=17)&&(bmialmassabi<18.49)){
            System.out.println("You're underweight");
        }else if ((bmialmassabi>=18.50)&&(bmialmassabi<22.99)){
            System.out.println("You're in the low range of normal");
        }else if ((bmialmassabi>=23)&&(bmialmassabi<24.99)){
            System.out.println("You're in the high range of normal");
        }else if ((bmialmassabi>=25)&&(bmialmassabi<27.49)){
            System.out.println("You're pre-obese");
        }else if ((bmialmassabi>=27.50)&&(bmialmassabi<29.99)){
            System.out.println("You're overweight");
        }else if ((bmialmassabi>=30)&&(bmialmassabi<34.9)){
            System.out.println("You have a 1st degree obesity");
        }else if ((bmialmassabi>=35)&&(bmialmassabi<39.9)){
            System.out.println("You have a 2nd degree obesity");
        }else if (bmiLusajo>=40){
            System.out.println("You have a 3rd degree obesity")
}
