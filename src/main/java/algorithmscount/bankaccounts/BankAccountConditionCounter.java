package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int min) {
        int count = 0;
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getBalance() > min) {
                count++;
            }
        }
        return count;
    }
}
