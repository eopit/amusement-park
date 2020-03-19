public class ContaCorrente extends Conta {

  public ContaCorrente(int agencia, int numero) {
    super(agencia, numero);
  }

  @Override
  public boolean saca(double valor) {
    return super.saca(valor + 0.2); // A regra eh se for conta corrente, eh cobrado 20 centavos por saque.
  }
}
