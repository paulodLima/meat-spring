package com.meat.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurants")
public class Restaurants {
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "delivery_estimate")
	private String deliveryEstimate;
	
	@Column(name = "rating")
	private double rating;
	
	@Column(name = "image_path")
	private String imagePath;
	
	@Column(name = "about")
	private String about;
	
	@Column(name = "hours")
	private String hours;
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getDeliveryEstimate() {
		return deliveryEstimate;
	}
	
	public void setDeliveryEstimate(String deliveryEstimate) {
		this.deliveryEstimate = deliveryEstimate;
	}
	
	public double getRating() {
		return rating;
	}
	
	public void setReting(double rating) {
		this.rating = rating;
	}
	
	public String getImagePath() {
		return imagePath;
	}
	
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	public String getAbout() {
		return about;
	}
	
	public void setAbout(String about) {
		this.about = about;
	}
	
	public String getHours() {
		return hours;
	}
	
	public void setHours(String hours) {
		this.hours = hours;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Restaurants other = (Restaurants) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
	

