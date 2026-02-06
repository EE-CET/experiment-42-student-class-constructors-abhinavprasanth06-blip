import java.util.Scanner;
public class Student{
	String name;
	int roll;
Student(String name,int roll){
	this.name = name;
	this.roll = roll;
}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String name1 = sc.next();
	int roll1 = sc.nextInt();
	String name2 = sc.next();
	int roll2 = sc.nextInt();
	Student s1 = new Student(name1,roll1);
	Student s2 = new Student(name2,roll2);
	System.out.print("Name:"+s1.name);
	System.out.print(" ");
	System.out.printf("Roll:"+s1.roll);
	System.out.println();
	System.out.print("Name:"+s2.name);
	System.out.print(" ");
	System.out.printf("Roll:"+s2.roll);

}
}
