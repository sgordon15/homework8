package edu.ti.caih313.homework8;
import java.util.Scanner;

public class handshake {
    public static void main (String []args){
        System.out.println("Enter number of people in the room: ");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        System.out.println(n + " people in the room= " + handshakeCounter(n) + " handshakes.");
    }
    public static int handshakeCounter(int n) {
        if (n==1) {
            return 0;
        }
        else if (n==2) {
            return 1;
        }
        else {
            return (n - 1) + handshakeCounter(n-1);
        }
    }
}