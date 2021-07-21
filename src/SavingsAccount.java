public class SavingsAccount extends Account {


    public SavingsAccount(String accountName, int amount) {
        super(accountName, amount);
    }

    @Override
    public boolean addMoney(int amount) {
        this.amount += amount;
        System.out.println("На счет: " + accountName + " внесено - " + amount + " y.e");
        return true;
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("Ошибка! Невозможно оплатить со сберегательного счета");
        return false;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (this.amount < amount) {
            System.out.println("Недостаточно средств для совершения перевода");
            return false;
        }
        if (!account.addMoney(amount)) {
            System.out.println("Перевод с: " + accountName + " на " + account + " не удался");
            return false;
        }
        this.amount -= amount;
        System.out.println("Совершен перевод с: " + accountName + " на " + account + " - " + amount + " y.e");
        return true;
    }




}
