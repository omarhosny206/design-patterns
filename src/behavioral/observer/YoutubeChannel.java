package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String name;

    public YoutubeChannel(String name) {
        this.name = name;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers(String notificationMessage) {
        observers.forEach(observer -> observer.update(notificationMessage));
    }

    public void upload(String videoName) {
        String notificationMessage = "YoutubeChannel [" + name + "] just uploaded a new video [" + videoName + "]";
        notifyAllObservers(notificationMessage);
    }
}
