//О том, как отомстили Сторожу парка
// Если бы малышка Мю была чуть побольше, она бы непременно утонула.
// А она легко, словно пузырек, вынырнула из водоворота и, отфыркиваясь и отплевываясь, показалась на поверхности.
// Она плыла, как пробочка, и поток быстро уносил ее все дальше и дальше.
// "Страсть как забавно, -- подумала она.
// -- Вот уж удивится моя сестра!"
// Оглядевшись вокруг, она заметила плывшие рядом поднос для пирожков и шкатулку Муми-мамы.
// После недолгого раздумья (хотя на подносе еще оставалось несколько пирожков) она выбрала шкатулку и залезла туда
import exceptions.AgeException;
import exceptions.NullException;
import utill.PlaceEnum;

public class Story {
    public static void main(String[] args) throws AgeException {
        try {
            Info info = new Info();
            info.createStory();
            info.getStoryName();
            System.out.println();

            Baby baby = new Baby("Мю", "маленькая", 12);

            baby.addSkill(new Skills("Отфыркиваться"));
            baby.addSkill(new Skills("Отплевываться"));
            baby.addSkill(new Skills("Плыть"));
            baby.addSkill(new Skills("Выныривать"));
            System.out.println();


            Place whirlpool = new Place("Локация 1");
            whirlpool.getPlace(PlaceEnum.WHIRLPOOL);
            Stream stream = new Stream();
            System.out.println();


            baby.getOutOfTheWater();
            baby.swim();
            stream.carryAway(baby.getName());


            // anonymous class
            Human mom = new Human() {
                @Override
                protected void setName(String name) {
                    super.setName(name);
                }
            };
            mom.setName("Муми-Мама");

            Baby.Actions.lookAround(baby.getName());
            Box box = new Box(mom.getName());
            Tray tray = new Tray(true);
            Baby.Actions.notice(baby.getName(), tray, box);
            tray.contain();
            Baby.Actions.thinks();
            Baby.Actions.choose(box);

            // non-static inner class
            Box.Lid lid = box.new Lid();
            // крышка открыта
            lid.setOpen();
            Baby.Actions.getIn(box);


            // test
            Baby.Actions.notice(baby.getName(), null, null); // у котлина такого нет, если использовать безопасный вызов (?)
            Baby baby1 = new Baby("Мю", "маленькая", -12);



        } catch (AgeException | NullException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Конец истории...");
        }






    }
}