package mvvm;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Vista {

    private VistaModelo viewmodel;

    @FXML
    private TextField ta;
    @FXML
    private TextField tb;
    @FXML
    private TextField tsalida;
    @FXML
    private ComboBox comb;

    public void setVistamodelo(VistaModelo vm) {

        viewmodel = vm;
        comb.setItems(viewmodel.llenarCombobox());
        
        ta.textProperty().bindBidirectional(viewmodel.getentradaA());

        tb.textProperty().bindBidirectional(viewmodel.getentradaB());

        tsalida.textProperty().bindBidirectional(viewmodel.salidaResultado());

        
    }

    @FXML
    private void handleCalcular(ActionEvent event) {
        viewmodel.salida();
    }
    @FXML
    private void handleSelect(ActionEvent event) {
        viewmodel.setTipoOperacion(comb.getSelectionModel().getSelectedItem().toString());
    }

    
  
}
