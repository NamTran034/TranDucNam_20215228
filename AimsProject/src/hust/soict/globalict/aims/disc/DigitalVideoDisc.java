package hust.soict.globalict.aims.disc;
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	// Create a class attribute named "nbDigitalVideoDiscs" 
	private static int nbDigitalVideoDiscs = 0;
	
	// Create an instance attribute named "id" 
	private int id; ,
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		nbDigitalVideoDiscs++;
	    this.id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDiscs++;
	    this.id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		nbDigitalVideoDiscs++;
	    this.id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDiscs++;
	    this.id = nbDigitalVideoDiscs;
	}
	
	// Just temporarily
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost;
    }
	
	public int getID() {
        return id;
    }
	
	public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }
}
