public class MaxMinWithoutIfElse {
    
// Q2. Find Maximum and Minimum Without Using If-Else - Use arithmetic operators instead.

    public static void main(String[] args) {
        
        int a = 100, b = 40;
        
        int max = (a + b + Math.abs(a-b))/2;
        int min = (a + b - Math.abs(a-b))/2;

        System.out.println("Max no. is : " + max);
        System.out.println("Min no. is : " + min);

    }

}
