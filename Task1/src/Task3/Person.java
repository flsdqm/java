package Task3;

public abstract class Person implements Walk{
    private String name;

    @Override
    public void canWalk(){
        System.out.println("walk");
    }

    public Person(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public String getName(){
        return name;
    }
}
