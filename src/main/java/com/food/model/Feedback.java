package com.food.model;
import jakarta.persistence.*;


@Entity
@Table(name="Feedback")
public class Feedback {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int feed_id;
	
	@Column(name="Name")
	private String cust_name;
	
	@Column(name="Hospitality")
	private String hospitality;
	
	@Column(name="Quality")
	private String quality;
	
	@Column(name="Suggestion")
	private String suggestion;

	public int getFeed_id() {
		return feed_id;
	}

	public void setFeed_id(int feed_id) {
		this.feed_id = feed_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getHospitality() {
		return hospitality;
	}

	public void setHospitality(String hospitality) {
		this.hospitality = hospitality;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	@Override
	public String toString() {
		return "Feedback [feed_id=" + feed_id + ", cust_name=" + cust_name + ", hospitality=" + hospitality
				+ ", quality=" + quality + ", suggestion=" + suggestion + "]";
	}

	public Feedback(int feed_id, String cust_name, String hospitality, String quality, String suggestion) {
		super();
		this.feed_id = feed_id;
		this.cust_name = cust_name;
		this.hospitality = hospitality;
		this.quality = quality;
		this.suggestion = suggestion;
	}

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
