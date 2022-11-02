#include <iostream>
#include <string>
using namespace std;

float total = 0;

void gas(string b)
{
	string s;
	int liter, gas, price;
	gas:
	cout << "Which gasoline do you want?\n";
	cout << "1-Diesel     Price(liter)-0.80$\n2-Super      Price(liter)-2.30$\n3-Premium    Price(liter)-2.00$\n";
	cin >> gas;
	type:
	cout << "Do you want to buy by liter or by price?\n";
	cin >> s;
	if (gas == 1) {
		if (s == "liter") {
			cout << "Enter the desired liter: ";
			cin >> liter;
			total = total + liter * 0.8;
		}
		else if (s == "price") {
			cout << "Enter the desire price: ";
			cin >> price;
			total = total + price;
		}
		else{
			goto type;
		}
	}
	else if (gas == 2) {
		if (s == "liter") {
			cout << "Enter the desired liter: ";
			cin >> liter;
			total = total + liter * 2.3;
		}
		else if (s == "price") {
			cout << "Enter the desire price: ";
			cin >> price;
			total = total + price;
		}
		else{
			goto type;
		}
	}
	else if (gas == 3) {
		if (s == "liter") {
			cout << "Enter the desired liter: ";
			cin >> liter;
			total = total + liter * 2;
		}
		else if (s == "price") {
			cout << "Enter the desire price: ";
			cin >> price;
			total = total + price;
		}
		else{
			goto type;
		}
	}
	else{
		goto gas;
	}
}

void market(string a)
{
	int choose;
	cout << "\nWelcome to the market\n";
	market:
	cout << "1-Water       Price-1$\n2-Cigarettes  Price-5$\n3-Sandwich    Price-2.50$\n";
	cin >> choose;
	if (choose == 1) {
		total = total + 1;
	}
	else if (choose == 2) {
		total = total + 5;
	}
	else if (choose == 3) {
		total = total + 2.5;
	}
	else{
		goto market;
	}
}

int main()
{
	string s;
	cout << "Welcome to the gas station\n";
	way:
	cout << "Do you want gas or will you buy from the market?(gas, market, both)\n";
	cin >> s;
	if (s == "market") {
		market(s);
	}
	else if (s == "gas") {
		gas(s);
	}
	else if (s == "both") {
		gas(s);
		market(s);
	}
	else{
		goto way;
	}
	cout << "\nPlease pay " << total << "$";
	cout << "\n\nThank you for choosing us.GoodBye";
	return 0;
}
