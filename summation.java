import java.util.Scanner;
public class summation {
    public static void main(String[] args) {
       new summation().addition();
    }
    summation(){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum=addition(n1,n2);
        System.out.println(sum);
    }
    int addition(int n1,int n2){
        return n1+n2;
    }
    
}
