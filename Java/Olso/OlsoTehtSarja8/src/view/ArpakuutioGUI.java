package view;
	
import java.util.ArrayList;

import controller.ArpakuutioKontrolleri;
import controller.ArpakuutioKontrolleri_IF;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import model.ArpakuutioModel;
import model.ArpakuutioModel_IF;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class ArpakuutioGUI extends Application implements ArpakuutioGUI_IF {
	
	private ArpakuutioKontrolleri_IF kontrolleri;
	//ArrayList<ArpakuutioKontrolleri_IF> kontrollerit = new ArrayList<>();
	
	private Button heittoBtn;
	private Label silmalukutxt;
	private Label heitot;
	private Label tulos;
	
	@Override
	public void init() {
		ArpakuutioModel_IF malli = new ArpakuutioModel();
		kontrolleri = new ArpakuutioKontrolleri(this, malli);
		/*for (int i = 0; i < 5; i++) {
			kontrollerit.add(new ArpakuutioKontrolleri(this, malli));
		}*/
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Arpakuutio");
			
			heittoBtn = new Button();
			heittoBtn.setText("Heitä noppaa");
			heittoBtn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					kontrolleri.nopanheitto();
					/*for (int i = 0; i < 5; i++) {
						kontrollerit.get(i).nopanheitto();
					}*/
					
				}
			});
			
			silmalukutxt = new Label("Nopan arvo");
			heitot = new Label("Heitot");
			tulos = new Label("Tulokset");
			
			GridPane grid = new GridPane();
	        grid.setAlignment(Pos.CENTER);
	        grid.setVgap(20);
	        grid.setHgap(10);
	        
	        grid.add(heittoBtn, 0, 0);
	        //grid.add(silmalukutxt, 0, 1);
	        //grid.add(heitot, 1, 1);
	        grid.add(tulos, 0, 1);
	        
			
			Scene scene = new Scene(grid, 400, 200);
	        primaryStage.setScene(scene);
	        primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void setSilmaluku(int silmaluku) {
		String lukutxt = String.format("%d", silmaluku);
		this.silmalukutxt.setText(lukutxt);
	}
	
	@Override
	public void setHeitot(int heitot) {
		String heitottxt = String.format("%d", heitot);
		this.heitot.setText(heitottxt);
	}
	
	@Override
	public void setTulos(int tulos1, int tulos2, int tulos3, int tulos4, int tulos5) {
		String tulos1txt = String.format("%d", tulos1);
		String tulos2txt = String.format("%d", tulos2);
		String tulos3txt = String.format("%d", tulos3);
		String tulos4txt = String.format("%d", tulos4);
		String tulos5txt = String.format("%d", tulos5);
		int summa = tulos1+tulos2+tulos3+tulos4+tulos5;
		String summatxt = String.format("%d", summa);
		this.tulos.setText("Nopista tulee: " + tulos1txt + "," + tulos2txt + "," + tulos3txt + "," + tulos4txt + "," + tulos5txt + ", ja summa: " + summatxt);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
