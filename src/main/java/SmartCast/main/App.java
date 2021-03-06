/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package SmartCast.main;

import SmartCast.model.User;
import SmartCast.ui.LoginApp;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private Stage MyStage;
	private static App instance;
	private User loggedUser;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		stage = new Stage();
		MyStage = stage;
		goToListQCM();
		MyStage.show();
	}

	public Stage getMyStage() {
		return MyStage;
	}

	public void setMyStage(Stage MyStage) {
		this.MyStage = MyStage;
	}

	public App() {
		instance = this;
	}
	public void goToListQCM() throws Exception{
		replaceSceneContent("fxml/QcmTestList.fxml");
	}

	public User getLoggedUser() {
		return loggedUser;
	}

	public void setLoggedUser(User loggedUser) {
		this.loggedUser = loggedUser;
	}

	public static App getInstance() {
		return instance;
	}
	public Parent replaceSceneContent(String fxml) throws Exception {
        Parent page = (Parent) FXMLLoader.load(getClass().getClassLoader().getResource(fxml));
        Scene scene = MyStage.getScene();
        if (scene == null) {
            scene = new Scene(page, 700, 550);
            scene.getStylesheets().add(getClass().getClassLoader().getResource("css/app.css").toExternalForm());
            MyStage.setScene(scene);
        } else {
            MyStage.getScene().setRoot(page);
        }
        MyStage.sizeToScene();
        return page;
    }
}
