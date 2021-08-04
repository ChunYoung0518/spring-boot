package com.daniel.sample.eventhandler;

import com.daniel.sample.event.UserCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AnotatedEventHandler {

    @EventListener
    //@Async
    public void handlerUserCreatedEvent(UserCreatedEvent userCreatedEvent) {
        System.out.println("Annotated event handler. User with name " + userCreatedEvent.getFirstName() + " " + userCreatedEvent.getLastName() + " created, userId: " + userCreatedEvent.getUserId());
    }
}
