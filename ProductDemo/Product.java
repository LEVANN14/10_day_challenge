package ProductDemo;

public class Product {
	
	private String name;
	private String type;
	private String place;
	private  int warrnty;
	
	public Product() {
		
	}
	
	
	public Product(String name, String type, String place, int warrnty) {
		this.name = name;
		this.type = type;
		this.place = place;
		this.warrnty = warrnty;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public int getWarrnty() {
		return warrnty;
	}


	public void setWarrnty(int warrnty) {
		this.warrnty = warrnty;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", type=" + type + ", place=" + place + ", warrnty=" + warrnty + "]";
	}
	
	
	
	

}
