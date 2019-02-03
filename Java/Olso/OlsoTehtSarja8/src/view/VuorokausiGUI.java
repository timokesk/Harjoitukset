package view;

import controller.VuorokausiKontrolleri;
import controller.VuorokausiKontrolleri_IF;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.VuorokausiModel;
import model.VuorokausiModel_IF;

public class VuorokausiGUI extends Application implements VuorokausiGUI_IF {
	
	private VuorokausiKontrolleri_IF kontrolleri;
	
	private Button aamuBtn;
	private Button paivaBtn;
	private Button iltaBtn;
	private Button yoBtn;
	
	private Label selite;
	
	@Override
	public void init() {
		VuorokausiModel_IF malli = new VuorokausiModel();
		kontrolleri = new VuorokausiKontrolleri(this, malli);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Tervehdys");
			
			aamuBtn = new Button();
			aamuBtn.setText("Aamu");
			aamuBtn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					kontrolleri.aamu();					
				}
			});
			
			paivaBtn = new Button();
			paivaBtn.setText("Päivä");
			paivaBtn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					kontrolleri.paiva();					
				}
			});
			
			iltaBtn = new Button();
			iltaBtn.setText("Ilta");
			iltaBtn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					kontrolleri.ilta();					
				}
			});
			
			yoBtn = new Button();
			yoBtn.setText("Yö");
			yoBtn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					kontrolleri.yo();					
				}
			});
			
			selite = new Label("Napsauta painiketta");
			
			GridPane grid = new GridPane();
	        grid.setAlignment(Pos.CENTER);
	        grid.setVgap(20);
	        grid.setHgap(10);
	        
	        grid.add(aamuBtn, 0, 0);
	        grid.add(paivaBtn, 1, 0);
	        grid.add(iltaBtn, 0, 1);
	        grid.add(yoBtn, 1, 1);
	        grid.add(selite, 0, 2);
			
			Scene scene = new Scene(grid, 400, 200);
	        primaryStage.setScene(scene);
	        primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void setTervehdys(String tervehdys) {
		this.selite.setText(tervehdys);

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
