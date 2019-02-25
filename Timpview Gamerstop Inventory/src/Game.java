
public class Game {
	public String title;
	public double cost;
	public double price;
	public double salePrice;
	public double usedPrice;
	public double usedSalePrice;
	public int newXBCopies;
	public int usedXBCopies;
	public int newPSCopies;
	public int usedPSCopies;
	public int newWCopies;
	public int usedWCopies;
	public boolean sale = false;
	public boolean sold = false;
	
	
	public Game(String title, double cost, double price, double salePrice, double usedPrice, double usedSalePrice, int newXBCopies, 
			int usedXBCopies, int newPSCopies, int usedPSCopies, int newWCopies, int usedWCopies) {
		this.title=title;
		this.cost=cost;
		this.price=price;
		this.salePrice=salePrice;
		this.usedPrice=usedPrice;
		this.usedSalePrice=usedSalePrice;
		this.newXBCopies=newXBCopies;
		this.usedXBCopies=usedXBCopies;
		this.newPSCopies=newPSCopies;
		this.usedPSCopies=usedPSCopies;
		this.newWCopies=newWCopies;
		this.usedWCopies=usedWCopies;
	}
	
	public String Usearch(int console) {
		//1 = XBox
		//2 = PlayStation
		//3 = Wii
		switch (console) {
			case 1:
				if (sale) {
					return (title+" has "+newXBCopies+" copies on sale for $"+salePrice+", and "+usedXBCopies+" used copies on sale for $"+usedSalePrice+".");
				} else {
					return (title+" has "+newXBCopies+" copies for $"+price+", and "+usedXBCopies+" used copies for $"+usedPrice+".");
				}
				break;
			case 2:
				if (sale) {
					return (title+" has "+newPSCopies+" copies on sale for $"+salePrice+", and "+usedPSCopies+" used copies on sale for $"+usedSalePrice+".");
				} else {
					return (title+" has "+newPSCopies+" copies for $"+price+", and "+usedPSCopies+" used copies for $"+usedPrice+".");
				}
				break;
			case 3:
				if (sale) {
					return (title+" has "+newWCopies+" copies on sale for $"+salePrice+", and "+usedWCopies+" used copies on sale for $"+usedSalePrice+".");
				} else {
					return (title+" has "+newWCopies+" copies for $"+price+", and "+usedWCopies+" used copies for $"+usedPrice+".");
				}
				break;
		}
	}
	
	public String Asearch() {
		return (title+" has "+copies+" copies for $"+price+", or $"+salePrice+" on sale, and "+usedCopies+" used copies for $"+usedPrice+", or $"+usedSalePrice+" on sale.");
	}
}
