package com.noita.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class EventSource {// 事件源

    String name;

    final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public EventSource(String name){
        this.name = name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        support.firePropertyChange("name", oldName, name);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener){
        support.removePropertyChangeListener(listener);
    }

    public static void main(String[] args) {
        EventSource eventSource = new EventSource("noita");
        eventSource.addPropertyChangeListener(new EventListener());

        eventSource.setName("frankenstein");
    }

}
