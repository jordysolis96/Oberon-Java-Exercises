public class Person {
    public static void main(String[] args) {

    }

    private String name;

    public String getName(){
    //TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
    //TODO: change the name property to the passed value
       this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello" + name);
    }
}
