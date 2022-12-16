import exceptions.AgeException;
import utill.Showable;
import utill.Swimmable;
import utill.PlaceEnum;

import java.util.ArrayList;
import java.util.Objects;

public class Baby extends Human implements Swimmable, Showable {
    private boolean swimming = false;
    private boolean isSinking = false;

    // ого, это что ArrayList
    private final ArrayList<Skills> skills = new ArrayList<>();
    public Baby(String name, String size, int age) throws AgeException {
        super(name, size, age);
        if (age < 0) throw new AgeException("Возраст не может быть меньше 0");

        System.out.println("Персонаж малышка Мю создан");
    }

    // методы (действия малышки)

    // inner static class
    public static class Actions {
        public static void lookAround(String name) {
            System.out.println(name + " оглядевшись вокург");
        }
        public static void notice(String name, Tray tray, Box box) throws NullPointerException {
            if (tray == null)
                throw new NullPointerException("Название подноса не может быть null или пустым");
            if (box == null)
                throw new NullPointerException("Название шкатулки не может быть null или пустым");
            System.out.println(name + " заметила рядом " + tray + " и " + box);
        }


        public static void choose(Box box) {
            System.out.println("Малышка выбрала " + box.toString());
        }

        public static void thinks() {
                System.out.println("Недолго думает... (хотя пирожки еще остались на подносе)");
            }

        public static void getIn(Box box) {

            System.out.println("Залезает в " + box.toString());
        }
    }


    public ArrayList<Skills> getSkills() {
        return skills;
    }

    public void addSkill(Skills skill) {
        if (skills.add(skill)) {
            System.out.println("Объекту " + this.getName() + " добавлено умение " + skill.getName());
        } else {
            System.out.println("Произошла ошибка");
        }
    }

    @Override
    public void swim() {
        System.out.println("Малышка продолжила плыть, как пробочка");
        swimming = true;
        isSinking = false;
    }

    @Override
    public void snort() {
        System.out.println("Отфыркивается и отплевывается");
    }

    @Override
    public void showUp() {
        System.out.println(getName() + " показалась на " + PlaceEnum.SURFACE);
    }

    @Override
    public void getOutOfTheWater() {
        if (getSize().equals("маленькая")) {
            isSinking = false;
            System.out.println("Персонаж " + getName() + " покинула " + PlaceEnum.WHIRLPOOL);
            snort();
            showUp();
        } else {
            System.out.println("Персонаж утонул");
        }
    }


    @Override
    public String toString() {
        return "Малышка " + this.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Baby baby  = (Baby) o;
        return swimming == baby.swimming && isSinking == baby.isSinking;
    }

    @Override
    public int hashCode() {
        return Objects.hash(swimming, isSinking);
    }

}
