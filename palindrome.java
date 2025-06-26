
import java.util.Scanner;

class palindrome{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string:");
        String original=sc.nextLine();
        String reversed="";
        for(int i =original.length()-1; i>=0; i--){
            reversed += original.charAt(i);

        }
        if(original.equals(reversed)){
            System.out.println(original + " \nGiven string is palindrome");

        }else {
            System.out.println(original + " \nGiven string is not palindrome");
        }

    }
}
