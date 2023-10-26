package buscarreemp;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarReemp extends Application {
	
	
	private Label buscarLabel = new Label("Buscar:");
	private Label reemplazarLabel = new Label("Reemplazar con:");
	private TextField buscarText = new TextField();
	private TextField reemplazarText = new TextField();
	private Button buscarButton = new Button("Buscar");
	private Button reempButton = new Button("Reemplazar");
	private Button reempTodoButton = new Button("Reemplazar Todo");
	private Button cerrarButton = new Button("Cerrar");
	private Button ayudaButton = new Button("Ayuda");
	private CheckBox mayusMinCheck = new CheckBox("Mayúsculas y minúsculas");
	private CheckBox exprRegCheck = new CheckBox("Expresión regular");
	private CheckBox buscarCheck = new CheckBox("Buscar hacia atrás");
	private CheckBox resaltarCheck = new CheckBox("Resaltar resultados");
	private GridPane root = new GridPane();
	private GridPane checkPane = new GridPane();
	private VBox botonesBox = new VBox();

	@Override
	public void start(Stage primaryStage) throws Exception {

		root.setPadding(new Insets(5));
		root.setHgap(5);
		root.setVgap(5);

		root.addRow(0, buscarLabel, buscarText);
		root.addRow(1, reemplazarLabel, reemplazarText);
		root.add(checkPane, 1, 2);
		root.add(botonesBox, 2, 0);
		GridPane.setRowSpan(botonesBox, 3);

		checkPane.add(mayusMinCheck, 0, 0);
		checkPane.add(exprRegCheck, 0, 1);
		checkPane.add(buscarCheck, 1, 0);
		checkPane.add(resaltarCheck, 1, 1);
		checkPane.setHgap(10);
		checkPane.setVgap(10);


		ColumnConstraints[] columns = { new ColumnConstraints(), new ColumnConstraints(), new ColumnConstraints() };

		columns[0].setHalignment(HPos.LEFT);
		columns[1].setHgrow(Priority.ALWAYS);
		root.getColumnConstraints().setAll(columns);

		buscarButton.setMinWidth(105);
		buscarButton.setPrefWidth(105);
		reempButton.setMinWidth(105);
		reempButton.setPrefWidth(105);
		reempTodoButton.setMinWidth(105);
		reempTodoButton.setPrefWidth(105);
		cerrarButton.setMinWidth(105);
		cerrarButton.setPrefWidth(105);
		ayudaButton.setMinWidth(105);
		ayudaButton.setPrefWidth(105);
		GridPane.setRowSpan(botonesBox, 3);
		botonesBox.getChildren().addAll(buscarButton, reempButton, reempTodoButton, cerrarButton, ayudaButton);

		Scene scene = new Scene(root, 500, 280);

		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}