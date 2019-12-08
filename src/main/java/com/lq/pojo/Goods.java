package com.lq.pojo;

public class Goods {

	private Integer gid;
	private String gname;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + "]";
	}
	public Goods(Integer gid) {
		super();
		this.gid = gid;
	}
	public Goods() {
		super();
	}
	
}
