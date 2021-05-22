package Day13;

import java.util.List;

public class User {
    private String username;
    private List<String> subscriptions;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<String> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public void subscribe(User user){}

   // public boolean isSubscribed(User user){}

    //public boolean isFreind(User user){}


}
