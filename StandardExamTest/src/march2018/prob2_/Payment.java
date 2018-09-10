package march2018.prob2_;

public class Payment {

	private int paymentId;
	private String cardNo;
	private PaymentType type;

	public Payment(int paymentId, String cardNo, PaymentType type) {
		
		this.paymentId = paymentId;
		this.cardNo = cardNo;
		this.type = type;
	}
	
	public int getPaymentId() {
		return paymentId;
	}

	public String getCardNo() {
		return cardNo;
	}

	public PaymentType getType() {
		return type;
	}

}
