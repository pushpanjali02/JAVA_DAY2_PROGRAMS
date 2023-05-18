import java.util.Scanner;
public class SmallestOf3Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entet 3 numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int smallest;
        smallest=n3<(n1<n2?n1:n2)?n3:((n1<n2)?n1:n2);
        System.out.println("Smallest: "+smallest);
    }
}
