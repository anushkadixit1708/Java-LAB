package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
public class Main extends Application {
    @Override
    public void start(Stage s) {
        Label label1 = new Label("Course Code:");
        Label label2 = new Label("Course Title:");
        TextField b = new TextField();
        TilePane r = new TilePane();
        TextField l = new TextField();
        l.setPrefWidth(300);
        String[] arr1 = {"CSE1007","CSE1004","CSE2016","CSE4022","CSE2015"};
        String[] arr2 = {"Java Programming","Network and Communication","Microprocessor and Microcontrollers",
                "Natural Language Processing","Internet Programming and Web Technologies"};
                EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent e)
                    {
                        String code = b.getText();
                        for(int i=0; i<arr1.length; i++){
                            if(code.equalsIgnoreCase(arr1[i])){
                                l.setText(arr2[i]);
                                break;
                            }
                        }
                    }
                };
        b.setOnAction(event);
        r.getChildren().add(label1);
        r.getChildren().add(b);
        r.getChildren().add(label2);
        r.getChildren().add(l);
        Scene sc = new Scene(r, 300, 300);
        s.setScene(sc);
        s.show();
 }
        public static void main(String[] args) {
            launch(args);
        }
    }
