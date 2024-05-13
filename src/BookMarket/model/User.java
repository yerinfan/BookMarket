package BookMarket.model;

 abstract class User {
	 private String name;
	 private int phone;
}

  class Customer extends User {
	  private String address;
  }
 
  class admin extends User {
	  private String id;
	  private String password;
  }