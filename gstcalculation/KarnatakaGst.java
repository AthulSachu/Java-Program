package gstcalculation;

public class KarnatakaGst extends Gst {
	double extraCharge;
	
	public KarnatakaGst(String product, double amount, double extraCharge) {
		super("Karnataka", product, amount);
		this.extraCharge = extraCharge;
	}
	
	@Override
    public double calculateGST() {
        double gstRate = 18.0; 
        double gst = amount * gstRate / 100; 
        double totalGST = gst + extraCharge; 
        System.out.println("GST in Karnataka with Extra Charge: " + totalGST);
        return totalGST;
    }
	
	public void showExtraCharge() {
        System.out.println("Extra Charge for Karnataka: $" + extraCharge);
    }
}
