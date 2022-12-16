import exceptions.NameException;

public class Info {
    private String storyName;

    public Info(String storyName) throws NameException {
        this.storyName = storyName;
        if (storyName == null) throw new NameException("название истории не может быть пустым");
        if (storyName.length() > 50) throw new NameException("название истории слишком длинное");
    }

    public void createStory() {
        System.out.println("Создается новая история");
        System.out.println("...");
        System.out.println("История создана!");
    }


    public void getStoryName() {
        System.out.println("Название истории: " + storyName);
    }

}

