package com.intissar.o;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;


public class Producto extends AnchorPane {
    @FXML // fx:id="imagenProductoImageView"
    private ImageView imagenProductoImageView; // Value injected by FXMLLoader

    @FXML // fx:id="nombreProductoLabel"
    private Label nombreProductoLabel; // Value injected by FXMLLoader

    @FXML // fx:id="stockProductoLabel"
    private Label stockProductoLabel; // Value injected by FXMLLoader


    public Producto() {
        FXMLLoader fxmlLoader = new FXMLLoader(Producto.class.getResource("/com/intissar/o/fxml/producto.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void setStock(double cantidad) {
        String style;
        if (cantidad > 100) {
            style = "verde";
        } else if (cantidad > 20) {
            style = "azul";
        } else {
            style = "rojo";
        }
        stockProductoLabel.setText(cantidad + "");
        this.getStyleClass().clear();
        this.getStyleClass().add(style);
    }


    public void setImage(Image imagen) {
        imagenProductoImageView.setImage(imagen);
    }


    public void setNombre(String nombre) {
        nombreProductoLabel.setText(nombre);
    }

    public void setName(String productoDeEjemplo) {
    }
}