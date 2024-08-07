package p1;
import java.util.*;
import p2.StudentDetails;
public class Student {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
			try
			{
				System.out.println("Enter the number of studet Details:");
				int v1=Integer.parseInt(sc.nextLine());
				StudentDetails[] sd=new StudentDetails[v1];
				System.out.println("Enter student "+v1+"Details:");
				for(int i=0;i<sd.length;i++)
				{
					System.out.println("==Enter the "+(i+1)+" Details:===");
					System.out.println("Enter the Student Name:");
					String nm=sc.nextLine();
					System.out.println("Enter the Student id:=");
					int v= Integer.parseInt(sc.nextLine());
					System.out.println("Enter the student RollNo:");
					int v2=Integer.parseInt(sc.nextLine());
					System.out.println("Enter student full subject mark:=");
					float v3=Float.parseFloat(sc.nextLine());
					System.out.println("Enter the rank of student:");
					int v4=Integer.parseInt(sc.nextLine());
					sd[i]=	new StudentDetails(v, nm, v2, v3, v4);
					
				}
				System.out.println("=====Show***Student****Details====");
				//@SuppressWarnings("unused")
				Spliterator<StudentDetails> sp=Arrays.spliterator(sd);
				sp.forEachRemaining((k)->
				{
				System.out.println(k.toString());
				});	
				System.out.println("=====Show***Student****Details***after shorting====");
				Arrays.sort(sd);
				Spliterator<StudentDetails> sp2=Arrays.spliterator(sd);
				sp2.forEachRemaining((k)->
				{
				System.out.println(k.toString());
				});	
				}
			catch
			(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
