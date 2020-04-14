public class Lista {
  
  private String nome;
  private Lista prox;
  
  public Lista() {
  }
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public Lista getProx() {
    return prox;
  }
  
  public void setProx(Lista prox) {
    this.prox = prox;
  }
}
