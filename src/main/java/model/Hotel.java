package model;

public class Hotel {

	private int id;
	private String name;
	private String address;
	private float price;
	private String site;
	private String imagePath;
	private String ratingId;
	private String description;
		
	public Hotel() {
		super();
	}
	
	public Hotel(int id, String name, String address, float price, String site, String imagePath, String ratingId, String description) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.price = price;
		this.site = site;
		this.imagePath = imagePath;
		this.ratingId = ratingId;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getRatingId() {
		return ratingId;
	}

	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}