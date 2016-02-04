/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author Keith
 */
public class Thread1 extends Thread {

    static int y;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {



for (int x = 1; x<=10000 ;x++){

y++;
Thread1 t = new Thread1();

t.start();
 
}


}
public void run(){


System.out.println("Thread No: " + y);


}

}

   

