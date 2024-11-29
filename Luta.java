class Luta{
  private Lutador desafiado;
  private Lutador desafiante;
  private int rounds;
  private boolean aprovada;
  

  public void marcarLuta(Lutador l1, Lutador l2){ 
    if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
      this.aprovada = true;
      this.desafiado = l1;
      this.desafiante = l2; 
    }else{
      this.aprovada = false;
      this.desafiado = null;
      this.desafiante = null;
    }
  }
  public void lutar(){
    if(aprovada = true){
      desafiado.apresentar();
      desafiante.apresentar();
    }
    if(desafiado.getPeso() > desafiante.getPeso() && desafiado.getAltura() > desafiante.getAltura()){
      System.out.println("O vencedor é o " + desafiado.getNome() + "!!!!");
      desafiado.ganharLuta();
      desafiante.perderLuta();
    }else if(desafiado.getPeso() < desafiante.getPeso() && desafiado.getAltura() < desafiante.getAltura()){
      System.out.println("O vencedor é o " + desafiante.getNome() + "!!!!");
      desafiante.ganharLuta();
      desafiado.perderLuta();
    }else if(desafiado.getPeso() == desafiante.getPeso() && desafiado.getAltura() == desafiante.getAltura()){
      System.out.println("Empate entre os competidores!!");
      desafiado.empatarLuta();
      desafiante.empatarLuta();
    }else if(desafiado.getPeso() > desafiante.getPeso() && desafiado.getAltura() < desafiante.getAltura()){
      System.out.println("Empate entre os competidores!!");
      desafiado.empatarLuta();
      desafiante.empatarLuta();
    }else{
      System.out.println("Empate entre os competidores!!");
      desafiado.empatarLuta();
      desafiante.empatarLuta();
    }
  }

  public void setDesafiado(Lutador dd){
    dd = desafiado;
  }
  public Lutador getDesafiado(){
    return desafiado;
  }

}
