public class Main {
public static void main(String[] args) {
    
    Bank bank = new Bank();
    bank.addCustomer("Budi", "Santoso");
    bank.addCustomer("Ani", "Putri");

    Customer customer = bank.getCustomer(0);

    Account account = new Account(500000);
    account.deposit(100000);
    customer.setAccount(account);

    System.out.println("Jumlah nasabah: " + bank.getNumOfCustomers());

    System.out.println("Nama nasabah: " + customer.getFirstName() + " " + customer.getLastName());

    System.out.println("Jumlah rekening: " + customer.getNumOfAccounts());

    System.out.println("Saldo rekening: " + customer.getAccount(0).getBalance());
}

}
