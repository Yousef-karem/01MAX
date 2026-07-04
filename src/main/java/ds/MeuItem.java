package ds;
public class MeuItem implements Item {
  public int chave;
  private Animal animal;
  // outros componentes do registro
 
  public MeuItem (int chave, Animal animal) { this.chave = chave; this.animal = animal; } 
  
  public int compara (Item it) {
    MeuItem item = (MeuItem) it;
    if (this.chave < item.chave) {
      this.animal.makeSound();
      return 1;
    }
    else if (this.chave > item.chave) {return -1;}
    return 0;
  }

  public boolean checkIfAnimalIsCat() {
    if (this.animal.name.equals("cat")) {
      return true;
    }
    return false;
  }
}
