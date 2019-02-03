package view;

import java.text.DecimalFormat;

import controller.ValuuttakoneenOhjain;
import controller.ValuuttakoneenOhjain_IF;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import model.ValuuttaAccessObject;
import model.ValuuttaDAO_IF;
import model.Valuuttakone;
import model.Valuuttakone_IF;

public class ValuuttakoneenGUI extends Application implements ValuuttakoneenGUI_IF {
	
	private ValuuttakoneenOhjain_IF ohjain;
	
	private ListView<String> mista = new ListView<String>();
	private ListView<String> mihin = new ListView<String>();
	
	private TextField maara;
	private TextField tulos;
	
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
					try {
						ohjain.muunnos();
					} catch (Exception e) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Virhe!");
						alert.setContentText("Valitse valuutat ja syötä numeroita!");
						alert.showAndWait();
					}
				}
			});
			
			maara = new TextField();
			maara.setFont(Font.font("Tahoma", FontWeight.NORMAL, 14));
	        
			tulos = new TextField();
	        tulos.setFont(Font.font("Tahoma", FontWeight.NORMAL, 14));
	        
	        String[] valuutat = ohjain.getValuutat();
	        ObservableList<String> valuuttalista = FXCollections.observableArrayList ();
	        for (int i = 0; i < valuutat.length; i++) {
	        	valuuttalista.add(valuutat[i]);
	        }
	        	        
	        mista.setItems(valuuttalista);
	        mista.setPrefSize(200, 200);
	        	        
	        mihin.setItems(valuuttalista);
	        mihin.setPrefSize(200, 200);
	        
	        Label mistatxt = new Label("Mistä");
	        Label mihintxt = new Label("Mihin");
	        Label maaratxt = new Label("Määrä");
	        Label tulostxt = new Label("Tulos");
	        
	        BorderPane border = new BorderPane();        
	        
	        GridPane gridCenter = new GridPane();
	        gridCenter.setAlignment(Pos.CENTER);
	        gridCenter.setVgap(10);
	        gridCenter.setHgap(10);
	        gridCenter.setPadding(new Insets(10, 10, 10, 10));
	        gridCenter.add(mistatxt, 0, 0);
	        gridCenter.add(mista, 0, 1);
	        gridCenter.add(mihintxt, 1, 0);
	        gridCenter.add(mihin, 1, 1);
	        
	        GridPane gridRight = new GridPane();
	        gridRight.setAlignment(Pos.CENTER);
	        gridRight.setVgap(10);
	        gridRight.setHgap(10);
	        gridRight.setPadding(new Insets(10, 10, 10, 10));
	        gridRight.add(maaratxt, 0, 0);
	        gridRight.add(maara, 0, 1);
	        gridRight.add(muunnaBtn, 0, 2);
	        gridRight.add(tulostxt, 0, 3);
	        gridRight.add(tulos, 0, 4);
	        
	        border.setCenter(gridCenter);
	        border.setRight(gridRight);

	        Scene scene = new Scene(border, 600, 200);
	        primaryStage.setScene(scene);
	        primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int getLähtöIndeksi() {
		int indeksi = mista.getSelectionModel().getSelectedIndex();
		return indeksi;
	}
	
	@Override
	public int getKohdeIndeksi() {
		int indeksi = mihin.getSelectionModel().getSelectedIndex();
		return indeksi;
	}
	
	@Override
	public double getMäärä() {
		return Double.parseDouble(this.maara.getText());
	}
	
	@Override
	public void setTulos(double määrä) {
		DecimalFormat formatter = new DecimalFormat("#0.00");
		this.tulos.setText(formatter.format(määrä));
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}