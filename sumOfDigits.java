import java.util.*;;
public class sumOfDigits {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter A Number: ");
    int num = sc.nextInt();
    int sum = 0;
    while(num>0){
        sum = sum + (num%10);
        num = num /10;
    }
    System.out.println(sum + " is the sum of Digits of the Number.");
    sc.close();
    }
}
