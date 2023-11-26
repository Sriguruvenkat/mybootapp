package com.example.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="account123")
public class Account {

	@Id
	@GeneratedValue
	private Long AccountNum;
	private String accountName;
	private String billingAddress;
	private String circuitId;
	private String install_woID;
	private String plan;
	private String SFDC_woID;
	private String serviceTerritory;
	private String startDate;
	private String status;
	private String orderId;
	public Long getAccountNum() {
		return AccountNum;
	}
	public void setAccountNum(Long accountNum) {
		AccountNum = accountNum;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getCircuitId() {
		return circuitId;
	}
	public void setCircuitId(String circuitId) {
		this.circuitId = circuitId;
	}
	public String getInstall_woID() {
		return install_woID;
	}
	public void setInstall_woID(String install_woID) {
		this.install_woID = install_woID;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getSFDC_woID() {
		return SFDC_woID;
	}
	public void setSFDC_woID(String sFDC_woID) {
		SFDC_woID = sFDC_woID;
	}
	public String getServiceTerritory() {
		return serviceTerritory;
	}
	public void setServiceTerritory(String serviceTerritory) {
		this.serviceTerritory = serviceTerritory;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
}
