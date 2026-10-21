public class Empleado {
    private String nombre;
    private String dni;
    private double salario;

    public Empleado(String nombre, String dni,double salario) {
        this.nombre = nombre;
        this.dni = dni;

        if(salario >= 0){
            this.salario = salario;
        }else {
            this.salario = 0;
        }
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void actualizarSalario(double porcentajeAumento){

        if(porcentajeAumento > 0){
            salario = salario + porcentajeAumento;
        }else{
            System.out.println("el aumento debe ser mayor a 0.");
        }

    }

    public void mostrar(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Dni: "+ dni);

    }

}
