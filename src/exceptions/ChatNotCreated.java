package exceptions;

import entities.Chat;

public class ChatNotCreated extends RuntimeException {
    public ChatNotCreated(String message) {super(message);}
}
