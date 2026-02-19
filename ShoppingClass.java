class Customer {
    private String name = null;
    private String address = null;
    private boolean loginStatus = false;

    void setName(String name){
        this.name = name;
    }

    void setAddress(String address){
        this.address = address;
    }

    void login(){
        this.loginStatus = true;
    }

    void logout(){
        this.loginStatus = false;
    }

    void details(){
        System.out.println();
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Address: %s\n", this.address);
        System.out.printf("Login status: %b\n", this.loginStatus);
    }
}


public class ShoppingClass {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.details();
        cust1.setName("Ankit");
        cust1.setAddress("HYD");
        cust1.login();
        cust1.details();
        cust1.logout();
        cust1.details();
    }
}
