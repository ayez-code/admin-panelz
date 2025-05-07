import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import javafx.scene.input.MouseEvent;

public class AdminPanelController {

    @FXML
    private AnchorPane dashboardContent;

    @FXML
    public void handleUsersClick(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("userspanel.fxml"));
            AnchorPane usersPanel = loader.load();

            dashboardContent.getChildren().clear();
            dashboardContent.getChildren().add(usersPanel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
