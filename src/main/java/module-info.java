module com.example.nuevoejercicio {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nuevoejercicio to javafx.fxml;
    exports com.example.nuevoejercicio;
}