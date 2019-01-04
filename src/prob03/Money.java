package prob03;

public class Money {

	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}
	
	public Object add(Money three) {
		return new Money(this.amount+three.amount);
	}

	public Object minus(Money two) {
		return new Money(this.amount-two.amount);
	}

	public Object multiply(Money two) {
		return new Money(this.amount*two.amount);
	}

	public Object devide(Money five) {
		return new Money(this.amount/five.amount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}
    
	
    
}
