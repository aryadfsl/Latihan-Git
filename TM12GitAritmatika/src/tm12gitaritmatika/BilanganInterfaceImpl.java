/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tm12gitaritmatika;

/**
 *
 * @author ASUS
 */
public class BilanganInterfaceImpl implements BilanganInterface{
    
    @Override
    public double add(Bilangan bilangan){
        return bilangan.getBilangan1() + bilangan.getBilangan2();
    }
    
    @Override
    public double sub(Bilangan bilangan){
        throw new UnsupportedOperationException("Not supported yet");
    }
    
    @Override
    public double mult(Bilangan bilangan){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public double div(Bilangan bilangan){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
