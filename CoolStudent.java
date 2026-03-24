public class CoolStudent {
    String coolName = "Alex";
    int coolAge = 17;
    boolean coolOrNot = true;
    String coolStatement;

    public CoolStudent() {
        if (coolOrNot) {    
            coolStatement = coolName + " is " + coolAge + " years old, and he is very cool"; 
        } else {
            coolStatement = coolName + " is not cool :("; 
        }
        System.out.println(coolStatement);
    }
}