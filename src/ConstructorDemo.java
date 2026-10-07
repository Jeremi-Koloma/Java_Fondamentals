public class ConstructorDemo {

    public static void main(String[] args) {

        Account bobsAccount = new Account();
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250.0);
        bobsAccount.withdrawFunds(50.0);
        System.out.println("\n");

        Account bobsAccountParams = new Account(
                "1234",
                1000.0,
                "Bob Brown",
                "exemple@gmail.com",
                "1234");
        bobsAccountParams.withdrawFunds(500);
        bobsAccountParams.depositFunds(800);
        bobsAccountParams.withdrawFunds(50.0);

        System.out.println("\n");
        Customer customer = new Customer("Tim", 100.0, "tim@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getCreditLimit());

        System.out.println("\n");
        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getEmail());
        System.out.println(secondCustomer.getCreditLimit());

        System.out.println("\n");
        Customer thirdCustomer = new Customer("Jeo", "joe@gmail.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getEmail());
        System.out.println(thirdCustomer.getCreditLimit());
    }
}
