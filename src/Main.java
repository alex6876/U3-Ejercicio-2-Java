public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Alex", "48.446.446", 2500);

        empleado.actualizarSalario(5000);
        empleado.mostrar();
        System.out.println("Salario: "+ empleado.getSalario());
    }
}