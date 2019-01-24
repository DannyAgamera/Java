package SquareRooter;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Danny Agamera
 */
public class Main extends Application {
    
    @Override
    public void start(Stage mainStage) throws IOException {
        Parent mainParent = FXMLLoader.load(getClass().getResource("SquareRooter.fxml"));
        
        Scene mainScene = new Scene(mainParent);
        mainStage.setScene(mainScene);
        mainStage.initStyle(StageStyle.UNDECORATED);
        mainStage.show();
    }
    
    //main method
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

