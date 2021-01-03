module samhoque {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires jnativehook;
    requires java.logging;
    requires java.desktop;

    opens net.samhoque;
    opens net.samhoque.boost;
}