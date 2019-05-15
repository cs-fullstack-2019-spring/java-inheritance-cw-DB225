package exe1;

public class Friend extends Person {
    private String greetingFriend = "What's up ";
    private String friend;

    public Friend(String friend) {
        this.friend = friend;
    }

    public String toString(){
        return (greetingFriend+friend);
    }
}
