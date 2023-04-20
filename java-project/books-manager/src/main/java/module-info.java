module com.example.booksmanager {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.booksmanager to javafx.fxml;
    exports com.example.booksmanager;
}