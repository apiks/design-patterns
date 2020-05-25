package mediatorANDfactoryANDSingleton.mediator;

import mediatorANDfactoryANDSingleton.factory.User;
import mediatorANDfactoryANDSingleton.singleton.Bot;

import java.util.ArrayList;
import java.util.Date;

public class ChatRoom {
    private static Bot bot;
    private static ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }
    public void setUsers(ArrayList<User> users) {
        ChatRoom.users = users;
    }

    public void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getUsername() + "]: " + message);

        if (bot == null) {
            if (message.toLowerCase().contains("addbot")) {
                bot = Bot.getInstance();
                bot.setUsername("Beep-Boop");
                users.add(bot);
            } else {
                return;
            }
        }

        if (user.getPermission().equalsIgnoreCase("ADMIN")) {
            return;
        }

        String validation = bot.validateMessage(message, user.getPermission());
        if (!validation.equals("")) {
            bot.kickUser(user, this);
            System.out.println(new Date().toString() + " [" + bot.getUsername() + "]: " +
                    "'" + user.getUsername() + "'" + " has been removed from the chat room for using the filtered phrase " +
                    "'" + validation +"'.");
        }
    }
}