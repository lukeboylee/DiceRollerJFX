//Program to roll a six sided die with JavaFX
//By Luke Boyle 13/01/2020

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
            String url = "https://wherethewindsblow.com/wp-content/uploads/2015/07/JUMBO-Six-sided-white-dice.jpg";
            Image i = new Image(url);
            ImageView iv = new ImageView(i);

            //When button is clicked generates a random number between 1 and 6, rounding down
            bt.setOnAction((ActionEvent) -> {
                double roll = Math.floor((Math.random() *6)+1);
                message.setText(String.valueOf((int) roll));//casts value of dice roll to int to remove decimals and sets message to this value

                //Changes image displayed to a picture of the die side that was rolled
                if(roll==1){
                    Image i1 = new Image("https://www.pinclipart.com/picdir/middle/64-644308_similiar-dice-number-1-keywords-blank-domino-clip.png");
                    iv.setImage(i1);
                }
                if(roll==2){
                    Image i2 = new Image("https://etc.usf.edu/clipart/42100/42159/die_02_42159_lg.gif");
                    iv.setImage(i2);
                }
                if(roll==3){
                    Image i3 = new Image("https://etc.usf.edu/clipart/42100/42160/die_03_42160_mth.gif");
                    iv.setImage(i3);
                }
                if(roll==4){
                    Image i4 = new Image("http://clipart-library.com/images/5TRrMgXpc.png");
                    iv.setImage(i4);
                }
                if(roll==5){
                    Image i5 = new Image("https://etc.usf.edu/clipart/42100/42162/die_05_42162_lg.gif");
                    iv.setImage(i5);
                }
                if(roll==6){
                    Image i6 = new Image("https://etc.usf.edu/clipart/42100/42164/die_06_42164_lg.gif");
                    iv.setImage(i6);
                }
            });

            //Sets dimensions for ImageViewer
            iv.setFitHeight(100);
            iv.setFitWidth(100);

            VBox root = new VBox(10, iv ,bt, message);  //Creates box
            root.setAlignment(Pos.CENTER);  //aligns box to centre of screen

            //Creates and sets stage to scene
            Scene scene = new Scene(root, 250, 250);
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
