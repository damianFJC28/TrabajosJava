package trabajos;

 class Vehiculo {

     Vehiculo(String modelo, String marca, String tamaño, String color) {
         this.modelo = modelo;
         this.marca = marca;
         this.tamaño = tamaño;
         this.color = color;
     }

     private String modelo;
     private String marca;
     private String tamaño;
     private String color;

     public String getModelo() {
         return modelo;
     }

     public void setModelo(String modelo) {
         this.modelo = modelo;
     }

     public String getMarca() {
         return marca;
     }

     public void setMarca(String marca) {
         this.marca = marca;
     }

     public String getTamaño() {
         return tamaño;
     }

     public void setTamaño(String tamaño) {
         this.tamaño = tamaño;
     }

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }
 }
