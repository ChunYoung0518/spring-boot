package com.daniel.sample.eventhandler;

import com.daniel.sample.event.UserCreatedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserCreatedEventHandler implements ApplicationListener<UserCreatedEvent> {

    @Override
    public void onApplicationEvent(UserCreatedEvent userCreatedEvent) {
        System.out.println("User with name " + userCreatedEvent.getFirstName() + " " + userCreatedEvent.getLastName() + " created, userId: " + userCreatedEvent.getUserId());
    }

}
