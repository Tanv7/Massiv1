module com.example.massiv1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.massiv1 to javafx.fxml;
    exports com.example.massiv1;
}