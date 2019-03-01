/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author juan.camayo
 */
public class FileXML {

    public static boolean crearArchivoXML(Map<Integer, LinkedList<Cliente>> m) {

        boolean t = false;

        try {
            
            //se crea la etiqueta
            Element clientes = new Element("Clientes");
            Document doc = new Document(clientes);
//un metodo que recorra el mapa
            Iterator<Map.Entry<Integer, LinkedList<Cliente>>> it;
            it = m.entrySet().iterator();
            while (it.hasNext()) {

                Map.Entry<Integer, LinkedList<Cliente>> pair = it.next();

                Element key1 = new Element("Key");

                key1.setAttribute(new Attribute("id", String.valueOf(pair.getKey())));
                doc.getRootElement().addContent(key1);
                
                for (int i = 0; i < pair.getValue().size(); i++) {
                    Cliente objc = pair.getValue().get(i);
                    Element cliente1 = new Element("cliente");
                    cliente1.setAttribute(new Attribute("nombre", objc.getNombre()));
                    cliente1.setAttribute(new Attribute("idcliente", objc.getIdcliente()));
                    cliente1.setAttribute(new Attribute("empresa", objc.getEmpresa()));
                    
                    doc.getRootElement().addContent(cliente1);
                    
                }
                

            }
            
            
            XMLOutputter xmlOutput = new XMLOutputter();
xmlOutput.setFormat(Format.getCompactFormat());
xmlOutput.output(doc,new FileWriter("fileClientes.xml"));
            t=true;
            
        } catch (IOException ioe) {

        }

        return t;
    }

     public static Map<Integer,LinkedList<Cliente>> LeerArchivoXML() {
     Map<Integer , LinkedList<Cliente>> m1 = new HashMap<>();
       
     
    SAXBuilder builder = new SAXBuilder();
    File FileXML = new File( "archivo.xml" );
    
    
    
    try {
    
    
    
    } catch(IOException ){
    
    
    
    
    
    }
     
      return m1;
     
     }
     
    
}
