import java.util.Scanner;
class Example15 {
    public static void main(String[] args) {
        double x;
        System.out.println("Enter first number");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x = inputValue.nextDouble();

        System.out.println("Enter second number");

        if  ((x >= 0 ) && ( x < 3)) {
            System.out.println("Muy deficiente");
        }
        if  ((x >= 3 ) && ( x < 5 )) {
            System.out.println("Insuficiente");
        }
        if  ((x >=5  ) && ( x < 6)) {
            System.out.println("Suficiente");
        }
        if  ((x >= 6 ) && ( x < 7)) {
            System.out.println("Bien");
        }
        if  ((x >=7  ) && ( x < 9)) {
            System.out.println("Notable");
        }
        if  ((x >= 9 ) && ( x <= 10)) {
            System.out.println("Sobresaliente");
        }




    }

}