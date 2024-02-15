/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package recetascocina;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 *
 * @author denos
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField fieldIngrediente1;
    @FXML
    private TextField fieldIngrediente2;
    @FXML
    private TextField fieldIngrediente3;
    @FXML
    private TextField fieldIngrediente4;
    @FXML
    private TextField fieldIngrediente5;
    @FXML
    private TextField fieldIngrediente6;
    @FXML
    private TextField fieldIngrediente7;
    @FXML
    private TextField fieldIngrediente8;
    @FXML
    private TextField fieldIngrediente9;
    @FXML
    private TextField fieldIngrediente10;
    @FXML
    private TextField fieldIngrediente11;
    @FXML
    private TextField fieldIngrediente12;
    @FXML
    private TextField fieldIngrediente13;
    @FXML
    private TextField fieldIngrediente14;
    @FXML
    private TextField fieldIngrediente15;
    @FXML
    private TextField fieldIngrediente16;
    @FXML
    private TextArea areaInstrucionesRecetas;
    @FXML
    private TextArea areaListadoRecetas;
    @FXML
    private TextField fieldNombreReceta;

    List<RecetaPOJO> listaRecetas;

    CrudHibernateReceta crudHibernateReceta;
    CrudMongoReceta crudMongoReceta;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        //Iniciem els crud
        crudHibernateReceta = new CrudHibernateReceta();
        crudMongoReceta = new CrudMongoReceta();


        // Al iniciar se tienen que mostrar el nombre de todas las recetas que hay
        actualizarLista();
        mostrarListado();
    }    

    @FXML
    private void buttonAnyadirReceta(ActionEvent event) {


        //Si los campos de nombre y instrucciones estan vacios
        if(fieldNombreReceta.getText().isEmpty()){

            Alert alerta = new Alert(Alert.AlertType.ERROR,"Introduce el nombre de la receta");
            alerta.show();
            return;

        }
        if(areaInstrucionesRecetas.getText().isEmpty()){

            Alert alerta = new Alert(Alert.AlertType.ERROR,"Introduce las instrucciones de la receta");
            alerta.show();
            return;

        }

        //Creem la receta
        RecetaPOJO receta = new RecetaPOJO();
        receta.setNombreReceta(fieldNombreReceta.getText());
        receta.setIngrediente1(fieldIngrediente1.getText());
        receta.setIngrediente2(fieldIngrediente2.getText());
        receta.setIngrediente3(fieldIngrediente3.getText());
        receta.setIngrediente4(fieldIngrediente4.getText());
        receta.setIngrediente5(fieldIngrediente5.getText());
        receta.setIngrediente6(fieldIngrediente6.getText());
        receta.setIngrediente7(fieldIngrediente7.getText());
        receta.setIngrediente8(fieldIngrediente8.getText());
        receta.setIngrediente9(fieldIngrediente9.getText());
        receta.setIngrediente10(fieldIngrediente10.getText());
        receta.setIngrediente11(fieldIngrediente11.getText());
        receta.setIngrediente12(fieldIngrediente12.getText());
        receta.setIngrediente13(fieldIngrediente13.getText());
        receta.setIngrediente14(fieldIngrediente14.getText());
        receta.setIngrediente15(fieldIngrediente15.getText());
        receta.setIngrediente16(fieldIngrediente16.getText());
        receta.setInstrucciones(areaInstrucionesRecetas.getText());

        crudHibernateReceta.create(receta);
        crudMongoReceta.create(receta);
        Alert alerta = new Alert(Alert.AlertType.INFORMATION,"Receta creada correctamente");
        alerta.show();

        //SETEJEM TOTS ELS TEXTOS A BLANC

        fieldNombreReceta.setText("");
        fieldIngrediente1.setText("");
        fieldIngrediente2.setText("");
        fieldIngrediente3.setText("");
        fieldIngrediente4.setText("");
        fieldIngrediente5.setText("");
        fieldIngrediente6.setText("");
        fieldIngrediente7.setText("");
        fieldIngrediente8.setText("");
        fieldIngrediente9.setText("");
        fieldIngrediente10.setText("");
        fieldIngrediente11.setText("");
        fieldIngrediente12.setText("");
        fieldIngrediente13.setText("");
        fieldIngrediente14.setText("");
        fieldIngrediente15.setText("");
        fieldIngrediente16.setText("");
        areaInstrucionesRecetas.setText("");

        actualizarLista();
        mostrarListado();

    }


    //Mostramos el nombre de cada receta en el area de recetas
    public void mostrarListado(){

        String stringRecetas = "";

        for( RecetaPOJO receta : listaRecetas){

            stringRecetas+="- "+receta.getNombreReceta()+"\n";

        }

        areaListadoRecetas.setText(stringRecetas);


    }


    //Actualizamos la lista de recetas desde la base de datos
    public void actualizarLista(){

        listaRecetas = crudHibernateReceta.listarRecetas();

    }


    //Ejercicios del crud


    //FUNCIONA
    public void actualizarHibernate(){

        RecetaPOJO recetaNueva = new RecetaPOJO();
        recetaNueva.setId(5);
        recetaNueva.setNombreReceta("Receta actualizada en hibernate");
        crudHibernateReceta.update(recetaNueva);

    }

    //FUNCIONA
    public void actualizarMongo(){

        crudMongoReceta.update("Receta1", "Receta actualizda en mongo");

    }


    //FUNCIONA
    public void leerMongo(){

        //LLegim directament les instruccions de la receta amb ixe nom
        System.out.println(crudMongoReceta.readInstrucciones("Ensaladilla"));

    }

    //FUNCIONA
    public void borrarHibernate(){

        RecetaPOJO receta = new RecetaPOJO();

        receta.setId(5);

        crudHibernateReceta.delete(receta);

    }

    //FUNCIONA
    public void borrarMongo(){
        crudMongoReceta.delete("Ensaladilla");
    }


    //Arian Gisbert
    
}
