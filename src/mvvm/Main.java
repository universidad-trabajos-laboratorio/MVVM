package mvvm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ResourceBundle;
import javafx.application.Application;
import static javafx.application.Application.launch;

public final class Main extends Application {

    public static void run() {
        launch();
    }

  

    @Override
    public void start( final Stage primaryStage ) throws Exception {
        primaryStage.setTitle("MVVM");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLVista.fxml"));
        
        
        Parent root = loader.load();
        //getController() no devuelve el controlador sino la Vista
        // si queremos que el controlador sea independiente de la GUI.
        Vista view = loader.getController();

        VistaModelo viewModel = new VistaModelo();
        view.setVistamodelo(viewModel);
        Modelo model = new Modelo();
        viewModel.setModelo(model);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main( String[] args ) {
        Main.run();
    }

}
