package org.example.jsonSample;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClsJson {
    //Convierte un objeto a Json en una línea simple o de un solo elemento.

    public String convierteObjetoJson(Object objeto, String archivo) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        //pasa el objeto a un archivo y lo guarda
        mapper.writeValue(new File(archivo), objeto);
        //pasa el json a un Stirng
        String jsonInString = mapper.writeValueAsString(objeto);
        return jsonInString;
    }

    public Object convertirJsonAObjeto(){
        ObjectMapper mapper = new ObjectMapper();
        Object objArchivo = new Object();
        try {
            objArchivo = mapper.readValue(new File("C:\\Users\\Anthony Lima\\Desktop\\Cls 16"), mdBot.class);
        }catch (Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return objArchivo;
    }

    // trabajando con multiples registros
    public ArrayList<mdBot> convertirJsonAObjeto(){
        ObjectMapper mapper = new ObjectMapper();
        ArrayList<mdBot> ListaObjetos = new ArrayList<>();
        try{
            ListaObjetos = mapper.readValue(new File("C:\\Users\\Anthony Lima\\Desktop\\Cls 16"), new TypeReference<ArrayList<mdBot>>(){
            } catch (Exception ex){
                System.out.println("Error: "+ex.getMessage());
            }
        }
    }

    public static void main (String[] args){
        ClsJson objJson = new ClsJson();
        mdBot botData = new mdBot();

        botData = (mdBot) objJson.convertirJsonAObjeto();
        System.out.println("nombre= "+botData.getNombre());





//        botData.setNombre("Sergio");
//        botData.setMensaje("Hola");
//        botData.setId(12345678L);
//
//        try {
//            System.out.println(objJson.convierteObjetoJson(botData, "C:\\Users\\Anthony Lima\\Desktop\\Cls 16"));
//        } catch (Exception ex){
//            System.out.println("Hubo error: " +ex.getMessage());
//        }

    }
}
