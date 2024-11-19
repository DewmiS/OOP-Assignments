public abstract class Person {
    private String name;
    public abstract void displayInfo();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    Person(String name){
        this.name = name;
    }
}