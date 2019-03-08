/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leltar;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author t1
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TableView<Terem> tblTermek;

    @FXML
    private TableColumn<Terem, String> oTerem;

    @FXML
    private TableColumn<Terem, String> oFelhasznalas;

    @FXML
    private TextField txtTerem;

    @FXML
    private TextField txtFelhasznalas;

    @FXML
    private TableView<Eszkoz> tblEszkozok;

    @FXML
    private TableColumn<Eszkoz, String> oNev;

    @FXML
    private TableColumn<Eszkoz, String> oJellemzok;

    @FXML
    private TextField txtNev;

    @FXML
    private TextField txtJellemzok;

    @FXML
    private ComboBox<String> cbxTerem;

    @FXML
    private ComboBox<String> cbxEszkoz;

    @FXML
    private TextField txtAr;

    @FXML
    private TextField txtEv;

    @FXML
    private TextField txtMegjegyzes;

    @FXML
    private TableView<Tetel> tblLeltar;

    @FXML
    private TableColumn<Tetel, Integer> oID;

    @FXML
    private TableColumn<Tetel, String> oTerem2;

    @FXML
    private TableColumn<Tetel, String> oEszkoz2;

    @FXML
    private TableColumn<Tetel, Integer> oAr;

    @FXML
    private TableColumn<Tetel, Integer> oEv;

    @FXML
    private TableColumn<Tetel, String> oMegjegyzes;

    @FXML
    void eszkoz_hozzaad() {

    }

    @FXML
    void eszkoz_modosit() {

    }

    @FXML
    void eszkoz_torol() {

    }

    @FXML
    void eszkoz_uj() {

    }

    @FXML
    void leltar_hozzaad() {
        if (cbxTerem.getValue()==null) {
            hiba("Hiba!", "Válaszd ki a termet!");
            return;
        }    
        if (cbxEszkoz.getValue()==null) {
            hiba("Hiba!", "Válaszd ki az eszközt!");
            return;
        }
    }    

    @FXML
    void leltar_modosit() {

    }

    @FXML
    void leltar_torol() {

    }

    @FXML
    void leltar_uj() {

    }

    @FXML
    void terem_hozzaad() {

    }

    @FXML
    void terem_modosit() {

    }

    @FXML
    void terem_torol() {

    }

    @FXML
    void terem_uj() {

    }
    
    DB ab = new DB();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        oTerem.setCellValueFactory(new PropertyValueFactory<>("terem"));
        oFelhasznalas.setCellValueFactory(new PropertyValueFactory<>("felhasznalas"));

        oNev.setCellValueFactory(new PropertyValueFactory<>("nev"));
        oJellemzok.setCellValueFactory(new PropertyValueFactory<>("jellemzok"));
        
        oID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        oTerem2.setCellValueFactory(new PropertyValueFactory<>("terem"));
        oEszkoz2.setCellValueFactory(new PropertyValueFactory<>("eszkoz"));
        oAr.setCellValueFactory(new PropertyValueFactory<>("ar"));
        oEv.setCellValueFactory(new PropertyValueFactory<>("ev"));
        oMegjegyzes.setCellValueFactory(new PropertyValueFactory<>("megjegyzes"));
        
        ab.terem_be(tblTermek.getItems(), cbxTerem.getItems());
        ab.eszkoz_be(tblEszkozok.getItems(), cbxEszkoz.getItems());
        ab.leltar_be(tblLeltar.getItems());
            
        tblTermek.getSelectionModel().selectedIndexProperty().addListener(
            (o,regi,uj) -> terem_tablabol(uj.intValue())
        );
        tblEszkozok.getSelectionModel().selectedIndexProperty().addListener(
            (o,regi,uj) -> eszkoz_tablabol(uj.intValue())
        );
        tblLeltar.getSelectionModel().selectedIndexProperty().addListener(
            (o,regi,uj) -> leltar_tablabol(uj.intValue())
        );
    }
    
    private void terem_tablabol(int i) {
        if (i == -1) return;
        Terem t =tblTermek.getItems().get(i);
        txtTerem.setText(t.getTerem());
        txtFelhasznalas.setText(t.getFelhasznalas());
    }
    
    private void eszkoz_tablabol(int i) {
        if (i == -1) return;
        Eszkoz e = tblEszkozok.getItems().get(i);
        txtNev.setText(e.getNev());
        txtJellemzok.setText(e.getJellemzok());
    }
    
    private void leltar_tablabol(int i) {
        if (i==-1) return;
        Tetel t =tblLeltar.getItems().get(i);
        cbxTerem.setValue(t.getTerem());
        cbxEszkoz.setValue(t.getEszkoz());
        if (t.getAr() !=null)
            txtAr.setText(t.getAr().toString());
        else
            txtAr.setText("");
        if (t.getEv() !=null)
            txtAr.setText(t.getEv().toString());
        else
            txtEv.setText("");
        txtMegjegyzes.setText(t.getMegjegyzes());
    }

    private void hiba(String hiba, String válaszd_ki_a_termet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
