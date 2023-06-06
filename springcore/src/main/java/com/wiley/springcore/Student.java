package com.wiley.springcore;
import java.util.*;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	List<String> course=new ArrayList<String>();
	Set<String> gender = new LinkedHashSet<String>(); 
	Map<Integer,String> state=new HashMap<Integer,String>();
	
 
	public Student(int studentId, String studentName, String studentAddress, List<String> course, Set<String> gender,
			Map<Integer, String> state) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.course = course;
		this.gender = gender;
		this.state = state;
	}
	public Map<Integer, String> getState() {
		return state;
	}
	public void setState(Map<Integer, String> state) {
		this.state = state;
	}
	
	public Set<String> getGender() {
		return gender;
	}
	public void setGender(Set<String> gender) {
		this.gender = gender;
	}
	public List<String> getCourse() {
		return course;
	}
	public void setCourse(List<String> course) {
		this.course = course;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", course=" + course + ", gender=" + gender + ", state=" + state + "]";
	}
}
