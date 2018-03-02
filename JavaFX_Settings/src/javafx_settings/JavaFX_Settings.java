/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_settings;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Gustavo
 */
public class JavaFX_Settings extends Application {
    private double xOffset = 0;
    private double yOffset = 0;
    
    @Override
    
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            root.setOnMousePressed(new EventHandler<MouseEvent>(){
            @Override
                public void handle(MouseEvent event){
                    xOffset = event.getSceneX();
                    yOffset = event.getSceneY();
                }
            });
            
            root.setOnMouseDragged(new EventHandler<MouseEvent>(){
            @Override
                public void handle(MouseEvent event){
                    stage.setX(event.getScreenX() - xOffset);
                    stage.setY(event.getScreenY() - yOffset);
                }
            });   
        
        stage.initStyle(StageStyle.TRANSPARENT);
        Scene scene = new Scene(root);  
        scene.setFill(javafx.scene.paint.Color.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
    }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
