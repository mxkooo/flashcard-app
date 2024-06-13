package io.github.mxkooo.flashcardapp;


import com.vaadin.flow.component.button.Button;


import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("hello")
public class HelloGUI extends VerticalLayout {
    public HelloGUI() {
        Button primaryButton = new Button("Primary", new Icon(VaadinIcon.ARROW_LEFT));
        add(primaryButton);
    }
}