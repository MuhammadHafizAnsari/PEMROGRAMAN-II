package hafiz.praktikum6;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Tabel extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        TableView<Mahasiswa> tableView = new TableView<>();
        TableColumn<Mahasiswa, Integer> column1 =
                new TableColumn<>("ID");
        column1.setCellValueFactory(
                new PropertyValueFactory<>("id"));
        TableColumn<Mahasiswa, String> column2 =
                new TableColumn<>("Nama");
        column2.setCellValueFactory(
                new PropertyValueFactory<>("nama"));
        TableColumn<Mahasiswa, String> column3 =
                new TableColumn<>("NIM");
        column3.setCellValueFactory(
                new PropertyValueFactory<>("nim"));
        tableView.getColumns().addAll(column1, column2, column3);
        tableView.getItems().add(
                new Mahasiswa(1, "Muhammad Hafiz Ansari", "2210817210003"));
        tableView.getItems().add(
                new Mahasiswa(2, "Naruto Uzumaki", "2210817210012"));
        tableView.getItems().add(
                new Mahasiswa(3, "Sasuke Uchiha", "2210817210009"));
        tableView.getItems().add(
                new Mahasiswa(4, "Sakura Haruno", "2210817210007"));
        tableView.getItems().add(
                new Mahasiswa(5, " Kakashi Hatake", "2210817210015"));
        tableView.getItems().add(
                new Mahasiswa(6, "Itachi Uchiha", "2210817210005"));
        tableView.getItems().add(
                new Mahasiswa(7, "Hinata Hyuga", "2210817210023"));
        tableView.getItems().add(
                new Mahasiswa(8, "Orochimaru", "2210817210008"));
        tableView.getItems().add(
                new Mahasiswa(9, "Hashirama Senju", "2210817210016"));
        tableView.getItems().add(
                new Mahasiswa(10, "Shikamaru Nara", "2210817210019"));
        VBox vbox = new VBox(tableView);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}