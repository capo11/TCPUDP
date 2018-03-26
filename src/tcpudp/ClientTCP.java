/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpudp;
import java.io.*;
import java.net.*;
/**
 *
 * @author Andrea
 */
public class ClientTCP {

    public ClientTCP() {
    }
    
    void controllaPorta(String IPAddress, int port){
        try{
                        Socket S = new Socket(IPAddress, port);
                        System.out.println("La porta " + port + " dell'host " + IPAddress + " è aperta!");
                    } catch(UnknownHostException e){
                        System.out.println("Host Sconosciuto!");
                    }
                    catch(ConnectException ee){
                        System.out.println("Errore nella connessione!");
                    }
                    catch(IOException eee){
                        System.out.println("Errore I/O!");
                    }
    }
    void intervalloPorte(String IPAddress, int port1, int port2){
        for(int i=port1;i<port2;i++){
            try{
                        Socket S = new Socket(IPAddress, i);
                        System.out.println("La porta " + i + " dell'host " + IPAddress + " è aperta!");
                    } catch(UnknownHostException e){
                        System.out.println("Host Sconosciuto!");
                    }
                    catch(ConnectException ee){
                        System.out.println("Errore nella connessione!");
                    }
                    catch(IOException eee){
                        System.out.println("Errore I/O!");
                    }
        }
    }
}