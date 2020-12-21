package entities;

public class BeingHuman {
	private String name;
	private String nin;
	private String address;
	private String zipCode;
	private Integer age;

	public BeingHuman() {
	}

	public BeingHuman(String name, String nin, String address, String zipCode, Integer age) {
		super();
		this.name = name;
		this.nin = nin;
		this.address = address;
		this.zipCode = zipCode;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNin() {
		return nin;
	}

	public void setNin(String nin) {
		this.nin = nin;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	

	
	
}
