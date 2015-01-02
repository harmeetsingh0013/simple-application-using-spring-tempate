/**
 * 
 */
package com.netsol.exceptions;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public class DataNotPersist extends BaseException{

	private static final long serialVersionUID = 9076992410560763954L;

	public DataNotPersist(String errorCode, String message) {
		super(errorCode, message);
	}
}
