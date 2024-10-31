/**
 * Student_Grade
 */
import java.util.*;
public class Student_Grade {

        double average=0;
        double highest=0;
        double lowest=0;

        public void sum_(double grade){
           average+=grade;
        }

        public void highest_(double grade){
            if(highest<=grade)
            highest=grade;
        }
        public void lowest_(double grade){
            if(lowest>=grade||lowest==0)
            lowest=grade;
        }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Student_Grade obj=new Student_Grade();
        ArrayList<Double>grades=new ArrayList<>();

        System.out.println("Enter Marks of Student");
        boolean cond=true;
        while(cond){
            System.out.println("\nEnter Marks");
            double grade=s.nextDouble();
            if(grade>=0&&grade<=100){
                grades.add(grade);
            }
            System.out.println("\nDo you want to Enter More Marks write true");
            cond=s.nextBoolean();
            if(cond==true){
                continue;
            }else {
            break;
            }
        }
        for(double grade:grades){
            obj.sum_(grade);
            obj.highest_(grade);
            obj.lowest_(grade);
        }

        System.out.println("Average of Grade is "+(obj.average)/grades.size());
        System.out.println("HIghest of Grade is "+obj.highest);
        System.out.println("Lowest of Grade is "+obj.lowest);

    }
    
}