module com.example.oop_interfaces_innerclasses {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop_interfaces_innerclasses to javafx.fxml;
    exports com.example.oop_interfaces_innerclasses;
}