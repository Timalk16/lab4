public class Tray {
    private String name;
    private boolean full = false;

    public Tray(Boolean full) {
        name = "Поднос";
        this.full = full;
        System.out.println(name + " в реке создан!");
    }

    public void contain() {
        // local inner class
        class Pies {
            String filling;

            public Pies(String filling) {
                name = "пирожки";
                this.filling = filling;
            }

            public String info() {
                return name + " с " + filling;
            }
        }
        Pies pies = new Pies("мясом");
        System.out.println("Поднос содержит " + pies.info());
    }

    protected  String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "поднос";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
