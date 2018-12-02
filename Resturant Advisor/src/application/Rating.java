package application;

public class Rating {
	private String value;
	private String amount;

	public Rating(String v, String a) {
		value = v;
		amount = a;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Rating [value=" + value + ", amount=" + amount + "]";
	}

}
