package behavioral.observer;

public class YoutubeSubscriber implements Observer {
    private final String name;

    public YoutubeSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("YoutubeSubscriber [" + name + "] received: " + message);
    }
}
