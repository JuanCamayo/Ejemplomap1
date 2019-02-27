/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomap1;

import Modelo.Cliente;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author juan.camayo
 */
public class Ejemplomap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        LinkedList<Cliente> listasc = new LinkedList<>();
        LinkedList<Cliente> listasc2 = new LinkedList<>();
        Map<Integer, LinkedList<Cliente>> map1 = new HashMap<>();
        listasc.add(new Cliente("David", "1130", "uao"));
        listasc.add(new Cliente("Sofia", "1131", "Tigo"));
        listasc.add(new Cliente("Marcos", "1133", "Sura"));
        listasc.add(new Cliente("Maria", "1134", "Herbalife"));
        
        map1.put(3, listasc);
        
        
       
      
         listasc2.add(new Cliente("Juan", "1137", "Campo"));
        listasc2.add(new Cliente("Valeria", "1135", "USB"));
        listasc2.add(new Cliente("Andres", "1138", "Claro"));
        listasc2.add(new Cliente("Jorge", "1139", "Junior"));
        map1.put(36, listasc2);
        

        //Map<Integer, Cliente> map1 = new HashMap<>();
        Map<Integer, Cliente> map2 = new LinkedHashMap<>();
        Map<Integer, Cliente> map3 = new TreeMap<>();

//        map1.put(5, new Cliente("David", "1130", "uao"));
//        map1.put(4, new Cliente("Sofia", "1131", "Tigo"));
//        map1.put(5, new Cliente("Marcos", "1133", "Sura"));
//        map1.put(78, new Cliente("Maria", "1134", "Herbalife"));
//
//        map2.put(5, new Cliente("David", "1130", "uao"));
//        map2.put(4, new Cliente("Sofia", "1131", "Tigo"));
//        map2.put(5, new Cliente("Marcos", "1133", "Sura"));
//        map2.put(78, new Cliente("Maria", "1134", "Herbalife"));
//
//        map3.put(5, new Cliente("David", "1130", "uao"));
//        map3.put(4, new Cliente("Sofia", "1131", "Tigo"));
//        map3.put(5, new Cliente("Marcos", "1133", "Sura"));
//        map3.put(78, new Cliente("Maria", "1134", "Herbalife"));

        String m1 = mostrarDatosMap(map1);
//        String m2 = mostrarDatosMap(map2);
//        String m3 = mostrarDatosMap(map3);

        System.out.println(m1);
//        System.out.println("______________");
//        System.out.println(m2);
//        System.out.println("______________");
//        System.out.println(m3);
    }

    public static String mostrarDatosMap(Map<Integer, LinkedList<Cliente>> m) {

        String mostrar = "";

        Iterator<Map.Entry<Integer, LinkedList<Cliente>>> it;
        it = m.entrySet().iterator();
        while (it.hasNext()) {

            Map.Entry<Integer, LinkedList<Cliente>> pair = it.next();
            mostrar += pair.getKey() + "\n";

       for(int i = 0 ; i<pair.getValue().size(); i++){
       
       mostrar += pair.getValue().get(i)+"\n";
       
       
       }

        }

        return mostrar;
    }

}
