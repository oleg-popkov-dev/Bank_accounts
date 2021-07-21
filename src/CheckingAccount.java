import java.sql.SQLOutput;

public class CheckingAccount extends Account{


    public CheckingAccount(String accountName, int amount){
        super(accountName, amount);
    }


    @Override
    public boolean transfer(Account account, int amount){
        if (this.amount < amount) {
            System.out.println("Недостаточно средств для совершения перевода");
            return false;
        }
        if (!account.addMoney(amount)) {
            System.out.println("Перевод с: " + accountName + " на " + account + " не удался");
            return false;
        }
        this.amount -= amount;
        System.out.println("Совершен перевод с: " + accountName + " на " + account + " - " + amount + " у.е");
        return true;
    }

    @Override
    public boolean addMoney(int amount){
        this.amount += amount;
        System.out.println("На счет: " + accountName + " внесено - " + amount + " y.e");
        return true;
    }

    @Override
    public boolean pay(int amount){
        if (this.amount < amount) {
            System.out.println("Недостаточно средств для совершения оплаты");
            return false;
        }
        this.amount -= amount;
        System.out.println("Оплата с: " + accountName + " на " + amount + " у.е");
        return true;
    }
}
