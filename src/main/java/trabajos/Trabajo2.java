package trabajos;
// crear un objeto de tipo vehiculo con 4 atributos
// y un constructor que me cree el objeto con los valores de los atributos

public class Trabajo2 {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("UEZ24", "HIUNDAY","mediano","azul");
        System.out.println(vehiculo.getModelo() +" - "+ vehiculo.getMarca() +" - "+ vehiculo.getTamaño() +" - "+ vehiculo.getColor());




    }
}
