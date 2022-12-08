import utill.PlaceEnum;

import java.util.Objects;

public class Place {
    private String name;
    private PlaceEnum place;



    public Place(String name) {
        this.name = name;
        System.out.println(name + " добавлена в историю");
    }


    public void getPlace(PlaceEnum place) {
        this.place = place;
        String placeName = "";

        if (place == PlaceEnum.WHIRLPOOL) placeName = "Водоворот";
        else if (place == PlaceEnum.SURFACE) placeName = "Суша";

        System.out.println(name + "  - это " + placeName);
    }



    public String getName() {
        if (name == null) return "...";
        else return name;
    }

    @Override
    public String toString() {
        return "Поток " + this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null || o.getClass() != this.getClass())) return false;
        Place place1 = (Place) o;
        return getName().equals(place1.getName()) && place == place1.place;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), place);
    }
}
