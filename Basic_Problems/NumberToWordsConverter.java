import java.util.Scanner;

public class NumberToWordsConverter {
    
//Q3 Convert Number to Words - Convert 123 → "One Two Three".

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        
        
        int temp = num;

        for (int i = 0; i < temp; i++) {
            
            int lastnum = temp%10;

            switch (lastnum) {                
                case 1 : System.out.println("One");
                break;
                
                case 2 : System.out.println("Two");
                break;
                
                case 3 : System.out.println("Three");
                break;
                
                case 4 : System.out.println("Four");
                break;
                
                case 5 : System.out.println("Five");
                break;
                
                case 6 : System.out.println("Six");
                break;
                
                case 7 : System.out.println("Seven");
                break;
                
                case 8 : System.out.println("Eight");
                break;
                
                case 9 : System.out.println("Nine");
                break;       
                
                default: System.out.println("Entered no. is incorrect!");
                break;
            }

            temp = temp/10;
        }

    }

}
