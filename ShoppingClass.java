class Customer {
    private String name;
    private String address;
    private boolean loginStatus;
    int id;

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
        System.out.printf("Id: %s\n", this.id);
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Address: %s\n", this.address);
        System.out.printf("Login status: %b\n", this.loginStatus);
    }

    void name(String name){
        this.name = name;
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
        cust1.name("Ydv");
        cust1.details();
    }
}
