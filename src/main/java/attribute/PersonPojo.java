package attribute;

public class PersonPojo {
	private String name;
	private String surname;
	private int id;
	private String phoneNumber;
	
	public PersonPojo (String name, String surname, int id, String phoneNumber) {
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
