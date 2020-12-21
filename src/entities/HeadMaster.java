package entities;

import entities.interfaces.Acess;

public class HeadMaster extends BeingHuman implements Acess {
	private String school;
	private Integer hourWork;
	private String login;
	private String password;

	public HeadMaster() {
	}

	public HeadMaster(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public HeadMaster(String name, String nin, String address, String zipCode, Integer age, String school,
			Integer hourWork) {
		super(name, nin, address, zipCode, age);
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public void setEscola(String school) {
		this.school = school;
	}

	public Integer getHourWork() {
		return hourWork;
	}

	public void setHourWork(Integer hourWork) {
		this.hourWork = hourWork;
	}
	
	

	@Override
	public String toString() {
		return "HeadMaster [school=" + school + ", hourWork=" + hourWork + ", getName()=" + getName() + ", getNin()=" + getNin() + ", getAddress()=" + getAddress()
				+ ", getZipCode()=" + getZipCode() + ", getAge()=" + getAge() + "]";
	}

	@Override
	public boolean acess() {
		return login.equalsIgnoreCase("diretor") && password.equalsIgnoreCase("123");
	}

	@Override
	public boolean acess(String login, String password) {
		this.login = login;
		this.password = password;
		return acess();
	}



}
