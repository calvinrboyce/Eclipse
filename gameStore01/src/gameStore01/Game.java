package gameStore01;

public class Game {
	
	private String publisher;
	private String title;
	private String manufacturer;
	private String model;
	
	private Game() {
		super();
	} // Game()
	
	public Game(String publisher, String title, String manufacturer, String model) {
		this.publisher = publisher;
		this.title = title;
		this.manufacturer = manufacturer;
		this.model = model;
	} // Game()
	
	public String getPublisher() {
		return publisher;
	} // getPublisher()
	
	public String getTitle() {
		return title;
	} // getTitle()
	
	public String getManufacturer() {
		return manufacturer;
	} // getManufacturer()
	
	public String getModel() {
		return model;
	} // getModel()
	
	public String toString() {
		return "Publisher: " + publisher + "\nTitle: " + title + "\nManufacturer: " + manufacturer + "Model: " + model;
	}
}
