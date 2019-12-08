package com.lq.pojo;

public class Error {

	private Integer eid;
	private String error;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	@Override
	public String toString() {
		return "Error [eid=" + eid + ", error=" + error + "]";
	}
	
}
