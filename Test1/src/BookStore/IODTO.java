package BookStore;

public class IODTO {
	
	private Integer iocode;
	private Integer pcode;
	private Integer io_amount;
	private Integer storecode;
	
	public Integer getIocode() {
		return iocode;
	}
	public void setIocode(Integer iocode) {
		this.iocode = iocode;
	}
	public Integer getPcode() {
		return pcode;
	}
	public void setPcode(Integer pcode) {
		this.pcode = pcode;
	}
	public Integer getIo_amount() {
		return io_amount;
	}
	public void setIo_amount(Integer io_amount) {
		this.io_amount = io_amount;
	}
	public Integer getStorecode() {
		return storecode;
	}
	public void setStorecode(Integer storecode) {
		this.storecode = storecode;
	}
	
	@Override
	public String toString() {
		return "IODTO [iocode=" + iocode + ", pcode=" + pcode + ", io_amount=" + io_amount + ", storecode=" + storecode
				+ "]";
	}
	
	
}
