import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float friends, score, result;
        float a = (float) 0.10;
        System.out.println("Введіть кількість друзів:");
        friends = s.nextFloat();
        {
            if (friends > 0) {
                System.out.println("Введіть рахунок:");
                score = s.nextFloat();
                if (score > 0){
                    result = (float) ((score + score * 0.10) / friends);
                    System.out.println("З кожного по " + result);
                }else{
                    System.out.print("Bill total amount cannot be negative");
                }
            }else{
                System.out.print("Number of friends cannot be negative or zero");
            }
        }
    }
}
