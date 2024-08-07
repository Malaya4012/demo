package p2;


@SuppressWarnings("rawtypes")
public class StudentDetails implements Comparable {

	
	int id;
	String name;
	int rollno;
	float mark;
	int rank;
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", rollno=" + rollno + ", mark=" + mark + ", rank="
				+ rank + "]";
	}
	public StudentDetails(int id, String name, int rollno, float mark, int rank) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.mark = mark;
		this.rank = rank;
	}
	//@SuppressWarnings("static-access")
	@Override
	public int compareTo(Object o)
	{
		StudentDetails ob =(StudentDetails)o;
	int z = name.compareTo(ob.name);
	if(z==0) return 0;
	else if(z>0) return 1;
	else return -1;
	}
	
}
