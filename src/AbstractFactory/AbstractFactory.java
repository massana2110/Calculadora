/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractFactory.Operaciones.Operacion;

/**
 *
 * @author uca
 */
public interface AbstractFactory {
    Operacion getOPeracion(int num1, int num2);
}
