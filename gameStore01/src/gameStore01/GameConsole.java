package gameStore01;

public class GameConsole {
	
	private String manufacturer;
	private String model;
	private int warrantyPeriod;
	
	private GameConsole() {
		super();
	} // GameConsole()
	
	public GameConsole(String manufacturer, String model, int warrantyPeriod) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.warrantyPeriod = warrantyPeriod;
	} // GameConsole()
	
	public String getManufacturer() {
		return manufacturer;
	} // getManufacturer()
	
	public String getModel() {
		return model;
	} // getModel()
	
	public int getWarrantyPeriod() {
		return warrantyPeriod;
	} // getWarrantyPeriod()
	
	public String toString() {
		return "Manufacturer: " + manufacturer + "\nModel: " + model + "\nWarranty Period (months): " + warrantyPeriod;
	}
}
