package com.asterionix.controllers.response;

import com.asterionix.controllers.dashboard.DashBoard;

public class OriginateResponse extends AbstractResponse{

	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public OriginateResponse(Object source) {
		
		super(source);
		
	}

	public void setMessage(String msg){
		
		this.message = msg;
	}

	@Override
	public String getMessage() {
		
		return this.message;
	}
	
	

	@Override
	public void onResponse(DashBoard target, AsteriskResponse response) {
		
		target.OnOriginateResponse(response);
		
	}

}
