package core_04;

public class Watch /*implements Comparable<Watch>*/ {

	private String brend;
	private int price;

	public Watch(String brend, int price) {
		super();
		this.brend = brend;
		this.price = price;
	}

	public String getBrend() {
		return brend;
	}

	public void setBrend(String brend) {
		this.brend = brend;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Watch [brend=" + brend + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brend == null) ? 0 : brend.hashCode());
		result = prime * result + price;
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
		Watch other = (Watch) obj;
		if (brend == null) {
			if (other.brend != null)
				return false;
		} else if (!brend.equals(other.brend))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

//	@Override
//	public int compareTo(Watch inWatch) {
//
////		if (this.price > inWatch.getPrice()) {
////			return 1;
////		} else if (this.price < inWatch.getPrice()) {
////			return -1;
////		} else {
////			return 0;
////		}
//		
////		return price - inWatch.getPrice();
//		
////		return brend.compareTo(inWatch.getBrend());
//		
//		
//		if (this.price > inWatch.getPrice()) {
//			return 1;
//		} else if (this.price < inWatch.getPrice()) {
//			return -1;
//		} else {
//			return brend.compareTo(inWatch.getBrend());
//		}
//
//	}
	
	
	
	
	
	
	

}
