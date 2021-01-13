//Program to roll a six sided die with JavaFX
//By Luke Boyle 13/01/2020

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.geometry.Pos;

public class Main extends Application {
    @Override
    public void start (Stage primaryStage){
        try{
            Text message = new Text();

            Button bt = new Button("Roll Dice!");  //creates button

            //When button is clicked generates a random number between 1 and 6, rounding down
            bt.setOnAction((ActionEvent) -> {
                double roll = Math.floor((Math.random() *6)+1);
                message.setText(String.valueOf((int) roll));  //casts value of dice roll to int to remove decimals and sets message to this value
            });

            VBox root = new VBox(10, bt, message);  //Creates box
            root.setAlignment(Pos.CENTER);  //aligns box to centre of screen

            //Creates and sets stage to scene
            Scene scene = new Scene(root, 200, 250);
            primaryStage.setTitle("Dice Roller");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e){
            e.printStackTrace();
        }
    }


    //Launches the application
    public static void main(String[] args){
        Application.launch(args);
    }
}
