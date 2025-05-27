module com.dnbsammie {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.dnbsammie.controllers to javafx.fxml;
    opens com.dnbsammie to javafx.fxml;

    exports com.dnbsammie;
}
