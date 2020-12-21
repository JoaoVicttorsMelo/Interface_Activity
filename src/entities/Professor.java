package entities;

import entities.interfaces.ProfessorRm;

public class Professor extends BeingHuman implements ProfessorRm {
	private String grade;
	private Integer workload;
	private int rm;

	public Professor() {
	}

	public Professor(int rm) {
		this.rm = rm;
	}

	public Professor(String name, String nin, String address, String zipCode, Integer age, String grade,
			Integer workload) {
		super(name, nin, address, zipCode, age);
		this.grade = grade;
		this.workload = workload;
	}

	

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Integer getWorkload() {
		return workload;
	}

	public void setWorkload(Integer workload) {
		this.workload = workload;
	}

	
	
	@Override
	public String toString() {
		return "Professor [grade=" + grade + ", workload=" + workload + ", getName()=" + getName() + ", getNin()="
				+ getNin() + ", getAddress()=" + getAddress() + ", getZipCode()=" + getZipCode() + ", getAge()="
				+ getAge() + "]";
	}

	@Override
	public boolean rm() {
		return rm == 552003;
	}

	@Override
	public boolean rm(int rm) {
		this.rm = rm;
		return rm();
	}

}
