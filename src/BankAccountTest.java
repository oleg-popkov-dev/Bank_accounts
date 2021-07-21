public class BankAccountTest {
    public static void main(String[] args) {

        Account saving = new SavingsAccount("Сберегательный счет",100_000);
        Account checking = new CreditAccount("Расчетный счет", 50_000);
        Account credit = new CheckingAccount("Кредитка", -100_000);

        saving.transfer(checking, 5000);
        credit.pay(11_000);
        checking.pay(70_000);
        credit.addMoney(200_000);
        saving.pay(10_000);

        System.out.println("");
        System.out.println(saving.accountName + " " + saving.getAmount());
        System.out.println(checking.accountName + " " + checking.getAmount());
        System.out.println(credit.accountName + " " + credit.getAmount());


    }
}
