import java.util.Objects;

public abstract class Human  {
    private String name;
    private int age;
    private String size;



    public Human() {
    }

    public Human(String name, String size, int age) {
        this.name = name;
        this.size = size;
        this.age = age;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected  String getName() {
        return name;
    }

    protected void setSize(String size) {
        this.size = size;
    }

    protected String getSize() {
        return size;
    }


    @Override
    public String toString() {
        return "Человек " + this.name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != getClass()) return false;
        Human human  = (Human) o;
        return age == human.age && Objects.equals(getName(), human.getName()) && Objects.equals(getSize(), human.getSize());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), age, getSize());
    }
}
