package Parking;

public class ParkingException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ParkingException() {
		super();
	}

	public ParkingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ParkingException(String message, Throwable cause) {
		super(message, cause);
	}

	public ParkingException(String message) {
		super(message);
	}

	public ParkingException(Throwable cause) {
		super(cause);
	}

}
