package revesionrestasured;

public class pojo1 {
	
	private String instructor;
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	public pojo2 getCourses() {
		return courses;
	}
	public void setCourses(pojo2 courses) {
		this.courses = courses;
	}
	private String url;
	private String services;
	private String expertise;
	private pojo2 courses;
	 public String getLinkedIn() {
		return linkedIn;
	}
	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}
	private String linkedIn; 
	

}
