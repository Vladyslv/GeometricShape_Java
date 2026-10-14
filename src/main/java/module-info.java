module com.example.sem04 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sem04 to javafx.fxml;
    exports com.example.sem04;
}