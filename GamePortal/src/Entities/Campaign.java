package Entities;

public class Campaign {
	private int id;
	private String name;
	private String description;
	private int discountRate;
	
	public Campaign(int id, String name, String description, int discountRate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	
}
