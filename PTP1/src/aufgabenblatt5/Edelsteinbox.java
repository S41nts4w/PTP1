package aufgabenblatt5;

enum Edelstein {
  RUBIN, DIAMANT, SMARAGD
}

public class Edelsteinbox {

  private int diamantAnzahl = 0;
  private int rubinAnzahl = 0;
  private int smaragdAnzahl = 0;
  private String umgewandelt = "";

  // Konstruktor

  public Edelsteinbox(Edelstein... sorte) {
    for (int i = 0; i < sorte.length; i++) {
      switch (sorte[i]) {
        case DIAMANT :
          diamantAnzahl++;
          break;
        case SMARAGD :
          smaragdAnzahl++;
          break;
        case RUBIN :
          rubinAnzahl++;
          break;
      }
    }
  }

  public void hineinlegen(Edelstein sorte, int anzahl) {
    switch (sorte) {
      case DIAMANT :
        diamantAnzahl += anzahl;
        break;
      case RUBIN :
        rubinAnzahl += anzahl;
        break;
      case SMARAGD :
        smaragdAnzahl += anzahl;
        break;
    }
  }

  public void herausnehmen(Edelstein sorte, int anzahl) {
    switch (sorte) {
      case DIAMANT :
        if (diamantAnzahl < anzahl) {
          diamantAnzahl -= anzahl;
        } else {
          diamantAnzahl = 0;
        }
        break;
      case RUBIN :
        if (rubinAnzahl < anzahl) {
          rubinAnzahl -= anzahl;
        } else {
          rubinAnzahl = 0;
        }
        break;
      case SMARAGD :
        if (smaragdAnzahl < anzahl) {
          smaragdAnzahl -= anzahl;
        } else {
          smaragdAnzahl = 0;
        }
        break;
    }
  }

  public void leeren() {
    diamantAnzahl = 0;
    rubinAnzahl = 0;
    smaragdAnzahl = 0;
  }

  public void umwandeln(Edelstein vonSorte, Edelstein zuSorte) {
    switch (vonSorte) {
      case DIAMANT :
        hineinlegen(zuSorte, diamantAnzahl);
        diamantAnzahl = 0;
        break;

      case RUBIN :
        hineinlegen(zuSorte, rubinAnzahl);
        rubinAnzahl = 0;
        break;

      case SMARAGD :
        hineinlegen(zuSorte, smaragdAnzahl);
        smaragdAnzahl = 0;
        break;
    }
  }

  public void ausgeben() {
    System.out.println(toString());
  }

  public String toString() {
    umgewandelt = "";
    for (int i = 1; i <= diamantAnzahl; i++) {
      umgewandelt += "D";
    }
    for (int i = 1; i <= rubinAnzahl; i++) {
      umgewandelt += "R";
    }
    for (int i = 1; i <= smaragdAnzahl; i++) {
      umgewandelt += "S";
    }
    return "(" + umgewandelt + ")";
  }

  public int getAnzahl(Edelstein sorte) {
    switch (sorte) {

      case DIAMANT :
        return diamantAnzahl;

      case RUBIN :
        return rubinAnzahl;

      case SMARAGD :
        return smaragdAnzahl;

      default :
        return 0;

    }

  }

}
