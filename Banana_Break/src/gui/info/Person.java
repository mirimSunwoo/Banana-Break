package gui.info;

public class Person {
	
	String ID,name,PW,gender;
	int age;
	
	public Person() {
		
	}
	
	public Person(String ID, String name, String PW, String gender, int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.ID = ID;
		this.PW = PW;
	
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public void setPW(String PW) {
		this.PW = PW;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	// getter
	
	
	
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public String getID() {
		return ID;
	}
	public String getPW() {
		return PW;
	}
	
	
	
	
		//toString()
		public String toString() {
			return name + "\t" + gender + "\t" + age + "\t" + ID + "\t" + PW + "\n";
		}


}
