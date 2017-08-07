/**
 * 
 */
package com.cognizant.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author training
 *
 */
@Entity
@Table(name = "event_detail", catalog = "event_management")
public class EventDetail {

	private long eventDetailId;
	private String eventType;
	private Date eventDate;
	private double price;
	private EventInfo eventInfo;

	/**
	 * @param eventDetailId
	 * @param eventType
	 * @param eventDate
	 * @param price
	 * @param eventInfo
	 */
	public EventDetail(long eventDetailId, String eventType, Date eventDate, double price, EventInfo eventInfo) {
		this.eventDetailId = eventDetailId;
		this.eventType = eventType;
		this.eventDate = eventDate;
		this.price = price;
		this.eventInfo = eventInfo;
	}

	/**
	 * 
	 */
	public EventDetail() {
	}

	/**
	 * @return the eventDetailId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EVENT_DETAIL_ID", nullable = false)
	public long getEventDetailId() {
		return eventDetailId;
	}

	/**
	 * @param eventDetailId
	 *            the eventDetailId to set
	 */
	public void setEventDetailId(long eventDetailId) {
		this.eventDetailId = eventDetailId;
	}

	/**
	 * @return the eventType
	 */
	@Column(name = "EVENT_TYPE")
	public String getEventType() {
		return eventType;
	}

	/**
	 * @param eventType
	 *            the eventType to set
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	/**
	 * @return the eventDate
	 */
	@Column(name = "EVENT_DATE")
	@Temporal(TemporalType.DATE)
	public Date getEventDate() {
		return eventDate;
	}

	/**
	 * @param eventDate
	 *            the eventDate to set
	 */
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	/**
	 * @return the price
	 */
	@Column(name = "PRICE")
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the eventInfo
	 */
	@JoinColumn(name = "EVENT_ID", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	public EventInfo getEventInfo() {
		return eventInfo;
	}

	/**
	 * @param eventInfo
	 *            the eventInfo to set
	 */
	public void setEventInfo(EventInfo eventInfo) {
		this.eventInfo = eventInfo;
	}

}
