import java.util.Scanner;
public class main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  System.out.println("enter student name:");
    String name=sc.nextLine();
   System.out.println("enter marks");
    int marks=sc.nextInt();
System.out.println("\n----student details---");
System.out.println("name: "+name);
System.out.println("marks:"+marks);
if(marks>=40)
   System.out.println("result: pass");
else
   System.out.println("Result: Fail");
}
}