import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enters marks of the student");
        int marks = sc.nextInt();
        String grade;
        if(marks>90){
            System.out.println("EXCELLENT");
        }
        else if(marks>=80 && marks<90){
            System.out.println("GREAT");
        }
        else if(marks>=70 && marks<80){
            System.out.println("GOOD'");
        }
        else {
            System.out.println("NEEDS IMPROVEMENT");
        }

 
             
    }   
}
