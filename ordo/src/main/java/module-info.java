module com.dnbsammie {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dnbsammie to javafx.fxml;
    exports com.dnbsammie;
}
