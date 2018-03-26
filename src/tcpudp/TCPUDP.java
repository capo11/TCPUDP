/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpudp;
import java.util.*;
import java.io.*;
import java.net.*;
/**
 *
 * @author Andrea
 */
public class TCPUDP {
    public static void main(String[] args) {
        ClientTCP tcp = new ClientTCP();
        int esci=0;
        Scanner input = new Scanner(System.in);
        while(esci==0){
            System.out.println("Menu:");
            System.out.println("1) Controlla una porta:");
            System.out.println("2) Controlla un intervallo di porte:");
            System.out.println("3) Controlla i servizi attivi:");
            System.out.println("0) Esci:");
            int scelta = input.nextInt();
            switch(scelta){
                case 1:
                    System.out.println("Inserisci l'indirizzo ip dell'host:");
                    String IPAddress = input.next();
                    System.out.println("Inserisci la porta dell'host:");
                    int port = input.nextInt();
                    tcp.controllaPorta(IPAddress, port);
                    break;
                case 2:
                    System.out.println("Inserisci l'indirizzo ip dell'host:");
                    IPAddress = input.next();
                    System.out.println("Inserisci la prima porta dell'intervallo:");
                    int port1 = input.nextInt();
                    System.out.println("Inserisci l'ultima porta dell'intervallo:");
                    int port2 = input.nextInt();
                    tcp.intervalloPorte(IPAddress, port1, port2);
                    break;
                case 3:
                    System.out.println("Inserisci l'indirizzo ip dell'host:");
                    IPAddress = input.next();
                    tcp.servizi(IPAddress);
                    break;
                case 0:
                    esci=1;
                    break;
            }
        }
    }
}
