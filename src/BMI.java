import java.util.Scanner;

public class BMI {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printBMIHeader();
        System.out.println("Enter weight in pounds: ");
        float weight = (float) scanner.nextDouble();
        System.out.println("Enter height in inches: ");
        float height = (float) scanner.nextDouble();

        calculateWeight(weight);
        calculateHeight(height);
        System.out.printf("BMI: " + "%.2f",calculateBMI(weight,height));
    }

    public static float calculateWeight(float pounds){
        float weight = pounds * 703;
       return weight;
    }//end of weight calculator

    public static float calculateHeight(float inches){
        float height = (float) Math.pow(inches,2);
        return height;
    }//end of height calculator

    public static float calculateBMI(float weight, float height){
        return calculateWeight(weight) / calculateHeight(height);
    }//end of BMI calculator

    public static void printBMIHeader() {
        System.out.println("BMI VALUES");
        System.out.println("Underweight: \tless than 18.5");
        System.out.println("Normal:\t\t\tbetween 18.5 and 24.9");
        System.out.println("Overweight:\t\tbetween 25 and 29.9");
        System.out.println("Obese:\t\t\t30 or greater");
    }//end of print header method

}// end of class
