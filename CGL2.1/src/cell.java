
public class cell {
	boolean status;
	public cell(boolean status) {
		this.status = status;
	}
	public boolean isalive() {
		return this.status;
	}

	public String toString() {
		return "" + this.status;
	}
	
}
