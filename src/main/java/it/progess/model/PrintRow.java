package it.progess.model;



public class PrintRow implements Comparable<PrintRow> {
	private int row_position;
	private String row_code;
	private String row_description;
	private String row_um;
	private String row_price;
	private String row_taxrate;
	private String row_tax;
	private String row_total;
	private String row_neck;
	private String row_serialnumber;
	private String row_expiredate;
	public int getRow_position() {
		return row_position;
	}
	public void setRow_position(int row_position) {
		this.row_position = row_position;
	}
	public String getRow_code() {
		return row_code;
	}
	public void setRow_code(String row_code) {
		this.row_code = row_code;
	}
	public String getRow_description() {
		return row_description;
	}
	public void setRow_description(String row_description) {
		this.row_description = row_description;
	}
	public String getRow_um() {
		return row_um;
	}
	public void setRow_um(String row_um) {
		this.row_um = row_um;
	}
	public String getRow_price() {
		return row_price;
	}
	public void setRow_price(String row_price) {
		this.row_price = row_price;
	}
	public String getRow_taxrate() {
		return row_taxrate;
	}
	public void setRow_taxrate(String row_taxrate) {
		this.row_taxrate = row_taxrate;
	}
	public String getRow_tax() {
		return row_tax;
	}
	public void setRow_tax(String row_tax) {
		this.row_tax = row_tax;
	}
	public String getRow_total() {
		return row_total;
	}
	public void setRow_total(String row_total) {
		this.row_total = row_total;
	}
	public String getRow_neck() {
		return row_neck;
	}
	public void setRow_neck(String row_neck) {
		this.row_neck = row_neck;
	}
	public String getRow_serialnumber() {
		return row_serialnumber;
	}
	public void setRow_serialnumber(String row_serialnumber) {
		this.row_serialnumber = row_serialnumber;
	}
	public String getRow_expiredate() {
		return row_expiredate;
	}
	public void setRow_expiredate(String row_expiredate) {
		this.row_expiredate = row_expiredate;
	}
	public int compareTo(PrintRow p){
		return this.row_position;
	}
	
}
