package BookStore;

public class StockDTO {
	String pcode;
	String storecode;
	String cstock;
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getStorecode() {
		return storecode;
	}
	public void setStorecode(String storecode) {
		this.storecode = storecode;
	}
	public String getCstock() {
		return cstock;
	}
	public void setCstock(String cstock) {
		this.cstock = cstock;
	}
	@Override
	public String toString() {
		return "StockDTO [pcode=" + pcode + ", storecode=" + storecode + ", cstock=" + cstock + "]";
	}
	
	
	

}
