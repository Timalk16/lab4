import utill.Carryable;

import java.util.Objects;

public class Stream implements Carryable {
    private final String name;
    private final boolean fast = true;


    public Stream() {
        name = "Поток";
        System.out.println(name + " в речке создан");
    }

    @Override
    public void carryAway(String n) {
        if (fast) {
            System.out.println(name + " быстро уносит " + n + " вниз по течению!");
        } else {
            System.out.println("В речке стояча вода, персонажа никуда не уносит");
        }
    }

    @Override
    public String toString() {
        return "Поток " + this.name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null || o.getClass() != this.getClass())) return false;
        Stream stream1 = (Stream) o;
        return fast == stream1.fast && Objects.equals(name, stream1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, fast);
    }
}
