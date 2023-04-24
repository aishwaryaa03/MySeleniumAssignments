package week1.day1;

public class Mobile {
	
	public void sendSMS() {
		System.out.println("Hello, this is Aishwarya");
	}
	
	protected void allowVoiceCall() {
		System.out.println("Voice call is activated");
	}
	
	private void takeVideo() {
		System.out.println("Permission required to take a video");
	}

	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.sendSMS();
		obj.allowVoiceCall();
		obj.takeVideo();
		System.out.println("Mobile functionalities are successful");
	}

}
