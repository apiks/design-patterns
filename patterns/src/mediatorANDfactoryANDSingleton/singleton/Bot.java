package mediatorANDfactoryANDSingleton.singleton;

import mediatorANDfactoryANDSingleton.factory.User;

public class Bot extends User {
    String[] filters = {"cat"};
    private static Bot instance = new Bot();
    public Bot(){}

    public static Bot getInstance(){
        return instance;
    }
    public String validateMessage(String message, String permission) {
        if (permission.equalsIgnoreCase("admin")) {
            return "";
        }
        for (String filter : filters) {
            if (message.toLowerCase().contains(filter.toLowerCase())) {
                return filter;
            }
        }
        return "";
    }
}