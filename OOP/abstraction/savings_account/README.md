# Savings Account Exercise

## Challenge Requirements

Suppose you are working on a team responsible for building a banking system and you must develop the class that represents the savings account. As the given mission is the accomplished mission, create a new Java project named Bank. Within this project, create a class SavingsAccount, which must contemplate the following aspects:

- Attributes:
    - `balance`:  an attribute of type `double` to store the amount of money the account holds;
    - `holder`: an attribute of type `String` to store the name of the account holder.

- Methods:
    - `deposit`: this method is responsible for receiving a value of type `double` and adding it to the account balance;
    - `withdraw`: this method is responsible for receiving a value of type `double` and subtracting it from the account balance;
    - `showBalance`: this method should return a value of type `double` representing the account balance.
    - `showAccountHolder`: this method should return the name of the account holder.

This savings account has two restrictions to be taken into account in your project:

- it can only be opened if a deposit is made at the time of its opening;
- it must have the name of the account holder.


**Tip: use the constructor to add the initial deposit value to the balance at the account opening and the name of the account holder.**


## Exemple
Considering that a person opens the savings account with the initial value of R$ 50, each method should behave as follows:

- `deposit`: assuming that the account balance is R$ 50 and the value of R4 100 is passed as an argument in the `deposit`  method call, the method should add the value 100 to the balance, making the balance value updated to 150;
- `withdraw`: assuming that the account balance is R$ 50 and the value of R$ 30 is passed as an argument in the `withdraw` method call, the method should subtract the value 30 from the balance, making the balance value updated to 20;
- `showBalance`:  assuming that the account balance is R$ 50, then the return of this method should be 50.
- `showAccountHolder`: assuming that the name of the account owner is Carla Pereira, this method should return a value of type `String` containing `Carla Pereira`.


