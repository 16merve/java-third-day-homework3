package kodlamaio.entities;

public class Course {
	private int id;
	private String name;
	private int price;
	private String insturctor;
	private String category;

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInsturctor() {
		return insturctor;
	}

	public void setInsturctor(String insturctor) {
		this.insturctor = insturctor;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
