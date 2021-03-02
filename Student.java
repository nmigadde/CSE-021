
public class Student {
	protected String name;
	protected char gender;
	protected Date birthdate;
	protected Preference pref;
	protected boolean matched;
	
	public Student() {}
	
	public Student(String name) {
		this.name = name;
		System.out.println(this.name + "student1");
	}
	
	public Student(char gender) {
		this.gender = gender;
		System.out.println(this.gender + "student2");
	}
	
	public Student(Date birthdate) {
		this.birthdate = birthdate;
		System.out.println(this.birthdate + "student3");
	}
	
	public Student(Preference pref) {
		this.pref = pref;
		System.out.println(this.pref + "student4");
	}
	
	public Student(String name, char gender, Date birthdate, Preference pref) {
		this.name = name;
		this.gender = gender;
		this.birthdate = birthdate;
		this.pref = pref;
		this.matched = false;
	}
	
	public String getName(){
		return name;	
	}
	
	public char getGender(){
		return gender;
	}
	
	public Date getBirthDate(){
		return birthdate;
	}
	
	public Preference getPref(){
		return pref;
	}
	
	public boolean getMatched(){
		return matched;
	}
	
	/* public void setMatched(){
		matched = true;
	} */
	
	/* public Student compare(Student st) {
		
	} */
	
	
}
