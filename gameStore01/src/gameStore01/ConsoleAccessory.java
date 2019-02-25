package gameStore01;

public class ConsoleAccessory {
	
	private String manufacturer;
	private String model;
	private String type;
	private int warrantyPeriod;
	
	private ConsoleAccessory() {
		super();
	} // ConsoleAccessory()
	
	public ConsoleAccessory(String manufacturer, String model, String type, int warrantyPeriod) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.type = type;
		this.warrantyPeriod = warrantyPeriod;
	} // ConsoleAccessory()
	
	public String getManufacturer() {
		return manufacturer;
	} // getManufacturer()
	
	public String getModel() {
		return model;
	} // getModel()
	
	public String getType() {
		return type;
	} // getType()
	
	public int getWarrantyPeriod() {
		return warrantyPeriod;
	} // getWarranty Period()
	
	public String toString() {
		return "Manufacturer: " + manufacturer + "\nModel: " + model + "\nWarranty Period (months): " + warrantyPeriod;
	} // toString()
} // class ConsoleAccessory
