/*
Write a Java program that reads a set of integers from the user and stores them in a
List. The program should then find the second largest and second smallest elements
in the List.
*/
import java.util.*;
class Question11 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the length: ");
       int n = sc.nextInt();
       
       List<Integer> l = new ArrayList<>();
       
       for(int i=0;i<n;i++){
        System.out.println("Enter the value for index "+ i);
           l.add(sc.nextInt());
       }
       
       Collections.sort(l,Collections.reverseOrder());
       
       System.out.println("Second largest element is "+ l.get(1));
       System.out.println("Second smallest element is "+ l.get(n-2));
    }
}
