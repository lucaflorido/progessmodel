package it.progess.model;


public class PrintHead {
	public static final String COMPANY_NAME="azienda";
	public static final String COMPANY_ADDRESS="azienda_indirizzo";
	public static final String COMPANY_LOCATION="azienda_localita";
	public static final String COMPANY_ID="azienda_pi";
	public static final String COMPANY_TAXCODE="azienda_cf";
	public static final String COMPANY_CCIAA="azienda_cciaa";
	
	public static final String COMPANY_PHONE="azienda_telefono";
	public static final String COMPANY_FAX="azienda_fax";
	public static final String COMPANY_MAIL="azienda_mail";
	public static final String COMPANY_MOBILE="azienda_cellulare";
	
	public static final String CUSTOMER_NAME="cliente";
	public static final String CUSTOMER_ADDRESS="cliente_indirizzo";
	public static final String CUSTOMER_LOCATION="cliente_localita";
	public static final String CUSTOMER_ID="cliente_pi";
	public static final String CUSTOMER_TAXCODE="cliente_cf";
	
	
	public static final String DOCUMENT_TYPE="tipo_documento";
	public static final String DOCUMENT_NUMBER="numero";
	public static final String DOCUMENT_DATE="data";
	public static final String DOCUMENT_PAYMENT="pagamento";
	public static final String DOCUMENT_IBAN="iban";
	
	
	private String company_name;
	private String company_address;
	private String company_address2;
	private String company_ID;
	private String company_taxcode;
	private String company_phone;
	private String company_fax;
	private String company_mail;
	private String company_code;
	private String company_zone;
	private String company_mobile;
	
	private String customer_name;
	private String customer_address;
	private String customer_address2;
	private String customer_ID;
	private String customer_taxcode;
	private String customer_phone;
	private String customer_fax;
	private String customer_mail;
	private String customer_code;
	private String customer_zone;
	private String customer_mobile;
	
	private String supplier_name;
	private String supplier_address;
	private String supplier_address2;
	private String supplier_ID;
	private String supplier_taxcode;
	private String supplier_phone;
	private String supplier_fax;
	private String supplier_mail;
	private String supplier_code;
	private String supplier_zone;
	private String supplier_mobile;
	
	private String document_name;
	private String document_code;
	private String document_number;
	private String document_payment;
	private String document_iban;
	private String document_date;
	private String document_page;
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCompany_address() {
		return company_address;
	}
	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}
	public String getCompany_address2() {
		return company_address2;
	}
	public void setCompany_address2(String company_address2) {
		this.company_address2 = company_address2;
	}
	public String getCompany_ID() {
		return company_ID;
	}
	public void setCompany_ID(String company_ID) {
		this.company_ID = company_ID;
	}
	public String getCompany_taxcode() {
		return company_taxcode;
	}
	public void setCompany_taxcode(String company_taxcode) {
		this.company_taxcode = company_taxcode;
	}
	public String getCompany_phone() {
		return company_phone;
	}
	public void setCompany_phone(String company_phone) {
		this.company_phone = company_phone;
	}
	public String getCompany_fax() {
		return company_fax;
	}
	public void setCompany_fax(String company_fax) {
		this.company_fax = company_fax;
	}
	public String getCompany_mail() {
		return company_mail;
	}
	public void setCompany_mail(String company_mail) {
		this.company_mail = company_mail;
	}
	public String getCompany_code() {
		return company_code;
	}
	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}
	public String getCompany_zone() {
		return company_zone;
	}
	public void setCompany_zone(String company_zone) {
		this.company_zone = company_zone;
	}
	public String getCompany_mobile() {
		return company_mobile;
	}
	public void setCompany_mobile(String company_mobile) {
		this.company_mobile = company_mobile;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	public String getCustomer_address2() {
		return customer_address2;
	}
	public void setCustomer_address2(String customer_address2) {
		this.customer_address2 = customer_address2;
	}
	public String getCustomer_ID() {
		return customer_ID;
	}
	public void setCustomer_ID(String customer_ID) {
		this.customer_ID = customer_ID;
	}
	public String getCustomer_taxcode() {
		return customer_taxcode;
	}
	public void setCustomer_taxcode(String customer_taxcode) {
		this.customer_taxcode = customer_taxcode;
	}
	public String getCustomer_phone() {
		return customer_phone;
	}
	public void setCustomer_phone(String customer_phone) {
		this.customer_phone = customer_phone;
	}
	public String getCustomer_fax() {
		return customer_fax;
	}
	public void setCustomer_fax(String customer_fax) {
		this.customer_fax = customer_fax;
	}
	public String getCustomer_mail() {
		return customer_mail;
	}
	public void setCustomer_mail(String customer_mail) {
		this.customer_mail = customer_mail;
	}
	public String getCustomer_code() {
		return customer_code;
	}
	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}
	public String getCustomer_zone() {
		return customer_zone;
	}
	public void setCustomer_zone(String customer_zone) {
		this.customer_zone = customer_zone;
	}
	public String getCustomer_mobile() {
		return customer_mobile;
	}
	public void setCustomer_mobile(String customer_mobile) {
		this.customer_mobile = customer_mobile;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}
	public String getSupplier_address() {
		return supplier_address;
	}
	public void setSupplier_address(String supplier_address) {
		this.supplier_address = supplier_address;
	}
	public String getSupplier_address2() {
		return supplier_address2;
	}
	public void setSupplier_address2(String supplier_address2) {
		this.supplier_address2 = supplier_address2;
	}
	public String getSupplier_ID() {
		return supplier_ID;
	}
	public void setSupplier_ID(String supplier_ID) {
		this.supplier_ID = supplier_ID;
	}
	public String getSupplier_taxcode() {
		return supplier_taxcode;
	}
	public void setSupplier_taxcode(String supplier_taxcode) {
		this.supplier_taxcode = supplier_taxcode;
	}
	public String getSupplier_phone() {
		return supplier_phone;
	}
	public void setSupplier_phone(String supplier_phone) {
		this.supplier_phone = supplier_phone;
	}
	public String getSupplier_fax() {
		return supplier_fax;
	}
	public void setSupplier_fax(String supplier_fax) {
		this.supplier_fax = supplier_fax;
	}
	public String getSupplier_mail() {
		return supplier_mail;
	}
	public void setSupplier_mail(String supplier_mail) {
		this.supplier_mail = supplier_mail;
	}
	public String getSupplier_code() {
		return supplier_code;
	}
	public void setSupplier_code(String supplier_code) {
		this.supplier_code = supplier_code;
	}
	public String getSupplier_zone() {
		return supplier_zone;
	}
	public void setSupplier_zone(String supplier_zone) {
		this.supplier_zone = supplier_zone;
	}
	public String getSupplier_mobile() {
		return supplier_mobile;
	}
	public void setSupplier_mobile(String supplier_mobile) {
		this.supplier_mobile = supplier_mobile;
	}
	public String getDocument_name() {
		return document_name;
	}
	public void setDocument_name(String document_name) {
		this.document_name = document_name;
	}
	public String getDocument_code() {
		return document_code;
	}
	public void setDocument_code(String document_code) {
		this.document_code = document_code;
	}
	public String getDocument_number() {
		return document_number;
	}
	public void setDocument_number(String document_number) {
		this.document_number = document_number;
	}
	public String getDocument_payment() {
		return document_payment;
	}
	public void setDocument_payment(String document_payment) {
		this.document_payment = document_payment;
	}
	public String getDocument_iban() {
		return document_iban;
	}
	public void setDocument_iban(String document_iban) {
		this.document_iban = document_iban;
	}
	public String getDocument_date() {
		return document_date;
	}
	public void setDocument_date(String document_date) {
		this.document_date = document_date;
	}
	public String getDocument_page() {
		return document_page;
	}
	public void setDocument_page(String document_page) {
		this.document_page = document_page;
	}
	
}
