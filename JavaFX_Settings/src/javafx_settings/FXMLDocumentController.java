/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_settings;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Gustavo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ImageView btn_settings, btn_user, btn_resize;
    
    @FXML
    private AnchorPane h_settings, h_user;
    
    @FXML
    private void handleButtonAction(MouseEvent event) {
        if(event.getTarget() == btn_settings){
            h_settings.setVisible(true);
            h_user.setVisible(false);
        }
        
        if(event.getTarget() == btn_user){
            h_user.setVisible(true);
            h_settings.setVisible(false);
                
        }
        
        if(event.getTarget() == btn_resize){
            h_user.setVisible(false);
            h_settings.setVisible(false);
                
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
