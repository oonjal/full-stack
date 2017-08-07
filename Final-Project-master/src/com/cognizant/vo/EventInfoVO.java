/**
 * 
 */
package com.cognizant.vo;

import java.util.Date;
import java.util.List;

import com.cognizant.entity.EventDetail;

/**
 * @author training
 *
 */
public class EventInfoVO {

	private String eventName;
	private String location;
	private String eventType;
	private String eventDate;
	private double price;
	
	private List<EventDetail> eventDetailsList;
	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}
	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the eventType
	 */
	public String getEventType() {
		return eventType;
	}
	/**
	 * @param eventType the eventType to set
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	/**
	 * @return the eventDate
	 */
	public String getEventDate() {
		return eventDate;
	}
	/**
	 * @param eventDate the eventDate to set
	 */
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	public List<EventDetail> getEventDetailsList() {
		return eventDetailsList;
	}
	public void setEventDetailsList(List<EventDetail> eventDetailsList) {
		this.eventDetailsList = eventDetailsList;
	}
	
	
}
