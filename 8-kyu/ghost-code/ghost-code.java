public class GhostCode{
  public static String helloName(final String name){
  //  name="dumb";
    if(name == null || name.equals(""))
      return "Hello world!";
    else
      return "Hello my name is " + name;
  }
}