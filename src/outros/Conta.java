package outros;

public class Conta {

	private char choiceDepositInitial;
	private double taxDraft = 5.00;
	private int NumberAccount;
	private String NameHolder;
	private double BalanceAccount;

	public Conta(int numberAccount, String nameHolder, char choiceDepInitial) {
		choiceDepositInitial = choiceDepInitial;
		if (ChoiceDepositInitial() == true) {
			NumberAccount = numberAccount;
			NameHolder = nameHolder;
		}
	}
	
	public Conta(int numberAccount, String nameHolder, double depositInitial) {
		NumberAccount = numberAccount;
		NameHolder = nameHolder;
		DepositAccount(depositInitial);
	}

	public Boolean ChoiceDepositInitial() {
		if (choiceDepositInitial == 'n' || choiceDepositInitial == 'N') {
			BalanceAccount = 0.0;
		}

		return true;
	}

	public void DraftAccount(double value) {
		BalanceAccount -= value + taxDraft;
	}

	public void DepositAccount(double value) {
		BalanceAccount += value;
	}
	
	@Override
	public String toString()
    {
		String dadosParaImpressao  = "Conta: " 		+ NumberAccount;
			   dadosParaImpressao += ", Titular: "  + NameHolder;
			   dadosParaImpressao += ", Saldo: " 	+ String.format("%.2f", BalanceAccount);
        
		return dadosParaImpressao;        
    }
}
