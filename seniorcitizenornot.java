import java.util.Scanner;
public class seniorcitizenornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        if(age>75){
            System.out.println("Senior citizen");
        }
        else{
            System.out.println("Not a senior citizen");
        }
    } 
}
