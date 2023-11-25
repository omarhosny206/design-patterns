package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Observer omar = new YoutubeSubscriber("omar");
        Observer ahmed = new YoutubeSubscriber("ahmed");
        Observer mohamed = new YoutubeSubscriber("mohamed");

        YoutubeChannel youtubeChannel = new YoutubeChannel("NeetCode");

        youtubeChannel.addObserver(omar);
        youtubeChannel.addObserver(ahmed);
        youtubeChannel.addObserver(mohamed);

        youtubeChannel.upload("How to reverse a linked list?");
    }
}
