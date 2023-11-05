package controlador;

import proyectoder.Cliente;
import proyectoder.Juegos;
import proyectoder.Consola;
import proyectoder.Disco;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class Controlador {
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Juegos> listaJuegos;
    private ArrayList<Disco> listaDiscos;
    private ArrayList<Consola> listaConsolas;

    public Controlador() {
        listaClientes = new ArrayList<>();
        listaJuegos = new ArrayList<>();
        listaDiscos = new ArrayList<>();
        listaConsolas = new ArrayList<>();
    }

    public ArrayList<Juegos> getListaJuegos() {
        return listaJuegos;
    }

    public void setListaJuegos(ArrayList<Juegos> listaJuegos) {
        this.listaJuegos = listaJuegos;
    }
    
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Disco> getListaDiscos() {
        return listaDiscos;
    }

    public void setListaDiscos(ArrayList<Disco> listaDiscos) {
        this.listaDiscos = listaDiscos;
    }

    public ArrayList<Consola> getListaConsolas() {
        return listaConsolas;
    }

    public void setListaConsolas(ArrayList<Consola> listaConsolas) {
        this.listaConsolas = listaConsolas;
    }

    public void escribirClienteXML(ArrayList<Cliente> listaClientes) {
        ObjectOutputStream serializador = null;
        try {
        serializador = new ObjectOutputStream(new FileOutputStream("Cliente.dat"));
        serializador.writeObject(listaClientes);
        } catch (IOException ioe) {
        
        } finally {
        if (serializador != null)
        try {
        serializador.close();
        } catch (IOException ioe) {
        ioe.printStackTrace();
        }
        }
    }
    
    public void EscribirJuegosXML(ArrayList<Juegos> listaJuegos){
        ObjectOutputStream serializador = null;
        try {
        serializador = new ObjectOutputStream(new FileOutputStream("Juego.dat"));
        serializador.writeObject(listaJuegos);
        } catch (IOException ioe) {
        
        } finally {
        if (serializador != null)
        try {
        serializador.close();
        } catch (IOException ioe) {
        ioe.printStackTrace();
        }
        }
    }
    
    public void EscribirDiscoXML(ArrayList<Disco> listaDiscos){
        ObjectOutputStream serializador = null;
        try {
        serializador = new ObjectOutputStream(new FileOutputStream("Disco.dat"));
        serializador.writeObject(listaDiscos);
        } catch (IOException ioe) {
        
        } finally {
        if (serializador != null)
        try {
        serializador.close();
        } catch (IOException ioe) {
        ioe.printStackTrace();
        }
        }
    }
    
    public void EscribirConsola(ArrayList<Consola> listaConsola){
        ObjectOutputStream serializador = null;
        try {
        serializador = new ObjectOutputStream(new FileOutputStream("Consola.dat"));
        serializador.writeObject(listaConsola);
        } catch (IOException ioe) {
        
        } finally {
        if (serializador != null)
        try {
        serializador.close();
        } catch (IOException ioe) {
        ioe.printStackTrace();
        }
        }
    }
    
    

    public void leerClienteXML() {
        ArrayList<Cliente> listaClientes = null;
        ObjectInputStream deserializador = null;
        try {
            deserializador = new ObjectInputStream(new FileInputStream("Cliente.dat"));
            System.out.println(listaClientes.size());
            listaClientes = (ArrayList<Cliente>)deserializador.readObject();
        } catch (FileNotFoundException fnfe ) {
            fnfe.printStackTrace();
        } catch (ClassNotFoundException cnfe ) {
            cnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
        if (deserializador != null)
        try {
            deserializador.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        }
    }
    
    public void leerJuegoXML(){
        ArrayList<Juegos> listaJuegos = null;
        ObjectInputStream deserializador = null;
        try {
            deserializador = new ObjectInputStream(new FileInputStream("Juego.dat"));
            listaJuegos = (ArrayList<Juegos>)deserializador.readObject();
        } catch (FileNotFoundException fnfe ) {
            fnfe.printStackTrace();
        } catch (ClassNotFoundException cnfe ) {
            cnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
        if (deserializador != null)
        try {
            deserializador.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        }
    }
    
    public void leerDiscoXML(){
       ArrayList<Disco> listaDiscos = null;
        ObjectInputStream deserializador = null;
        try {
            deserializador = new ObjectInputStream(new FileInputStream("Disco.dat"));
            listaDiscos = (ArrayList<Disco>)deserializador.readObject();
        } catch (FileNotFoundException fnfe ) {
            fnfe.printStackTrace();
        } catch (ClassNotFoundException cnfe ) {
            cnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
        if (deserializador != null)
        try {
            deserializador.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        }
    }
    
    public void leerConsolaXML(){
       ArrayList<Consola> listaConsolas = null;
        ObjectInputStream deserializador = null;
        try {
            deserializador = new ObjectInputStream(new FileInputStream("Consola.dat"));
            listaConsolas = (ArrayList<Consola>)deserializador.readObject();
        } catch (FileNotFoundException fnfe ) {
            fnfe.printStackTrace();
        } catch (ClassNotFoundException cnfe ) {
            cnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
        if (deserializador != null)
        try {
            deserializador.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        }
    }
    
    public ArrayList<Cliente> inicializarClientesDesdeXML() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        try {
            File inputFile = new File("ClientesXML.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            org.w3c.dom.Document document = builder.parse(inputFile);

            NodeList clientes = document.getElementsByTagName("Cliente");

            for (int i = 0; i < clientes.getLength(); i++) {
                Element clienteElement = (Element) clientes.item(i);
                String idCliente = clienteElement.getElementsByTagName("idCliente").item(0).getTextContent();
                String nombre = clienteElement.getElementsByTagName("nombre").item(0).getTextContent();
                String apellidos = clienteElement.getElementsByTagName("apellidos").item(0).getTextContent();
                int anio = Integer.parseInt(clienteElement.getElementsByTagName("anio").item(0).getTextContent());

                Cliente cliente = new Cliente(idCliente, nombre, apellidos, anio);
                listaClientes.add(cliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaClientes;
    }
    
    public void eliminarClienteDelXML(ArrayList<Cliente> listaClientes, String idClienteEliminar) {
    try {
        if (listaClientes != null) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.newDocument(); 
            Element raiz = documento.createElement("clientes");
            documento.appendChild(raiz);

            File inputFile = new File("ClientesXML.xml");

            if (inputFile.exists()) {
           
                Document documentoExistente = builder.parse(inputFile);
                NodeList clientes = documentoExistente.getElementsByTagName("Cliente");

                ArrayList<Cliente> clientesNoEliminados = new ArrayList<>();

                for (int i = 0; i < clientes.getLength(); i++) {
                    Element cliente = (Element) clientes.item(i);
                    String idCliente = cliente.getElementsByTagName("idCliente").item(0).getTextContent();
                    if (idCliente.equals(idClienteEliminar)) {
                        
                    } else {
                       
                        String nombre = cliente.getElementsByTagName("nombre").item(0).getTextContent();
                        String apellidos = cliente.getElementsByTagName("apellidos").item(0).getTextContent();
                        int anio = Integer.parseInt(cliente.getElementsByTagName("anio").item(0).getTextContent());

                        clientesNoEliminados.add(new Cliente(idCliente, nombre, apellidos, anio));

                        Element nodoCliente = documento.createElement("Cliente");
                        raiz.appendChild(nodoCliente);

                        Element nodoIdCliente = documento.createElement("idCliente");
                        nodoCliente.appendChild(nodoIdCliente);
                        Text textoId = documento.createTextNode(idCliente);
                        nodoIdCliente.appendChild(textoId);

                        Element nodoNombre = documento.createElement("nombre");
                        nodoCliente.appendChild(nodoNombre);
                        Text textoNombre = documento.createTextNode(nombre);
                        nodoNombre.appendChild(textoNombre);

                        Element nodoApellidos = documento.createElement("apellidos");
                        nodoCliente.appendChild(nodoApellidos);
                        Text textoApellidos = documento.createTextNode(apellidos);
                        nodoApellidos.appendChild(textoApellidos);

                        Element nodoAnio = documento.createElement("anio");
                        nodoCliente.appendChild(nodoAnio);
                        Text textoAnio = documento.createTextNode(String.valueOf(anio));
                        nodoAnio.appendChild(textoAnio);
                    }
                }

                
                Transformer transformer = TransformerFactory.newInstance().newTransformer();
                Source source = new DOMSource(documento);
                Result resultado = new StreamResult(inputFile);
                transformer.transform(source, resultado);

                
                listaClientes.clear();
                listaClientes.addAll(clientesNoEliminados);
            } else {
                System.out.println("El archivo XML de clientes no existe.");
            }
        } else {
            System.out.println("La lista de clientes es null. No se puede eliminar el cliente.");
        }
    } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
        e.printStackTrace();
    }
}
    
    public ArrayList<Juegos> inicializarJuegosDesdeXML() {
        ArrayList<Juegos> listaJuegos = new ArrayList<>();

        try {
            File inputFile = new File("JuegosXML.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            org.w3c.dom.Document document = builder.parse(inputFile);

            NodeList juegos = document.getElementsByTagName("Juego");

            for (int i = 0; i < juegos.getLength(); i++) {
                Element juegoElement = (Element) juegos.item(i);
                String idJuego = juegoElement.getElementsByTagName("idJuego").item(0).getTextContent();
                String nombre = juegoElement.getElementsByTagName("nombre").item(0).getTextContent();
                String empresa = juegoElement.getElementsByTagName("empresa").item(0).getTextContent();
                int pegi = Integer.parseInt(juegoElement.getElementsByTagName("pegi").item(0).getTextContent());

                Juegos juego = new Juegos(idJuego, nombre, empresa, pegi);
                listaJuegos.add(juego);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaJuegos;
    }
    
    public void eliminarJuegoDelXML(ArrayList<Juegos> listaJuegos, String idJuegoEliminar) {
    try {
        if (listaJuegos != null) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.newDocument(); 
            Element raiz = documento.createElement("juegos");
            documento.appendChild(raiz);
            
            File inputFile = new File("JuegosXML.xml");

            if (inputFile.exists()) {
                Document documentoExistente = builder.parse(inputFile);
                NodeList juegos = documentoExistente.getElementsByTagName("Juego");

                ArrayList<Juegos> juegosNoEliminados = new ArrayList<>();

                for (int i = 0; i < juegos.getLength(); i++) {
                    Element juego = (Element) juegos.item(i);
                    String idJuego = juego.getElementsByTagName("idJuego").item(0).getTextContent();
                    if (idJuego.equals(idJuegoEliminar)) {
                        
                    } else {
                       
                        String nombre = juego.getElementsByTagName("nombre").item(0).getTextContent();
                        String empresa = juego.getElementsByTagName("empresa").item(0).getTextContent();
                        int pegi = Integer.parseInt(juego.getElementsByTagName("pegi").item(0).getTextContent());

                        juegosNoEliminados.add(new Juegos(idJuego, nombre, empresa, pegi));

                        Element nodoJuego = documento.createElement("Juego");
                        raiz.appendChild(nodoJuego);

                        Element nodoIdJuego = documento.createElement("idJuego");
                        nodoJuego.appendChild(nodoIdJuego);
                        Text textoId = documento.createTextNode(idJuego);
                        nodoIdJuego.appendChild(textoId);

                        Element nodoNombre = documento.createElement("nombre");
                        nodoJuego.appendChild(nodoNombre);
                        Text textoNombre = documento.createTextNode(nombre);
                        nodoNombre.appendChild(textoNombre);

                        Element nodoEmpresa = documento.createElement("empresa");
                        nodoJuego.appendChild(nodoEmpresa);
                        Text textoEmpresa = documento.createTextNode(empresa);
                        nodoEmpresa.appendChild(textoEmpresa);

                        Element nodoPegi = documento.createElement("Pegi");
                        nodoJuego.appendChild(nodoPegi);
                        Text textoPegi = documento.createTextNode(String.valueOf(pegi));
                        nodoPegi.appendChild(textoPegi);
                    }
                }

                
                Transformer transformer = TransformerFactory.newInstance().newTransformer();
                Source source = new DOMSource(documento);
                Result resultado = new StreamResult(inputFile);
                transformer.transform(source, resultado);

                
                listaJuegos.clear();
                listaJuegos.addAll(juegosNoEliminados);
            } else {
                System.out.println("El archivo XML de clientes no existe.");
            }
        } else {
            System.out.println("La lista de clientes es null. No se puede eliminar el cliente.");
        }
    } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
        e.printStackTrace();
    }
}
    
    public ArrayList<Disco> inicializarDiscosDesdeXML() {
        ArrayList<Disco> listaDiscos = new ArrayList<>();

        try {
            File inputFile = new File("DiscosXML.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            org.w3c.dom.Document document = builder.parse(inputFile);

            NodeList discos = document.getElementsByTagName("Disco");

            for (int i = 0; i < discos.getLength(); i++) {
                Element discoElement = (Element) discos.item(i);
                String idDisco = discoElement.getElementsByTagName("idJuego").item(0).getTextContent();
                int capacidad = Integer.parseInt(discoElement.getElementsByTagName("pegi").item(0).getTextContent());

                Disco disco = new Disco(idDisco, capacidad);
                listaDiscos.add(disco);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaDiscos;
    }
    
    public void eliminarDiscoDelXML(ArrayList<Disco> listaDiscos, String idDiscoEliminar) {
    try {
        if (listaDiscos != null) {
            File inputFile = new File("DiscosXML.xml");

            if (inputFile.exists()) {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document documentoExistente = builder.parse(inputFile);

                ArrayList<Element> discosNoEliminados = new ArrayList<>();

                NodeList discos = documentoExistente.getElementsByTagName("Disco");

                for (int i = 0; i < discos.getLength(); i++) {
                    Element disco = (Element) discos.item(i);
                    String idDisco = disco.getElementsByTagName("idDisco").item(0).getTextContent();

                    if (idDisco.equals(idDiscoEliminar)) {
                    
                    } else {
                     
                        discosNoEliminados.add(disco);
                    }
                }

                Document documento = builder.newDocument();
                Element raiz = documento.createElement("discos");
                documento.appendChild(raiz);

                for (Element discoNoEliminado : discosNoEliminados) {
                    Node clonedNode = documento.importNode(discoNoEliminado, true);
                    raiz.appendChild(clonedNode);
                }

                Transformer transformer = TransformerFactory.newInstance().newTransformer();
                Source source = new DOMSource(documento);
                Result resultado = new StreamResult(inputFile);
                transformer.transform(source, resultado);

                listaDiscos.clear();
                for (Element discoNoEliminado : discosNoEliminados) {
                    String idDisco = discoNoEliminado.getElementsByTagName("idDisco").item(0).getTextContent();
                    int capacidad = Integer.parseInt(discoNoEliminado.getElementsByTagName("capacidad").item(0).getTextContent());
                    listaDiscos.add(new Disco(idDisco, capacidad));
                }
            } else {
                System.out.println("El archivo XML de discos no existe.");
            }
        } else {
            System.out.println("La lista de discos es null. No se puede eliminar el disco.");
        }
    } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
        e.printStackTrace();
    }
}
    
    public ArrayList<Consola> inicializarConsolaDesdeXML() {
        ArrayList<Consola> listaConsola = new ArrayList<>();

        try {
            File inputFile = new File("ConsolaXML.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            org.w3c.dom.Document document = builder.parse(inputFile);

            NodeList consolas = document.getElementsByTagName("Consola");

            for (int i = 0; i < consolas.getLength(); i++) {
                Element consolaElement = (Element) consolas.item(i);
                String idConsola = consolaElement.getElementsByTagName("idConsola").item(0).getTextContent();
                String nombre = consolaElement.getElementsByTagName("nombre").item(0).getTextContent();
                String marca = consolaElement.getElementsByTagName("marca").item(0).getTextContent();
                int memoria = Integer.parseInt(consolaElement.getElementsByTagName("memoria").item(0).getTextContent());

                Consola consola = new Consola(idConsola, nombre, marca, memoria);
                listaConsola.add(consola);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaConsola;
    }
    
    public void eliminarConsolaDelXML(ArrayList<Consola> listaConsola, String idConsolaEliminar) {
    try {
        if (listaConsola != null) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.newDocument(); 
            Element raiz = documento.createElement("consola");
            documento.appendChild(raiz);

            File inputFile = new File("ConsolaXML.xml");

            if (inputFile.exists()) {
                Document documentoExistente = builder.parse(inputFile);
                NodeList consolas = documentoExistente.getElementsByTagName("Consola");

                ArrayList<Consola> consolaNoEliminados = new ArrayList<>();

                for (int i = 0; i < consolas.getLength(); i++) {
                    Element consola = (Element) consolas.item(i);
                    String idConsola = consola.getElementsByTagName("idCliente").item(0).getTextContent();
                    if (idConsola.equals(idConsolaEliminar)) {
                        
                    } else {
                       
                        String nombre = consola.getElementsByTagName("nombre").item(0).getTextContent();
                        String marca = consola.getElementsByTagName("apellidos").item(0).getTextContent();
                        int memoria = Integer.parseInt(consola.getElementsByTagName("anio").item(0).getTextContent());

                        consolaNoEliminados.add(new Consola(idConsola, nombre, marca, memoria));

                        Element nodoConsola = documento.createElement("Cliente");
                        raiz.appendChild(nodoConsola);

                        Element nodoIdConsola = documento.createElement("idConsola");
                        nodoConsola.appendChild(nodoIdConsola);
                        Text textoId = documento.createTextNode(idConsola);
                        nodoIdConsola.appendChild(textoId);

                        Element nodoNombre = documento.createElement("nombre");
                        nodoConsola.appendChild(nodoNombre);
                        Text textoNombre = documento.createTextNode(nombre);
                        nodoNombre.appendChild(textoNombre);

                        Element nodoMarca = documento.createElement("apellidos");
                        nodoConsola.appendChild(nodoMarca);
                        Text textoEmpresa = documento.createTextNode(marca);
                        nodoMarca.appendChild(textoEmpresa);

                        Element nodoMemoria = documento.createElement("memoria");
                        nodoMemoria.appendChild(nodoMemoria);
                        Text textoMemoria = documento.createTextNode(String.valueOf(memoria));
                        nodoMemoria.appendChild(textoMemoria);
                    }
                }

                
                Transformer transformer = TransformerFactory.newInstance().newTransformer();
                Source source = new DOMSource(documento);
                Result resultado = new StreamResult(inputFile);
                transformer.transform(source, resultado);

                
                listaConsola.clear();
                listaConsola.addAll(consolaNoEliminados);
            } else {
                System.out.println("El archivo XML de clientes no existe.");
            }
        } else {
            System.out.println("La lista de clientes es null. No se puede eliminar el cliente.");
        }
    } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
        e.printStackTrace();
    }
}
    
    public void modificarClienteEnXML(ArrayList<Cliente> listaClientes, Cliente clienteModificado) {
    try {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        // Cargar el archivo XML existente
        File inputFile = new File("ClientesXML.xml");

        if (inputFile.exists()) {
            Document documentoExistente = builder.parse(inputFile);
            NodeList clientes = documentoExistente.getElementsByTagName("Cliente");

            for (int i = 0; i < clientes.getLength(); i++) {
                Element cliente = (Element) clientes.item(i);
                String idCliente = cliente.getElementsByTagName("idCliente").item(0).getTextContent();

                if (idCliente.equals(clienteModificado.getIdCliente())) {
                    cliente.getElementsByTagName("nombre").item(0).setTextContent(clienteModificado.getNombre());
                    cliente.getElementsByTagName("apellidos").item(0).setTextContent(clienteModificado.getApellido());
                    cliente.getElementsByTagName("anio").item(0).setTextContent(String.valueOf(clienteModificado.getAnio()));

                    Transformer transformer = TransformerFactory.newInstance().newTransformer();
                    DOMSource source = new DOMSource(documentoExistente);
                    StreamResult result = new StreamResult(inputFile);
                    transformer.transform(source, result);

                    System.out.println("Cliente modificado con éxito.");
                    break; 
                }
            }
        } else {
            System.out.println("El archivo XML de clientes no existe.");
        }
    } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
        e.printStackTrace();
    }
}
    
    public void modificarJuegosEnXML(ArrayList<Juegos> listaJuegos, Juegos juegoModificado) {
    try {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        File inputFile = new File("JuegosXML.xml");

        if (inputFile.exists()) {
            Document documentoExistente = builder.parse(inputFile);
            NodeList juegos = documentoExistente.getElementsByTagName("Juego");

            for (int i = 0; i < juegos.getLength(); i++) {
                Element juego = (Element) juegos.item(i);
                String idJuego = juego.getElementsByTagName("idJuego").item(0).getTextContent();

                if (idJuego.equals(juegoModificado.getIdJuego())) {
                    juego.getElementsByTagName("nombre").item(0).setTextContent(juegoModificado.getNombre());
                    juego.getElementsByTagName("empresa").item(0).setTextContent(juegoModificado.getEmpresaDesarrollo());
                    juego.getElementsByTagName("pegi").item(0).setTextContent(String.valueOf(juegoModificado.getPegi()));

                    Transformer transformer = TransformerFactory.newInstance().newTransformer();
                    DOMSource source = new DOMSource(documentoExistente);
                    StreamResult result = new StreamResult(inputFile);
                    transformer.transform(source, result);

                    System.out.println("Juego modificado con éxito.");
                    break;
                }
            }
        } else {
            System.out.println("El archivo XML de juegos no existe.");
        }
    } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
        e.printStackTrace();
    }
}
    
    public static void main(String[] args) {
        Controlador controlador = new Controlador();

        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        ArrayList<Juegos> listaJuegos = new ArrayList<Juegos>();
        ArrayList<Disco> listaDiscos = new ArrayList<Disco>();
        ArrayList<Consola> listaConsola = new ArrayList<Consola>();

        String idClienteEliminar = "000"; 
        String idJuegoEliminar = "000";
        String idDiscoEliminar = "000";
        String idConsolaEliminar = "000";
        String idClienteModificar = "000"; 
        Cliente clienteModificado = new Cliente(idClienteModificar, "", "", 2000);
        String idJuegoModificar = "000";
        Juegos juegoModificado = new Juegos(idJuegoEliminar, idDiscoEliminar, idDiscoEliminar, 0);

        Cliente cliente1 = new Cliente("000", "Raúl", "Martín Ruiz", 1999);
        Cliente cliente2 = new Cliente("001", "Carlos", "Rodriguez", 1239);
        Juegos juego1 = new Juegos("01", "h", "f", 0);
        Juegos juego2 = new Juegos("02", "he", "d", 2);
        Disco disco1 = new Disco("d", 3);
        Consola consola1 = new Consola("fd", "dsf", "fg", 0);

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaJuegos.add(juego1);
        listaJuegos.add(juego2);
        listaDiscos.add(disco1);
        listaConsola.add(consola1);

        controlador.escribirClienteXML(listaClientes);
        controlador.leerClienteXML();
        controlador.eliminarClienteDelXML(listaClientes, idClienteEliminar);
        controlador.modificarClienteEnXML(listaClientes, clienteModificado);
        controlador.EscribirJuegosXML(listaJuegos);
        controlador.leerJuegoXML();
        controlador.eliminarJuegoDelXML(listaJuegos, idJuegoEliminar);
        controlador.modificarJuegosEnXML(listaJuegos, juegoModificado);
        controlador.EscribirDiscoXML(listaDiscos);
        controlador.leerDiscoXML();
        controlador.eliminarDiscoDelXML(listaDiscos, idDiscoEliminar);
        controlador.EscribirConsola(listaConsola);
        controlador.leerConsolaXML();
        controlador.eliminarConsolaDelXML(listaConsola, idConsolaEliminar);
        
        
    }
}
