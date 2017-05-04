public class Singleton {
	private static Singleton mInstance;
	
	public static Singleton getInstance(String message) {
		if(mInstance == null) {
			mInstance = new Singleton(message);
		} else {
			mInstance.setMessage(message);
		}
		return mInstance;
	}
	
	private String mMessage;

	private Singleton(String message) {
		this.mMessage = message;
	}
	
	public void setMessage(String message) {
		this.mMessage = message;
	}

	public String getMessage() {
		return mMessage;
	}
	
	public void printMessage() {
		System.out.println(getMessage());
	}

	@Override
	public String toString() {
		return getMessage();
	}
	
}
