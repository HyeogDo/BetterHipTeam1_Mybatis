package com.team1.betterhip2.dto;

public class CakeInfoDto {
	String cake_name;
	int cake_saleprice;
	String cake_status;
	byte[] cake_img;
	int customize_id;
	String customize_taste;
	String customize_size;
	String customize_cream_type;
	String customize_cream_color;
	int customize_saleprice;
	int review_id;
	String review_content;
	String review_date;
	int review_star;
	String purchase_user_id;
	
	public CakeInfoDto() {
		// TODO Auto-generated constructor stub
	}

	public CakeInfoDto(String cake_name, int cake_saleprice, String cake_status, byte[] cake_img, int customize_id,
			String customize_taste, String customize_size, String customize_cream_type, String customize_cream_color,
			int customize_saleprice, int review_id, String review_content, String review_date, int review_star,
			String purchase_user_id) {
		super();
		this.cake_name = cake_name;
		this.cake_saleprice = cake_saleprice;
		this.cake_status = cake_status;
		this.cake_img = cake_img;
		this.customize_id = customize_id;
		this.customize_taste = customize_taste;
		this.customize_size = customize_size;
		this.customize_cream_type = customize_cream_type;
		this.customize_cream_color = customize_cream_color;
		this.customize_saleprice = customize_saleprice;
		this.review_id = review_id;
		this.review_content = review_content;
		this.review_date = review_date;
		this.review_star = review_star;
		this.purchase_user_id = purchase_user_id;
	}

	public String getCake_name() {
		return cake_name;
	}

	public void setCake_name(String cake_name) {
		this.cake_name = cake_name;
	}

	public int getCake_saleprice() {
		return cake_saleprice;
	}

	public void setCake_saleprice(int cake_saleprice) {
		this.cake_saleprice = cake_saleprice;
	}

	public String getCake_status() {
		return cake_status;
	}

	public void setCake_status(String cake_status) {
		this.cake_status = cake_status;
	}

	public byte[] getCake_img() {
		return cake_img;
	}

	public void setCake_img(byte[] cake_img) {
		this.cake_img = cake_img;
	}

	public int getCustomize_id() {
		return customize_id;
	}

	public void setCustomize_id(int customize_id) {
		this.customize_id = customize_id;
	}

	public String getCustomize_taste() {
		return customize_taste;
	}

	public void setCustomize_taste(String customize_taste) {
		this.customize_taste = customize_taste;
	}

	public String getCustomize_size() {
		return customize_size;
	}

	public void setCustomize_size(String customize_size) {
		this.customize_size = customize_size;
	}

	public String getCustomize_cream_type() {
		return customize_cream_type;
	}

	public void setCustomize_cream_type(String customize_cream_type) {
		this.customize_cream_type = customize_cream_type;
	}

	public String getCustomize_cream_color() {
		return customize_cream_color;
	}

	public void setCustomize_cream_color(String customize_cream_color) {
		this.customize_cream_color = customize_cream_color;
	}

	public int getCustomize_saleprice() {
		return customize_saleprice;
	}

	public void setCustomize_saleprice(int customize_saleprice) {
		this.customize_saleprice = customize_saleprice;
	}

	public int getReview_id() {
		return review_id;
	}

	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}

	public String getReview_content() {
		return review_content;
	}

	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}

	public String getReview_date() {
		return review_date;
	}

	public void setReview_date(String review_date) {
		this.review_date = review_date;
	}

	public int getReview_star() {
		return review_star;
	}

	public void setReview_star(int review_star) {
		this.review_star = review_star;
	}

	public String getPurchase_user_id() {
		return purchase_user_id;
	}

	public void setPurchase_user_id(String purchase_user_id) {
		this.purchase_user_id = purchase_user_id;
	}
	
	
	
}
