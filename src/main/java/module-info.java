module com.example.o {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.intissar.o to javafx.fxml;
    exports com.intissar.o;
}