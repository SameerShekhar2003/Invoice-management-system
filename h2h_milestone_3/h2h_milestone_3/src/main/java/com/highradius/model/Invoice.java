package com.highradius.model;

public class Invoice {

	int Sl_no;
	int CUSTOMER_ORDER_ID;
	int SALES_ORG;
	String DISTRIBUTION_CHANNEL;
	String DIVISION;
	double RELEASED_CREDIT_VALUE;
	String PURCHASE_ORDER_TYPE;
	int COMPANY_CODE;
	String ORDER_CREATION_DATE;
	String ORDER_CREATION_TIME;
	String CREDIT_CONTROL_AREA;
	int SOLD_TO_PARTY;
	double ORDER_AMOUNT;
	String REQUESTED_DELIVERY_DATE;
	String ORDER_CURRENCY;
	String CREDIT_STATUS;
	int CUSTOMER_NUMBER;
	double AMOUNT_IN_USD;
	String UNIQUE_CUST_ID;
	

	public Invoice() {
		
	}
  
	public Invoice(int Sl_no, int CUSTOMER_ORDER_ID, int SALES_ORG, String DISTRIBUTION_CHANNEL,
            String DIVISION, double RELEASED_CREDIT_VALUE, String PURCHASE_ORDER_TYPE,
            int COMPANY_CODE, String ORDER_CREATION_DATE, String ORDER_CREATION_TIME,
            String CREDIT_CONTROL_AREA, int SOLD_TO_PARTY, double ORDER_AMOUNT,
            String REQUESTED_DELIVERY_DATE, String ORDER_CURRENCY, String CREDIT_STATUS,
            int CUSTOMER_NUMBER, double AMOUNT_IN_USD, String UNIQUE_CUST_ID) {
				this.Sl_no = Sl_no;
				this.CUSTOMER_ORDER_ID = CUSTOMER_ORDER_ID;
				this.SALES_ORG = SALES_ORG;
				this.DISTRIBUTION_CHANNEL = DISTRIBUTION_CHANNEL;
				this.DIVISION = DIVISION;
				this.RELEASED_CREDIT_VALUE = RELEASED_CREDIT_VALUE;
				this.PURCHASE_ORDER_TYPE = PURCHASE_ORDER_TYPE;
				this.COMPANY_CODE = COMPANY_CODE;
				this.ORDER_CREATION_DATE = ORDER_CREATION_DATE;
				this.ORDER_CREATION_TIME = ORDER_CREATION_TIME;
				this.CREDIT_CONTROL_AREA = CREDIT_CONTROL_AREA;
				this.SOLD_TO_PARTY = SOLD_TO_PARTY;
				this.ORDER_AMOUNT = ORDER_AMOUNT;
				this.REQUESTED_DELIVERY_DATE = REQUESTED_DELIVERY_DATE;
				this.ORDER_CURRENCY = ORDER_CURRENCY;
				this.CREDIT_STATUS = CREDIT_STATUS;
				this.CUSTOMER_NUMBER = CUSTOMER_NUMBER;
				this.AMOUNT_IN_USD = AMOUNT_IN_USD;
				this.UNIQUE_CUST_ID = UNIQUE_CUST_ID;
		}



	public int getSl_no() {
		return Sl_no;
	}



	public void setSl_no(int sl_no) {
		Sl_no = sl_no;
	}



	public int getCUSTOMER_ORDER_ID() {
		return CUSTOMER_ORDER_ID;
	}



	public void setCUSTOMER_ORDER_ID(int cUSTOMER_ORDER_ID) {
		CUSTOMER_ORDER_ID = cUSTOMER_ORDER_ID;
	}



	public int getSALES_ORG() {
		return SALES_ORG;
	}



	public void setSALES_ORG(int sALES_ORG) {
		SALES_ORG = sALES_ORG;
	}



	public String getDISTRIBUTION_CHANNEL() {
		return DISTRIBUTION_CHANNEL;
	}



	public void setDISTRIBUTION_CHANNEL(String dISTRIBUTION_CHANNEL) {
		DISTRIBUTION_CHANNEL = dISTRIBUTION_CHANNEL;
	}



	public String getDIVISION() {
		return DIVISION;
	}



	public void setDIVISION(String dIVISION) {
		DIVISION = dIVISION;
	}



	public double getRELEASED_CREDIT_VALUE() {
		return RELEASED_CREDIT_VALUE;
	}



	public void setRELEASED_CREDIT_VALUE(double rELEASED_CREDIT_VALUE) {
		RELEASED_CREDIT_VALUE = rELEASED_CREDIT_VALUE;
	}



	public String getPURCHASE_ORDER_TYPE() {
		return PURCHASE_ORDER_TYPE;
	}



	public void setPURCHASE_ORDER_TYPE(String pURCHASE_ORDER_TYPE) {
		PURCHASE_ORDER_TYPE = pURCHASE_ORDER_TYPE;
	}



	public int getCOMPANY_CODE() {
		return COMPANY_CODE;
	}



	public void setCOMPANY_CODE(int cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}



	public String getORDER_CREATION_DATE() {
		return ORDER_CREATION_DATE;
	}



	public void setORDER_CREATION_DATE(String oRDER_CREATION_DATE) {
		ORDER_CREATION_DATE = oRDER_CREATION_DATE;
	}



	public String getORDER_CREATION_TIME() {
		return ORDER_CREATION_TIME;
	}



	public void setORDER_CREATION_TIME(String oRDER_CREATION_TIME) {
		ORDER_CREATION_TIME = oRDER_CREATION_TIME;
	}



	public String getCREDIT_CONTROL_AREA() {
		return CREDIT_CONTROL_AREA;
	}



	public void setCREDIT_CONTROL_AREA(String cREDIT_CONTROL_AREA) {
		CREDIT_CONTROL_AREA = cREDIT_CONTROL_AREA;
	}



	public int getSOLD_TO_PARTY() {
		return SOLD_TO_PARTY;
	}



	public void setSOLD_TO_PARTY(int sOLD_TO_PARTY) {
		SOLD_TO_PARTY = sOLD_TO_PARTY;
	}



	public double getORDER_AMOUNT() {
		return ORDER_AMOUNT;
	}



	public void setORDER_AMOUNT(double oRDER_AMOUNT) {
		ORDER_AMOUNT = oRDER_AMOUNT;
	}



	public String getREQUESTED_DELIVERY_DATE() {
		return REQUESTED_DELIVERY_DATE;
	}



	public void setREQUESTED_DELIVERY_DATE(String rEQUESTED_DELIVERY_DATE) {
		REQUESTED_DELIVERY_DATE = rEQUESTED_DELIVERY_DATE;
	}



	public String getORDER_CURRENCY() {
		return ORDER_CURRENCY;
	}



	public void setORDER_CURRENCY(String oRDER_CURRENCY) {
		ORDER_CURRENCY = oRDER_CURRENCY;
	}



	public String getCREDIT_STATUS() {
		return CREDIT_STATUS;
	}



	public void setCREDIT_STATUS(String cREDIT_STATUS) {
		CREDIT_STATUS = cREDIT_STATUS;
	}



	public int getCUSTOMER_NUMBER() {
		return CUSTOMER_NUMBER;
	}



	public void setCUSTOMER_NUMBER(int cUSTOMER_NUMBER) {
		CUSTOMER_NUMBER = cUSTOMER_NUMBER;
	}



	public double getAMOUNT_IN_USD() {
		return AMOUNT_IN_USD;
	}



	public void setAMOUNT_IN_USD(double aMOUNT_IN_USD) {
		AMOUNT_IN_USD = aMOUNT_IN_USD;
	}



	public String getUNIQUE_CUST_ID() {
		return UNIQUE_CUST_ID;
	}



	public void setUNIQUE_CUST_ID(String uNIQUE_CUST_ID) {
		UNIQUE_CUST_ID = uNIQUE_CUST_ID;
	}
}