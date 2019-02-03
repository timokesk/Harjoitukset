package view;

import controller.ValuuttakoneenOhjain;
import controller.ValuuttakoneenOhjain_IF;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import model.Valuuttakone;
import model.Valuuttakone_IF;

public class ValuuttakoneenGUI extends Application implements ValuuttakoneenGUI_IF {
	
	private ValuuttakoneenOhjain_IF ohjain;
	
	@Override
	public void init() {
		Valuuttakone_IF malli = new Valuuttakone();
		ohjain = new ValuuttakoneenOhjain(this, malli);
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			primaryStage.setTitle("Valuuttakone");
			
			Button muunnaBtn = new Button();
			muunnaBtn.setText("Muunna");
			muunnaBtn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					ohjain.muunnos();
				}
			});
			
			TextField maara = new TextField("");
	        maara.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	        
	        TextField tulos = new TextField("");
	        tulos.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	        
	        String[] valuutat = ohjain.getValuutat();
	        ObservableList<String> valuuttalista = FXCollections.observableArrayList ();
	        for (int i = 0; i < valuutat.length; i++) {
	        	valuuttalista.add(valuutat[i]);
	        }
	        
	        ListView<String> mista = new ListView<String>();
	        mista.setItems(valuuttalista);
	        mista.setPrefSize(200, 200);
	        
	        ListView<String> mihin = new ListView<String>();
	        mihin.setItems(valuuttalista);
	        mihin.setPrefSize(200, 200);
	        
	        Label mistatxt = new Label("Mistä");
	        Label mihintxt = new Label("Mihin");
	        Label maaratxt = new Label("Määrä");
	        Label tulostxt = new Label("Tulos");

	        GridPane grid = new GridPane();
	        grid.setAlignment(Pos.CENTER);
	        grid.setVgap(10);
	        grid.setHgap(10);
	        
	        grid.add(mistatxt, 0, 0);
	        grid.add(mista, 0, 1);
	        grid.add(mihintxt, 1, 0);
	        grid.add(mihin, 1, 1);
	        grid.add(maaratxt, 2, 0);
	        grid.add(maara, 2, 1,1,1);
	        grid.add(muunnaBtn, 2, 0, 1,2);
	        grid.add(tulostxt, 2,0,1, 3);
	        grid.add(tulos, 2, 0,1,4);

	        Scene scene = new Scene(grid, 600, 200);
	        primaryStage.setScene(scene);
	        primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int getLähtöIndeksi() {
		int indeksi = 0;
		return indeksi;
	}
	
	@Override
	public int getKohdeIndeksi() {
		int indeksi = 0;
		return indeksi;
	}
	
	@Override
	public double getMäärä() {
		double maara = 0;
		return maara;
	}
	
	@Override
	public void setTulos(double määrä) {
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
