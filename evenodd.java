import java.util.Scanner;

class evenodd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(number % 2==0){
            System.out.println(number + "Number is even");
        }else{
            System.out.println(number + "Number is odd");

        }
    }
    }
