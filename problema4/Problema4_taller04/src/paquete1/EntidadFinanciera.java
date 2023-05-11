package paquete1;

public class EntidadFinanciera {
    private Cliente cliente;
    private Banco banco;
    private double valorCheque;
    private double comisionBanco;
    
    public EntidadFinanciera(){
        cliente = new Cliente();
        banco = new Banco();
        valorCheque = 1000.50;
    }
    
    public EntidadFinanciera(Cliente clint, Banco ban, double valCheq){
        cliente = clint;
        banco = ban;
        valorCheque = valCheq;
    }
    
    public void establecerCliente(Cliente x){
        cliente = x;
    }
    
    public void establecerBanco(Banco x){
        banco = x;
    }
    
    public void establecerValorCheque(double x){
        valorCheque = x;
    }
    
    public void calcularComisionBanco(){
        comisionBanco = valorCheque*0.00003;
    }
    
    public Cliente obtenerCliente(){
        return cliente;
    }
    
    public Banco obtenerBanco(){
        return banco;
    }
    
    public double obtenerValorCheque(){
        return valorCheque;
    }
    
    public double obtenerComisionBancoo(){
        return comisionBanco;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("""
                                      Comision del cliente %s %s:
                                      Nombre del Banco: %s
                                      N\u00famero de Sucursales: %d
                                      Valor del Cheque: %.2f
                                      Comision del Banco: %.2f
                                      -------------------------------
                                      """,
                cliente.obtenerNombres(),cliente.obtenerApellidos(),
                banco.obtenerNombreBanco(),
                banco.obtenerNumeroSucursales(),valorCheque,
                comisionBanco);
        return cadena;
    }
    
}
