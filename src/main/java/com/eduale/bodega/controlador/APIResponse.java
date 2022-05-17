package com.eduale.bodega.controlador;

import org.springframework.http.HttpStatus;

public class APIResponse {
	
	    private Integer status;
	    private String data;
	    private Object error;

	    public APIResponse() {
	        this.status = HttpStatus.OK.value();
	        this.data = data;
	        this.error = error;
	    }

	    public Integer getStatus() {
	        return status;
	    }

	    public void setStatus(Integer status) {
	        this.status = status;
	    }
	    
	   
	    public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Object getError() {
	        return error;
	    }

	    public void setError(Object error) {
	        this.error = error;
	    }
	
}
