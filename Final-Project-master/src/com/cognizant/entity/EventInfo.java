/**
 * 
 */
package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author training
 *
 */
@Entity
@Table(name = "event_info", catalog = "event_management")
public class EventInfo {

	private long eventId;
	private String eventName;
	private String location;

	/**
	 * @param eventId
	 * @param eventName
	 * @param location
	 */
	public EventInfo(long eventId, String eventName, String location) {
		this.eventId = eventId;
		this.eventName = eventName;
		this.location = location;
	}

	public EventInfo() {
	}

	/**
	 * @return the eventId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EVENT_ID", nullable = false)
	public long getEventId() {
		return eventId;
	}

	/**
	 * @param eventId
	 *            the eventId to set
	 */
	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	/**
	 * @return the eventName
	 */
	@Column(name = "EVENT_NAME")
	public String getEventName() {
		return eventName;
	}

	/**
	 * @param eventName
	 *            the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	/**
	 * @return the location
	 */
	@Column(name = "LOCATION")
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

}
