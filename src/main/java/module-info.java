module com.module6assignment.module6assignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;

    requires org.kordamp.bootstrapfx.core;
    requires org.jsoup;

    opens com.module6assignment.module6assignment to javafx.fxml;
    exports com.module6assignment.module6assignment;
}