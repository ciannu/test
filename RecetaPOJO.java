package recetascocina;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//Clase plana que conté les anotacions necesaries per a hibernate
@Entity
@Table(name = "Receta")
public class RecetaPOJO {

    @Id @Column(name = "id") int id;

    @Column(name = "nombre_receta") String nombreReceta;

    @Column(name = "ingrediente_1") String ingrediente1;
    @Column(name = "ingrediente_2") String ingrediente2;
    @Column(name = "ingrediente_3") String ingrediente3;
    @Column(name = "ingrediente_4") String ingrediente4;
    @Column(name = "ingrediente_5") String ingrediente5;
    @Column(name = "ingrediente_6") String ingrediente6;
    @Column(name = "ingrediente_7") String ingrediente7;
    @Column(name = "ingrediente_8") String ingrediente8;
    @Column(name = "ingrediente_9") String ingrediente9;
    @Column(name = "ingrediente_10") String ingrediente10;
    @Column(name = "ingrediente_11") String ingrediente11;
    @Column(name = "ingrediente_12") String ingrediente12;
    @Column(name = "ingrediente_13") String ingrediente13;
    @Column(name = "ingrediente_14") String ingrediente14;
    @Column(name = "ingrediente_15") String ingrediente15;
    @Column(name = "ingrediente_16") String ingrediente16;
    @Column(name = "instrucciones") String instrucciones;
    public RecetaPOJO(){


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public String getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(String ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }

    public String getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente2(String ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }

    public String getIngrediente3() {
        return ingrediente3;
    }

    public void setIngrediente3(String ingrediente3) {
        this.ingrediente3 = ingrediente3;
    }

    public String getIngrediente4() {
        return ingrediente4;
    }

    public void setIngrediente4(String ingrediente4) {
        this.ingrediente4 = ingrediente4;
    }

    public String getIngrediente5() {
        return ingrediente5;
    }

    public void setIngrediente5(String ingrediente5) {
        this.ingrediente5 = ingrediente5;
    }

    public String getIngrediente6() {
        return ingrediente6;
    }

    public void setIngrediente6(String ingrediente6) {
        this.ingrediente6 = ingrediente6;
    }

    public String getIngrediente7() {
        return ingrediente7;
    }

    public void setIngrediente7(String ingrediente7) {
        this.ingrediente7 = ingrediente7;
    }

    public String getIngrediente8() {
        return ingrediente8;
    }

    public void setIngrediente8(String ingrediente8) {
        this.ingrediente8 = ingrediente8;
    }

    public String getIngrediente9() {
        return ingrediente9;
    }

    public void setIngrediente9(String ingrediente9) {
        this.ingrediente9 = ingrediente9;
    }

    public String getIngrediente10() {
        return ingrediente10;
    }

    public void setIngrediente10(String ingrediente10) {
        this.ingrediente10 = ingrediente10;
    }

    public String getIngrediente11() {
        return ingrediente11;
    }

    public void setIngrediente11(String ingrediente11) {
        this.ingrediente11 = ingrediente11;
    }

    public String getIngrediente12() {
        return ingrediente12;
    }

    public void setIngrediente12(String ingrediente12) {
        this.ingrediente12 = ingrediente12;
    }

    public String getIngrediente13() {
        return ingrediente13;
    }

    public void setIngrediente13(String ingrediente13) {
        this.ingrediente13 = ingrediente13;
    }

    public String getIngrediente14() {
        return ingrediente14;
    }

    public void setIngrediente14(String ingrediente14) {
        this.ingrediente14 = ingrediente14;
    }

    public String getIngrediente15() {
        return ingrediente15;
    }

    public void setIngrediente15(String ingrediente15) {
        this.ingrediente15 = ingrediente15;
    }

    public String getIngrediente16() {
        return ingrediente16;
    }

    public void setIngrediente16(String ingrediente16) {
        this.ingrediente16 = ingrediente16;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }




}
