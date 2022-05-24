package org.openmrs.module.ehrcasebasedsurveillance.emails;

public class NotificationResult {
	
	public static int SUCCESS_STATUS = 0;
	
	public static int GENERAL_ERROR = 1;
	
	public static int IGNORED = 2;
	
	private String uuid;
	
	private String medium;
	
	private int status = SUCCESS_STATUS;
	
	private String messages;
	
	public NotificationResult(String uuid, String medium, int status, String messages) {
		this.uuid = uuid;
		this.medium = medium;
		this.status = status;
		this.messages = messages;
	}
	
	public String getUuid() {
		return uuid;
	}
	
	public int getStatus() {
		return status;
	}
	
	public String getMessage() {
		return messages;
	}
	
	public String getMedium() {
		return medium;
	}
	
}
