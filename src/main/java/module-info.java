module com.example.designpattern {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;


    opens com.example.designpattern to javafx.fxml;
    exports com.example.designpattern;
}