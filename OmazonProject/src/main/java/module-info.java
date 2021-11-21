module com.example.omazonproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.omazonproject to javafx.fxml;
    exports com.example.omazonproject;
}