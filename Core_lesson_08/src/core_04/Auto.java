package core_04;

public class Auto {

	

	@Override
	public String toString() {
		return "Auto [price=" + price + ", brend=" + brend + "]";
	}

	private int price;
	private String brend;

	public Auto(int price, String brend) {
		super();
		this.price = price;
		this.brend = brend;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrend() {
		return brend;
	}

	public void setBrend(String brend) {
		this.brend = brend;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((brend == null) ? 0 : brend.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (brend == null) {
			if (other.brend != null)
				return false;
		} else if (!brend.equals(other.brend))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	

}
