/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpudp;
import java.net.*;
import java.io.*;
/**
 *
 * @author Andrea
 */
public class ClientUDP {
    int port;
    InetAddress address;
    DatagramSocket socket ;
    DatagramPacket packet;
    byte[] buffer = new byte[256];
    public ClientUDP(InetAddress address) {
        this.address = address;
        try{
        socket = new DatagramSocket();
        } catch(SocketException e){
            System.out.println("Socket Error!");
        }
    }
    
    void invia(){
        try{
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length, 
                                address, 4445);
            socket.send(packet);
        } catch(IOException ee){
            System.out.println("I/O Error!");
        }
    }
}
