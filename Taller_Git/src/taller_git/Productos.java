/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_git;

/**
 *
 * @author lisafbe
 */
public class Productos {


String codigoProducto,nombre,imagen,empresaFab,descripcionT,dtipo,dancho,dLargo,dColor,dMaterial;
Integer precioUnitario,uDisponibles;

double pIva,pDescuento;
 

  
public Productos(String codigoProducto,String nombre,String imagen,String empresaFab,String DescripcionT,
    Integer precioUnitario,double pIva,Integer uDisponibles,String dtipo,String dancho,
    String dLargo,String dColor,String dMaterial,double pDescuento ){

    this.codigoProducto=codigoProducto;
    this. nombre=nombre;
    this.imagen=imagen;
    this.empresaFab=empresaFab;
    this.descripcionT=DescripcionT;
    this.precioUnitario=precioUnitario;
    this.pIva=pIva;
    this.uDisponibles=uDisponibles;
    this.dtipo=dtipo;
    this.dancho=dancho;
    this.dLargo=dLargo;
    this.dColor=dColor;
    this.dMaterial=dMaterial;
     
    this.pDescuento=pDescuento;
   

}
 

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    } 
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
    
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    } 
    
    
    public String getEmpresaFab() {
        return empresaFab;
    }

    public void setEmpresaFab(String empresaFab) {
        this.empresaFab = empresaFab;
    } 
    
    public String getDescripcionT() {
        return descripcionT;
    }

    public void setDescripcionT(String descripcionT) {
        this.descripcionT = descripcionT;
    } 
    
    
    public Integer getPrecioU() {
        return precioUnitario;
    }

    public void setPrecioU(Integer precioUnitario) {
        this.precioUnitario = precioUnitario;
    } 
    
  
   
    public double getPIva() {
        return pIva;
    }

    public void setPIva(double pIva) {
        this.pIva = pIva;
    } 
    
     
    public Integer getuDisponibles() {
        return uDisponibles;
    }
 
    public void setuDisponibles(Integer uDispobibles) {
        this.uDisponibles = uDispobibles;
    } 
    
   
    public String getTipo() {
        return dtipo;
    }

    public void setTipo(String dtipo) {
        this.dtipo = dtipo;
    } 
    
    
    public String getAncho() {
        return dancho;
    }

    public void setAncho(String dancho) {
        this.dancho = dancho;
    } 
    
    
    public String getLargo() {
        return dLargo;
    }

    public void setLargo(String dLargo) {
        this.dLargo = dLargo;
    } 
     
    public String getColor() {
        return dColor;
    }

    public void setColor(String dColor) {
        this.dColor = dColor;
    } 
    
     
    public String getMaterial() {
        return dMaterial;
    }

    public void setMaterial(String dMaterial) {
        this.dMaterial = dMaterial;
    } 
    
     
     
    public double  getDescuento() {
        return pDescuento;
    }

    public void setDescuento(double pDescuento) {
        this.pDescuento = pDescuento;
    } 
     
    
    
    
    
    
}   

