package com.iris.ipcd.msg;

import java.util.Map;

public class SetDeviceInfoResponse implements Response<SetDeviceInfoCommand> {
	
	private Device device;
	private SetDeviceInfoCommand request;
	private Status status;
	private Map<String, Object> response;
	
	public Device getDevice() {
		return device;
	}
	
	public void setDevice(Device device) {
		this.device = device;
	}
	
	public SetDeviceInfoCommand getRequest() {
		return request;
	}
	
	public void setRequest(SetDeviceInfoCommand request) {
		this.request = request;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public Map<String, Object> getResponse() {
		return response;
	}
	
	public void setResponse(Map<String, Object> response) {
		this.response = response;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((device == null) ? 0 : device.hashCode());
		result = prime * result + ((request == null) ? 0 : request.hashCode());
		result = prime * result
				+ ((response == null) ? 0 : response.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SetDeviceInfoResponse other = (SetDeviceInfoResponse) obj;
		if (device == null) {
			if (other.device != null)
				return false;
		} else if (!device.equals(other.device))
			return false;
		if (request == null) {
			if (other.request != null)
				return false;
		} else if (!request.equals(other.request))
			return false;
		if (response == null) {
			if (other.response != null)
				return false;
		} else if (!response.equals(other.response))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "SetDeviceInfoResponse [device=" + device + ", request="
				+ request + ", status=" + status + ", response=" + response
				+ "]";
	} 
}
