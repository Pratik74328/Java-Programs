#include<iostream>
using namespace std;

class Account{
	private:
		int acn;
		string name;
		double balance;
	public:
		Account()
		{
			acn=121;
			name="kaka";
			balance=18000;
		}
		Account(int acn,string name,double balance)
		{
			this->acn=acn;
			this->name=name;
			this->balance=balance;
		}
		void withdraw(double amount)
		{
			if(balance>amount)
				balance=balance-amount;
			else
				cout<<"insufficent balance";
		}
		void deposit(double amount)
		{
			balance=balance+amount;
		}
		void moneyTransfer(double amount ,Account &ref )
		{
			this->balance=this->balance-amount;
			ref.balance=ref.balance+amount;
		}
		void display()
		{
			cout<<"Account:"<<acn<<endl;
			cout<<"Name:"<<name<<endl;
			cout<<"Balance:"<<balance<<endl;
		}		
};

int main()
{
	Account a1;
	a1.display();
	
	Account a2(1022,"yash",20000);
	a2.display();
	a2.moneyTransfer(8500,a1);
	a1.display();
	a2.display();
	
	
}
