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
    
    void servizi(String IPAddress){
        try{
            int port = 53;
            Socket S = new Socket(IPAddress, port);
                        System.out.println("La porta DNS (" + port + ") dell'host " + IPAddress + " è aperta!");
        } catch(UnknownHostException e){
                        System.out.println("Host Sconosciuto!");
                    }
                    catch(ConnectException ee){
                        System.out.println("DNS: Errore nella connessione!");
                    }
                    catch(IOException eee){
                        System.out.println("Errore I/O!");
                    }
        try{
            int port = 67;
            Socket S = new Socket(IPAddress, port);
                        System.out.println("La porta DHCP (" + port + ") dell'host " + IPAddress + " è aperta!");
        } catch(UnknownHostException e){
                        System.out.println("Host Sconosciuto!");
                    }
                    catch(ConnectException ee){
                        System.out.println("DHCP: Errore nella connessione!");
                    }
                    catch(IOException eee){
                        System.out.println("Errore I/O!");
                    }
        try{
            int port = 143;
            Socket S = new Socket(IPAddress, port);
                        System.out.println("La porta IMAP (" + port + ") dell'host " + IPAddress + " è aperta!");
        } catch(UnknownHostException e){
                        System.out.println("Host Sconosciuto!");
                    }
                    catch(ConnectException ee){
                        System.out.println("IMAP: Errore nella connessione!");
                    }
                    catch(IOException eee){
                        System.out.println("Errore I/O!");
                    }
        try{
            int port = 1433;
            Socket S = new Socket(IPAddress, port);
                        System.out.println("La porta MySQL (" + port + ") dell'host " + IPAddress + " è aperta!");
        } catch(UnknownHostException e){
                        System.out.println("Host Sconosciuto!");
                    }
                    catch(ConnectException ee){
                        System.out.println("MySQL: Errore nella connessione!");
                    }
                    catch(IOException eee){
                        System.out.println("Errore I/O!");
                    }
        try{
            int port = 110;
            Socket S = new Socket(IPAddress, port);
                        System.out.println("La porta POP3 (" + port + ") dell'host " + IPAddress + " è aperta!");
        } catch(UnknownHostException e){
                        System.out.println("Host Sconosciuto!");
                    }
                    catch(ConnectException ee){
                        System.out.println("POP3: Errore nella connessione!");
                    }
                    catch(IOException eee){
                        System.out.println("Errore I/O!");
                    }
    }
}