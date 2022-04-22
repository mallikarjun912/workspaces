package junit4extraref;

public class Person {
	private String firstName;
	private String lastName;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String fname, String lname) {
		if (fname==null || lname==null) {
			throw new IllegalArgumentException(" Names Cannot be NULL");
		}
		this.firstName = fname;
		this.lastName = lname;
	}

	public String getFullName() {
		String first = (this.firstName != null) ? this.firstName : "?";
		String last = (this.lastName != null) ? this.lastName : "?";
		return first + " " + last;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

}