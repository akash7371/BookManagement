package com.akash.BookManagement;
import java.io.*;
@SuppressWarnings("serial")
public class BookBean implements Serializable {
	
	private String bCode;
	private String bName;
	private String bAuthor;
	private float bPrice;
	private int bQty;
	
	public BookBean() {}

	public String getbCode() {
		return bCode;
	}

	public void setbCode(String bCode) {
		this.bCode = bCode;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbAuthor() {
		return bAuthor;
	}

	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}

	public float getbPrice() {
		return bPrice;
	}

	public void setbPrice(float bPrice) {
		this.bPrice = bPrice;
	}

	public int getbQty() {
		return bQty;
	}

	public void setbQty(int bQty) {
		this.bQty = bQty;
	}
	
}
