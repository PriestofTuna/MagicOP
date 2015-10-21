import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AuthenticationGUI extends Application {

	public static void main(String[] args) {
		launch(args);
		// Main is not required in gitbash, remember not to copy and paste code.
		// Make new code off this design
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Authentication");
		TextField usernameTxtFld = new TextField();
		PasswordField passwordTxtFld = new PasswordField();

		Label UserLbl = new Label("Username");
		Label PassLbl = new Label("Password");

		Button submit = new Button("Submit");
		Button submit2 = new Button("Submit");
		submit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// int i=0;
				String inputUser = "";
				String inputPass = "";
				String Username = "Tuna";
				String Password = "Magic";

			
				do {
					inputUser = usernameTxtFld.getText();
					inputPass = passwordTxtFld.getText();
					System.out.print(inputUser);
					System.out.print(inputPass);
					if (inputUser.equals(Username) && (inputPass.equals(Password))) {
						JOptionPane.showMessageDialog(null, "welcome" + inputUser);
						System.out.print("hello");
						break;

					} else {

					}

				} while (!inputUser.equals(Username) && (!inputPass.equals(Password)));
				
				for (int i = 0;  i < 3; i++) {
					inputUser = usernameTxtFld.getText();
					inputPass = passwordTxtFld.getText();
					if (inputUser.equals(Username) && (inputPass.equals(Password))) {
						JOptionPane.showMessageDialog(null, "Welcome" + inputUser);
						i = 12;
					} else {

					}
				}

			}

		});

		GridPane grid2 = new GridPane();
		grid2.setAlignment(Pos.CENTER);
		grid2.setVgap(10);
		;

		grid2.add(UserLbl, 0, 0);
		grid2.add(PassLbl, 0, 1);
		grid2.add(usernameTxtFld, 1, 0);
		grid2.add(passwordTxtFld, 1, 1);
		grid2.add(submit, 1, 2);
		Scene scene = new Scene(grid2, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
