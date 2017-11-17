import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Welcome extends Application {

	@Override
	public void start(Stage primaryStage) {

		GridPane grid = new GridPane();
		grid.setGridLinesVisible(true);
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		Text scenetitle = new Text("Welcome");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		// add(child, columnIndex, rowIndex, column span, row span)
		grid.add(scenetitle, 0, 0, 2, 1);

		Label userName = new Label("User Name:");
		// add(child, columnIndex, rowIndex)
		grid.add(userName, 0, 1);

		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);

		Label pw = new Label("Password:");
		grid.add(pw, 0, 2);

		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 2);
		
		
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		Button signinBtn = new Button("Sign in");
		Button exitBtn = new Button("Exit");
		hbBtn.getChildren().addAll(signinBtn,exitBtn);
		// skip row 3
		grid.add(hbBtn, 1, 4);
		
		Scene scene = new Scene(grid, 350, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("JavaFX Welcome");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
