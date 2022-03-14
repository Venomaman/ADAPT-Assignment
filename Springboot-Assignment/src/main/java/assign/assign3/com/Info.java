package assign.assign3.com;

public class Info {
	
	private String id;
	private String state;
	private String city;
	private String country;
	
	public Info() {
	}
	public Info(String id, String state, String city, String country) {
		super();
		this.id = id;
		this.state = state;
		this.city = city;
		this.country = country;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}
