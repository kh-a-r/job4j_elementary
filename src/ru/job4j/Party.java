package ru.job4j;

import java.awt.*;
import java.awt.event.*;

public class Party {
    public void buildInvite() {
        Frame f = new Frame();
        Label l = new Label("Party at Tim");
        Button d = new Button("Ваша ставка");
        Button b = new Button("Restart");
        Panel p = new Panel();
        p.add(l);
    }

    public static void main(String[] args) {
        Party p = new Party();
        p.buildInvite();
    }
}
