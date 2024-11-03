public class Main {
    public static void main(String[] args) {

        Account a1 = new Account("0110295252","Waleed");
        Account a2 = new Account("0123456789","Mohammed",50000);

        //testing getters, setters and toString
        System.out.println(a1.getName());
        System.out.println(a1.getId());
        System.out.println(a1.getBalance());
        a1.setName("Althubyani");
        a1.setId("9876543210");
        a1.setBalance(7000);
        System.out.println(a1.toString());

        System.out.println("------------------------------------");

        //testing credit and debit methods
        System.out.println(a1.credit(3000));
        try {
            System.out.println(a1.debit(91000));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


        System.out.println("------------------------------------");
        //testing transfer method
        System.out.println(a2.transferTo(a1,9000));

        System.out.println("------------------------------------");

        System.out.println(a1);
        System.out.println("------------------------------------");
        System.out.println(a2);



        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        /*Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider
         Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider
         Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider
         Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider
         Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider
         Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider
         Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider
         Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider
         Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider
         Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider
         Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider
         Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider
         Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider
         Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider
         Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider Divider */

        Employee e1 = new Employee("1","Waleed Althubyani",8500);

        //test getters, setters and toString
        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());

        System.out.println("------------------------------------");

        e1.setId("0000000001");
        e1.setName("Waleed Mohammed Althubyani");
        try {
            e1.setSalary(-100000000);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("------------------------------------");

        System.out.println(e1.toString());

        System.out.println("------------------------------------");

        //testing getAnnualSalary and raisedSalary
        System.out.println(e1.getAnnualSalary());
        System.out.println("------------------------------------");
        try {
            System.out.println(e1.raisedSalary(5));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("------------------------------------");

        System.out.println(e1);
    }
}