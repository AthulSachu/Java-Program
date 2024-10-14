public class CameraInfo {
	public static void main(String args[]) {
		//Objects using params
		Camera camera = new Camera("Nikon", "20 MP", 75, 64);

		Camera camera1 = new Camera("Sony", "30 MP", 90, 256);

		Camera camera2 = new Camera("Fujifilm", "16 MP", 50, 32);

		Camera camera3 = new Camera("Panasonic", "18 MP", 100, 64);

		Camera camera4 = new Camera("Olympus", "12 MP", 60, 16);

		Camera camera5 = new Camera("GoPro", "4K", 70, 128);

		Camera camera6 = new Camera("Blackmagic", "6K", 65, 256);

		camera.cameraDetails();
		camera1.cameraDetails();
		camera2.cameraDetails();
		camera3.cameraDetails();
		camera4.cameraDetails();
		camera5.cameraDetails();
		camera6.cameraDetails();

		//Objects using no params
		Camera camera7 = new Camera();

		Camera camera8 = new Camera();

		Camera camera9 = new Camera();

		camera7.cameraDetails();
		camera8.cameraDetails();
		camera9.cameraDetails();
	}
}