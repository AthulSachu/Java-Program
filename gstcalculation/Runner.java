package gstcalculation;

public class Runner {
    public static void main(String[] args) {
        KeralaGst kerala = new KeralaGst("Refrigerator", 2000.0, 60.0);
        System.out.println("Kerala GST Calculation:");
        kerala.displayInfo();
        kerala.calculateGST();
        kerala.showAdditionalTax();
        System.out.println();
        
        KarnatakaGst karnataka = new KarnatakaGst("Washing Machine", 1500.0, 50.0);
        System.out.println("Karnataka GST Calculation:");
        karnataka.displayInfo();
        karnataka.calculateGST();
        karnataka.showExtraCharge();
        System.out.println();

        TamilNaduGst tamilNadu = new TamilNaduGst("Air Conditioner", 2500.0, 70.0);
        System.out.println("Tamil Nadu GST Calculation:");
        tamilNadu.displayInfo();
        tamilNadu.calculateGST();
        tamilNadu.showExtraCharge();
        System.out.println();
    }
}

