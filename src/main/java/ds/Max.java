package ds;
public class Max { 
  public static Item max (Item v[], int n) { 
    MeuItem max = (MeuItem) v[0];
    for (int i = 1; i < n; i++) if (max.checkIfAnimalIsCat()) max = (MeuItem) v[i];
    return max;
  }
}
