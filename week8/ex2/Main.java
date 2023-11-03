package week8.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account("Shamkhal", "Huseynzada", 100));
        accountList.add(new Account("Gulagha", "Abdullazade", 1000));
        accountList.add(new Account("Shamkhal", "Huseynzada", 50));

        System.out.println(accountList);
        Collections.sort(accountList, new BalanceComparator());
        
        System.out.println(accountList);
    }
}

class FullNameComparator implements Comparator<Account> {

    @Override
    public int compare(Account o1, Account o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}

class BalanceComparator implements Comparator<Account> {

    @Override
    public int compare(Account o1, Account o2) {
        return Double.compare(o1.getBalance(),o2.getBalance());
    }
}