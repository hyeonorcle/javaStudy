package BookStore;

public class IODTO {
	
	String iocode;
	String pcode;
	String io_amount;
	String storecode;
	
	
	
	public String getIocode() {
		return iocode;
	}



	public void setIocode(String iocode) {
		this.iocode = iocode;
	}



	public String getPcode() {
		return pcode;
	}



	public void setPcode(String pcode) {
		this.pcode = pcode;
	}



	public String getIo_amount() {
		return io_amount;
	}



	public void setIo_amount(String io_amount) {
		this.io_amount = io_amount;
	}



	public String getStorecode() {
		return storecode;
	}



	public void setStorecode(String storecode) {
		this.storecode = storecode;
	}



	@Override
	public String toString() {
//		return "IODTO [iocode=" + iocode + ", pcode=" + pcode + ", io_amount=" + io_amount + ", storecode=" + storecode
//				+ "]";
		return String.format("%5s\t %8s\t %8s\t %10s\t",iocode, pcode,io_amount,storecode );
	}
	
	
}
