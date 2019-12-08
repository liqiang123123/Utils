package com.lq.pojo;

public class Type {

	private Integer id;
	private String name;
	private Integer seals;
	private String phone;
	private String tname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSeals() {
		return seals;
	}
	public void setSeals(Integer seals) {
		this.seals = seals;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Type [id=" + id + ", name=" + name + ", seals=" + seals + ", phone=" + phone + ", tname=" + tname + "]";
	}
	
}
