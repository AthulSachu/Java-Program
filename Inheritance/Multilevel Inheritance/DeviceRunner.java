public class DeviceRunner {
	public static void main(String[] args) {
		Tablet device = new Tablet();

		device.brand  = "Redmi";
    	device.color = "Black";
    	device.warrantyPeriod = 1;
    	device.os = "Android";
    	device.cameraResolution = 12;
    	device.has5G = true;
    	device.screenSize = 11;       
    	device.hasStylus = true;   
    	device.batteryCapacity = 5000;

    	System.out.println("Brand Name: " + device.brand);
        System.out.println("Color: " + device.color);
        System.out.println("Warranty Period: " + device.warrantyPeriod + " year(s)");
        System.out.println("Operating System: " + device.os);
        System.out.println("Camera Resolution: " + device.cameraResolution + " MP");
        System.out.println("Has 5G: " + device.has5G);
        System.out.println("Screen Size: " + device.screenSize + " inches");
        System.out.println("Has Stylus: " + device.hasStylus);
        System.out.println("Battery Capacity: " + device.batteryCapacity + " mAh");
	}
}