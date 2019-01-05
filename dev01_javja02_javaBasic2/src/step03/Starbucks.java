package step03;

public class Starbucks{
	private String location;
	private Coffee coffee;
	
	
	public Starbucks(String location, Coffee c01) {

		this.location = location;
		this.coffee = c01;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Coffee getCoffee() {
		return coffee;
	}
	
	public String toString(){
		return "지점 : " + getLocation()+", 커피 : [ "+coffee.info()+" ] ";
	}
	
}
