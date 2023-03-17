import java.util.*;
public class palindrome{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A Number: ");
    int num = sc.nextInt();
    int temp = num,rev = 0;
    while(temp>0){
        rev = rev*10 + (temp%10);
        temp = temp/10;
    }
    if(num == rev){
        System.out.println(num + " is a Palindrome Number.");
    }else{
        System.out.println(num + " is not a Palindrome Number.");
    }
    sc.close();
    }
}