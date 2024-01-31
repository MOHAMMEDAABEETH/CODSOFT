import java.io.*;
import java.util.*;
public class StudentGrade
{
    double m1,m2,m3,m4,m5,sum,avg;
    Scanner s = new Scanner(System.in);
    public void getMarks()
    {
        System.out.println("Enter the marks:\n");
        m1=s.nextDouble();
        m2=s.nextDouble();
        m3=s.nextDouble();
        m4=s.nextDouble();
        m5=s.nextDouble();
        sum=m1+m2+m3+m4+m5;
        avg=sum/5;
    }
    
    public void displayMarks(){
        System.out.println("The marks are:\n");
        System.out.println(m1+","+m2+","+m3+","+m4+","+m5+"\n");
        System.out.println("The total is:"+sum);
        System.out.println("The average is:"+avg);
    }
    
    public void grade()
    {
        if(avg>80)
        {
            System.out.println("The grade is A");
        }
        else if(avg>60)
        {
            System.out.println("The grade is B");
        }
        else if(avg>40)
        {
            System.out.println("The grade is C");
        }
        else
        {
            System.out.println("The grade is D");
        }
    }
    
    public static void main (String[] args)
    {
        StudentGrade obj = new StudentGrade();
        obj.getMarks();
        obj.displayMarks();
        obj.grade();
    }
}
