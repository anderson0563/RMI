/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIInterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author anderson
 */
public interface Operacoes extends Remote{
    public double Pi(Numero n) throws RemoteException;
    public int Fibonacci(Numero n) throws RemoteException;
}
