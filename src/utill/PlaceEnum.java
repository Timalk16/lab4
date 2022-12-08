package utill;

public enum PlaceEnum {
    WHIRLPOOL ("Водоворот"), SURFACE ("Поверхности");

    private final String title;

    PlaceEnum(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
