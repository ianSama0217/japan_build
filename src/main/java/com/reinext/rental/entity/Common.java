package com.reinext.rental.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "common")
public class Common {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COMMON_ID")
	private int commonId;

	@Column(name = "GROUP_ID")
	private int groupId;

	@Column(name = "ITEM_NAME")
	private String itemName;

	public Common() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Common(int groupId, String itemName) {
		super();
		this.groupId = groupId;
		this.itemName = itemName;
	}

	public int getCommonId() {
		return commonId;
	}

	public void setCommonId(int commonId) {
		this.commonId = commonId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
