package com.karthik.Backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourseNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String feildName;
	private Object feildValue;

	public ResourseNotFoundException(String resourceName, String feildName, Object feildValue) {
		super(String.format("%s not found with %s : %s", resourceName, feildName, feildValue));
		this.resourceName = resourceName;
		this.feildName = feildName;
		this.feildValue = feildValue;
	}

	public String getResourceName() {
		return resourceName;
	}

	public String getFeildName() {
		return feildName;
	}

	public Object getFeildValue() {
		return feildValue;
	}
}
