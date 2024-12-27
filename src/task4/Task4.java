package task4;

public class Task4 {

    public static void main(String[] args) {
        User user2 = new User(2L, "Account2", "2Account");
        Account a2 = new Account(2L, 10000L, user2);

        User user4 = new User(4L, "Account4", "4Account");
        Account a4 = new Account(4L, 1L, user4);

        User user6 = new User(6L, "Account6", "6Account");
        Account a6 = new Account(6L, 5000L, user6);

        User user8 = new User(8L, "Account8", "8Account");
        Account a8 = new Account(8L, 15000L, user8);

        User user10 = new User(10L, "Account10", "10Account");
        Account a10 = new Account(10L, 100000L, user10);

        Account[] accounts = {a2, a4, a6, a8, a10};

        AccountService service = new AccountServiceImpl(accounts);

        System.out.println(service.findAccountByOwnerId(10L));
        System.out.println();
        long value = 5000L;
        System.out.println("Number of accounts with balance greater than " + value + " is: " + service.countAccountsWithBalanceGreaterThan(value));
    }
}

interface AccountService {

    Account findAccountByOwnerId(long id);

    long countAccountsWithBalanceGreaterThan(long value);

}

class AccountServiceImpl implements AccountService{

    public Account[] accounts;

    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }


    @Override
    public Account findAccountByOwnerId(long id) {
        for(Account a : accounts){
            if (a.getOwner().getId() == id){
                return a;
            }
        }
        return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        int cnt = 0;

        for(Account a : accounts){
            if(a.getBalance() > value){
                cnt++;
            }
        }
        return cnt;
    }
}


class Account {

    private long id;
    private long balance;
    private User owner;

    public Account(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Account: \n"+
                "Owner: " + getOwner().getFirstName() + " " + getOwner().getLastName() +
                "\nAccount ID: " + getId();
    }
}

class User {

    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}