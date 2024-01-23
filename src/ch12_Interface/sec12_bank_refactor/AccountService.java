package ch12_Interface.sec12_bank_refactor;

public interface AccountService {
	
	void createAccount();
	
	void accountList();
	
	void deposit();
	
	void withdraw();
	
	Account findAccount(String ano);
	
}