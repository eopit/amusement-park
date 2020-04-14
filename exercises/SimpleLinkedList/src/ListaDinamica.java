public class ListaDinamica {
  int tamanhoLista = 0;
  private Lista primeiro;
  private Lista ultimo;
  
  public ListaDinamica() {
    primeiro = null;
    ultimo = primeiro;
  }
  
  public void add(String nome) {
    if (primeiro == null) {
      primeiro = new Lista();
      ultimo = primeiro;
      Lista novo = new Lista();
      novo.setNome(nome);
      novo.setProx(null);
      ultimo.setProx(novo);
      ultimo = novo;
      tamanhoLista++;
    } else {
      Lista novo = new Lista();
      novo.setNome(nome);
      novo.setProx(null);
      ultimo.setProx(novo);
      ultimo = novo;
      tamanhoLista++;
    }
  }
  
  
  public void imprimeLista() {
    Lista percorre = primeiro.getProx();
    while (percorre != null) {
      System.err.println(percorre.getNome());
      percorre = percorre.getProx();
    }
  }
}
