package recetascocina;


import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

public class CrudMongoReceta {

    MongoCollection<Document> collection;


    //Creem la conexio en MongoDB
    public CrudMongoReceta(){

        MongoClient cliente = new MongoClient("localhost",27017);
        MongoDatabase database = cliente.getDatabase("examenAcceso");
        collection = database.getCollection("Recetas");

    }

    public String readInstrucciones(String nombreReceta){

        //Busquem el primer docment que coincidixca
        Document document = collection.find(Filters.eq("nombre_receta", nombreReceta)).first();

        return document.getString("instrucciones");

    }


    //Donat un objecte receta, creem un document depenent de la existencia dels seus ingredients i el insertem en la base de datos.
    public void create(RecetaPOJO receta){

        Document document = new Document();

        document.append("nombre_receta", receta.getNombreReceta());


        //Comprobem per a cada camp si esta buit
        if(receta.getIngrediente1().isEmpty()==false){

            document.append("ingrediente_1", receta.getIngrediente1());

        }

        if(receta.getIngrediente2().isEmpty()==false){

            document.append("ingrediente_2", receta.getIngrediente2());

        }

        if(receta.getIngrediente3().isEmpty()==false){

            document.append("ingrediente_3", receta.getIngrediente3());

        }

        if(receta.getIngrediente4().isEmpty()==false){

            document.append("ingrediente_4", receta.getIngrediente4());

        }

        if(receta.getIngrediente5().isEmpty()==false){

            document.append("ingrediente_5", receta.getIngrediente5());

        }

        if(receta.getIngrediente6().isEmpty()==false){

            document.append("ingrediente_6", receta.getIngrediente6());

        }

        if(receta.getIngrediente7().isEmpty()==false){

            document.append("ingrediente_7", receta.getIngrediente7());

        }

        if(receta.getIngrediente8().isEmpty()==false){

            document.append("ingrediente_8", receta.getIngrediente8());

        }

        if(receta.getIngrediente9().isEmpty()==false){

            document.append("ingrediente_9", receta.getIngrediente9());

        }

        if(receta.getIngrediente10().isEmpty()==false){

            document.append("ingrediente_10", receta.getIngrediente10());

        }

        if(receta.getIngrediente11().isEmpty()==false){

            document.append("ingrediente_11", receta.getIngrediente11());

        }

        if(receta.getIngrediente12().isEmpty()==false){

            document.append("ingrediente_12", receta.getIngrediente12());

        }

        if(receta.getIngrediente13().isEmpty()==false){

            document.append("ingrediente_13", receta.getIngrediente13());

        }
        if(receta.getIngrediente14().isEmpty()==false){

            document.append("ingrediente_14", receta.getIngrediente14());

        }

        if(receta.getIngrediente15().isEmpty()==false){

            document.append("ingrediente_15", receta.getIngrediente15());

        }
        if(receta.getIngrediente16().isEmpty()==false){

            document.append("ingrediente_16", receta.getIngrediente16());

        }

        document.append("instrucciones", receta.getInstrucciones());

        //Insertem el document
        collection.insertOne(document);

    }


    //Donat un nom antic i uno nou, el actualizem en la base de datos
    public void update(String antiguoNombre, String nuevoNombre){
        collection.updateOne(Filters.eq("nombre_receta",antiguoNombre), Updates.set("nombre_receta", nuevoNombre));
    }


    //Donat un nom, borrem els documents en ixe nom de receta
    public void delete(String nombreReceta){

        collection.deleteMany(Filters.eq("nombre_receta", nombreReceta));

    }



}
