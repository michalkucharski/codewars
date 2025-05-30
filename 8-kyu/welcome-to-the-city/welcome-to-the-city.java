public class Hello{
  public String sayHello(String [] name, String city, String state){
    //code here
    return "Hello, " + String.join(" " , name) + "! Welcome to " + city + ", " + state + "!"; 
  
  }
}