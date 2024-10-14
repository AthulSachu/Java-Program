public class Camera {
	String cameraBrand;
    String resolution;
    int batteryLevel;
    int storageSpace;

    public Camera(String cameraBrand, String resolution, int batteryLevel, int storageSpace) {
    	this.cameraBrand = cameraBrand; 
    	this.resolution = resolution;
    	this.batteryLevel = batteryLevel;
    	this.storageSpace = storageSpace;
    }

    public Camera() {
    	System.out.println("No Parameterized Constructor");
    	System.out.println("\n");
    }

	public void powerOn() {
      
    }

    public void takePicture() {
      
    }

    public void chargeBattery() {
       
	}

	public void cameraDetails() {
		System.out.println("Camera Brand :" +cameraBrand);
		System.out.println("Camera Resolution :" +resolution);
		System.out.println("Battery Level :" +batteryLevel);
		System.out.println("Storage Space :" +storageSpace);
		System.out.println("\n");
	}
}