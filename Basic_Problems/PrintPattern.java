

public class PrintPattern {
    
    public static void main(String[] args) {
        
        for (int i = 0; i <= 5; i++) {
            
            for (int j = 5; j > i ; j--) {
                
                System.err.print(" ");
            }
            for (int k = i; k > 0; k--) {
                
                System.err.print("*");
            }

            for (int j = i; j >= 0 ; j--) {
                
                System.err.print("*");
            }
            for (int k = 5; k > 0; k--) {
                
                System.err.print(" ");
            }
            System.err.println("");

        }

            
           
        
        
        
    }
}
