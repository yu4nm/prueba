module com.example.gitprueba {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitprueba to javafx.fxml;
    exports com.example.gitprueba;
}