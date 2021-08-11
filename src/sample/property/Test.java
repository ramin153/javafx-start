package sample.property;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Test {

    private StringProperty text = new SimpleStringProperty(this,"text","");

    public Test(String text) {
        this.text.set( text );
    }

    public String getText() {
        return text.get();
    }

    public StringProperty textProperty() {
        return text;
    }

    public void setText(String text) {
        this.text.set(text);
    }
}
