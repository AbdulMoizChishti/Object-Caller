/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectcaller;

/**
 *
 * @author Abdul Moiz Chishti
 */

class A{

    public  int count=0;
    public  A(){
    ++count;
        System.out.println(count);
    }

}


public class Objectcaller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        A obj1=new A();
        A obj2=new A();
        A obj3=new A();
    }
    
}
