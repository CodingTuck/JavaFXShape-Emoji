package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;

//Mitchell J Tucker SPC ID#2429488
public class Emoji extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		//make head and set properties
		Circle head = new Circle();
		head.setStroke(Color.BLACK);
		head.setFill(Color.YELLOW);
		head.setStrokeWidth(4);
		head.setCenterX(150);
		head.setCenterY(150);
		head.setRadius(150);
		
		//create left circle glasses
		Circle leftLense = new Circle();
		leftLense.setStroke(Color.BLACK);
		leftLense.setFill(Color.TRANSPARENT);
		leftLense.setStrokeWidth(6);
		leftLense.setCenterX(75);
		leftLense.setCenterY(100);
		leftLense.setRadius(55);
		
		//create right circle glasses
		Circle rightLense = new Circle();
		rightLense.setStroke(Color.BLACK);
		rightLense.setFill(Color.TRANSPARENT);
		rightLense.setStrokeWidth(6);
		rightLense.setCenterX(220);
		rightLense.setCenterY(100);
		rightLense.setRadius(55);
		
		//create line to connect lenses
		Rectangle line = new Rectangle();
		line.setX(135);
		line.setY(100);
		line.setWidth(25);
		line.setStroke(Color.BLACK);
		line.setFill(Color.BLACK);
		line.setStrokeWidth(8);
		
		
		
		//create ellipse for eyes and set properties
		Ellipse leftEye = new Ellipse();
		leftEye.setCenterX(90);
		leftEye.setCenterY(100);
		leftEye.setRadiusX(15);
		leftEye.setRadiusY(25);
		leftEye.setStroke(Color.SADDLEBROWN);
		leftEye.setFill(Color.SADDLEBROWN);
		
		Ellipse rightEye = new Ellipse();
		rightEye.setCenterX(205);
		rightEye.setCenterY(100);
		rightEye.setRadiusX(15);
		rightEye.setRadiusY(25);
		rightEye.setStroke(Color.SADDLEBROWN);
		rightEye.setFill(Color.SADDLEBROWN);
		
		//create arc for mouth
		Arc mouth = new Arc();
		mouth.setCenterX(150);
		mouth.setCenterY(160);
		mouth.setRadiusX(80);
		mouth.setRadiusY(75);
		mouth.setStartAngle(220);
		mouth.setLength(100);
		mouth.setType(ArcType.OPEN);
		mouth.setStroke(Color.SADDLEBROWN);
		mouth.setStrokeWidth(15);
		mouth.setFill(Color.TRANSPARENT);
		
		//create the group to show place them with one another
		Group smiley = new Group();
		smiley.getChildren().addAll(head, leftEye, rightEye, mouth, leftLense, rightLense, line);
		
		//create scene and place it on stage
		Scene scene = new Scene(smiley, 300, 400);
		primaryStage.setTitle("Circle");
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
