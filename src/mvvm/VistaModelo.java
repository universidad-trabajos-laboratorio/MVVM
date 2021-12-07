package mvvm;


import com.sun.xml.internal.bind.v2.runtime.property.ValueProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import mvvm.Modelo;


public class VistaModelo {

    private Modelo modelo;
    private StringProperty a;
    private StringProperty b;
    
    private ValueProperty c;
    
    private String tipoOperacion = "OPERACION";
    private StringProperty resultado;

    public ObservableList llenarCombobox(){
        ObservableList<String> items = FXCollections.observableArrayList();
        items.addAll("SUMA", "RESTA", "DIVISION", "MULTIPLICACION");
        
        return items;
        
    }
    public void setTipoOperacion(String tipo){
        tipoOperacion = tipo;
    }
    
    
    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    


    public StringProperty getentradaA() {
        if (a == null) {
            a = new SimpleStringProperty(this, "a", "0");
        }
        return a;
    }

    public StringProperty getentradaB() {
        if (b == null) {
            b = new SimpleStringProperty(this, "b", "0");
        }
        return b;
    }

    public StringProperty salidaResultado() {
        if (resultado == null) {
            resultado = new SimpleStringProperty(this, "resultado", "0");
        }
        return resultado;
    }

    private void setSalida(String output) {
        salidaResultado().set(output);
    }

    public void salida() {
       String inputa = getentradaA().get();
        String inputb = getentradaB().get();
        modelo.setA(Double.parseDouble(inputa));
        modelo.setB(Double.parseDouble(inputb));
        String respuesta ="";
        
        switch(tipoOperacion){
            case "SUMA":
                respuesta = String.valueOf(modelo.sumar());
                break;
            case "RESTA":
                respuesta = String.valueOf(modelo.restar());
                break;
            case "MULTIPLICACION":
                respuesta = String.valueOf(modelo.multiplicar());
                break;
            case "DIVISION":
                respuesta = String.valueOf(modelo.dividir());
                break;
            default:
                respuesta = "Escoja una Operación";
        }
        setSalida(respuesta);
    
}

  

}
