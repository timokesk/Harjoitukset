package view;

import controller.ArpakuutioKontrolleri;
import controller.ArpakuutioKontrolleri_IF;
import controller.KolikkoKontrolleri;
import controller.KolikkoKontrolleri_IF;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.ArpakuutioModel;
import model.ArpakuutioModel_IF;
import model.KolikkoModel;
import model.KolikkoModel_IF;

public class KolikkoGUI extends Application implements KolikkoGUI_IF {
	private KolikkoKontrolleri_IF kontrolleri;
	
	private Button heittoBtn;
	private Label tulos;
	
	@Override
	public void init() {
		KolikkoModel_IF malli = new KolikkoModel();
		kontrolleri = new KolikkoKontrolleri(this, malli);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Kolikonheitto");
			
			heittoBtn = new Button();
			heittoBtn.setText("Heitä kolikko");
			heittoBtn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					kontrolleri.kolikonheitto();					
				}
			});
			
			tulos = new Label("Tulos");
			
			GridPane grid = new GridPane();
	        grid.setAlignment(Pos.CENTER);
	        grid.setVgap(20);
	        grid.setHgap(10);
	        
	        grid.add(heittoBtn, 0, 0);
	        grid.add(tulos, 0, 1);
	        
			
			Scene scene = new Scene(grid, 400, 200);
	        primaryStage.setScene(scene);
	        primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void setTulos(int tulos) {
		if (tulos == 0) {
			this.tulos.setText("Kruuna");
		}
		else {
			this.tulos.setText("Klaava");
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
