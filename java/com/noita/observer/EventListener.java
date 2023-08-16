package com.noita.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class EventListener implements PropertyChangeListener {// 监听器

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        System.out.println(event.getSource());
        System.out.println(event.getOldValue());
        System.out.println(event.getNewValue());
        System.out.println(event.getPropertyName());
        System.out.println(event.getPropagationId());
    }
}
