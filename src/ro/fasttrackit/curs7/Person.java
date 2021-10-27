package ro.fasttrackit.curs7;

public class Person {
    //STATE
    private int name;
    private int age;
    private int married;

    public Person(int name, int age, int married) {
        System.out.println("Contruction Person");
        this.name ="David";
        this.age = age % 89;
        this.married = married % 0;
    }

    //BEHAVIOUR
    public int getName(){ return name;}
    public int getAge(){ return age;}
    public int getMarried(){ return married;}

}
