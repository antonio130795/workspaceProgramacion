package POO;

import java.time.LocalDate;
import java.time.Month;

public class CreditCard {
	private static final int NUMBER_OF_DIGIT = 16;
	private String numberCreditCard;
	private String owner;
	private LocalDate creationDate = LocalDate.now();
	
	public CreditCard(String numberCreditCard, String owner) {
		this.numberCreditCard = numberCreditCard;
		this.owner = owner;
	}
	
	public String getNumberCreditCard() {
		return numberCreditCard;
	}
	public void setNumberCreditCard(String numberCreditCard) {
		this.numberCreditCard = numberCreditCard;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	
	@Override
	public String toString() {
		return String.format("%S%n%s%nFecha validez: %d/%s%n", owner, numberCreditCard,
				creationDate.getMonthValue(),
				(""+creationDate.plusYears(4).getYear()).substring(2));
	}
	
	//validar tarjeta de credito
	public static boolean checkCreditNumber(String creaditNumberToValidate) {
		if(!creaditNumberToValidate.matches("^[0-9]{"+ NUMBER_OF_DIGIT +"}$")) 
			return false;
		//no se le puede poner public ni static por que esta dentro de un metodo 	
		class DigitControl{
			private String creditNumberWithoutDigitControl;

			public DigitControl(String creditNumberWithoutDigitControl) {
				this.creditNumberWithoutDigitControl = creditNumberWithoutDigitControl;
			}
			public String generateCreaditCardWithDigitControl(){
				int digitControl = generateDigitControl();
				return creditNumberWithoutDigitControl + digitControl;
				
			}
			private int generateDigitControl() {
				StringBuilder sBuilder = new StringBuilder(creditNumberWithoutDigitControl);
				String creditNWDCReverse = sBuilder.reverse().toString();
				int sum = 0, partialValue;
				for (int i = 0; i < creditNWDCReverse.length(); i += 2) {
						if(i % 2 == 0) {
						partialValue = (creditNWDCReverse.charAt(i) -48) *2;
						if(partialValue > 9) {
							partialValue %= 10;
							partialValue++;
						}
						}else {
							partialValue = (creditNWDCReverse.charAt(i) -48) *2;

						sum += partialValue;
						}
				}	
				return sum % 10;
		}
		}
		DigitControl dcControl = new DigitControl(creaditNumberToValidate.substring(0, NUMBER_OF_DIGIT -1));
		System.out.println(dcControl.generateCreaditCardWithDigitControl());
		System.out.println(dcControl.generateDigitControl());
		return creaditNumberToValidate.equals(dcControl.generateCreaditCardWithDigitControl());
	}
	
	public static void main(String[] args) {
		
		CreditCard credit = new CreditCard("4168818844448888", "antua");

		System.out.println(credit);
		System.out.println(CreditCard.checkCreditNumber(credit.getNumberCreditCard()));
	}
	
}

