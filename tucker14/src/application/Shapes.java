package application;

import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;

//Mitchell J Tucker SPC ID#2429488
public class Shapes extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		
		//create rectangle and set properties
		Rectangle rectangle = new Rectangle();
		rectangle.setX(100);
		rectangle.setY(100);
		
		rectangle.setWidth(175);
		rectangle.setHeight(175);
		
		rectangle.setStroke(Color.BLUE);
		rectangle.setStrokeWidth(3);
		rectangle.setFill(Color.BLUE);
		
		//create circle and set properties
		Circle circle = new Circle(100);
		circle.setStroke(Color.RED);
		
		circle.setStrokeWidth(3);
		circle.setFill(Color.RED);
		
		//create cross and set properties
		Line horizontal = new Line(-100 / 1.5, -100 / 2.5, 100 / 1.5, -100 / 2.5);
		Line vertical = new Line(0, -100, 0, 100);
		horizontal.setStroke(Color.GREEN);
		horizontal.setStrokeWidth(8);
		vertical.setStroke(Color.GREEN);
		vertical.setStrokeWidth(8);
		
		//create pane to hold cross
		StackPane cross = new StackPane(vertical, horizontal);
		
		//create grid and set its properties
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(20, 20, 20, 20));
		
		//add shapes to grid
		grid.add(cross, 1, 1);
		grid.add(rectangle, 0, 0);
		grid.add(circle, 1, 1);
		grid.add(new Group(vertical, horizontal), 2, 2);
		
		//create scene and add pane
		Scene newScene = new Scene(grid);
		
		//set name
		primaryStage.setTitle("Shapes");
		
		//add the scene to the stage
		primaryStage.setScene(newScene);
		
		//display stage
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
