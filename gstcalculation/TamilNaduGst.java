package gstcalculation;

public class TamilNaduGst extends Gst {
	double tamilNaduExtraCharge;
	
	public TamilNaduGst(String product, double amount, double tamilNaduExtraCharge) {
        super("Tamil Nadu", product, amount);
        this.tamilNaduExtraCharge = tamilNaduExtraCharge;
    }
	
	@Override
    public double calculateGST() {
        double gstRate = 19.5;
        double gst = amount * gstRate / 100;
        gst = gst + tamilNaduExtraCharge;
        System.out.println("GST in Tamil Nadu: " + gst);
        return gst;
    }

    public void showExtraCharge() {
        System.out.println("Tamil Nadu Extra Charge: " + tamilNaduExtraCharge);
    }
}
