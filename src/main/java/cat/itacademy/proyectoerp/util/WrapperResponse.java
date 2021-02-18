package cat.itacademy.proyectoerp.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

//Class responsible to wrapp de Http response and the status of it
public class WrapperResponse<T> {

	private boolean success;
	private String message;
	private T object;

	public WrapperResponse(boolean success, String message, T object) {
		super();
		this.success = success;
		this.message = message;
		this.object = object;
	}

	public ResponseEntity<WrapperResponse<T>> createResponse() {
		return new ResponseEntity<>(this, HttpStatus.OK);
	}

	public ResponseEntity<WrapperResponse<T>> createResponse(HttpStatus status) {
		return new ResponseEntity<>(this, status);
	}

}