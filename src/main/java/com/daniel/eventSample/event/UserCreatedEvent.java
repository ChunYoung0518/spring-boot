package com.daniel.sample.event;

import org.springframework.context.ApplicationEvent;

public class UserCreatedEvent extends ApplicationEvent {

    private long userId;
    private String firstName;
    private String lastName;

    public UserCreatedEvent(Object source, long userId, String firstName, String lastName) {
        super(source);
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
