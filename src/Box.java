import java.util.Objects;

public class Box {
    private final String name;
    private final String owner;


    public Box(String owner) {
        name = "Шкатулка";
        this.owner = owner;
        System.out.println(name + " в реке создана! " + owner + " владеет этой шкатулкой");
    }

    protected  String getName() {
        return name;
    }


    // inner class
    public class Lid {
        private final String name = "Крышка";


        public void setOpen() {
            System.out.println(this.name + " открыта");
        }

        public void setClose() {
            System.out.println(this.name + " закрыта");
        }

    }

    @Override
    public String toString() {
        return "шкатулку";
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
}
