package aufgabenblatt5;

public class TestEdelsteinbox {

  public static void main(String[] args) {
    Edelsteinbox box = new Edelsteinbox();

    box.hineinlegen(Edelstein.DIAMANT, 2);
    box.hineinlegen(Edelstein.SMARAGD, 3);
    
    box.umwandeln(Edelstein.DIAMANT, Edelstein.RUBIN);

    box.ausgeben();
    
    box.leeren();
    
    box.ausgeben();
    
    Edelsteinbox box2 = new Edelsteinbox(Edelstein.SMARAGD, Edelstein.RUBIN, Edelstein.RUBIN, Edelstein.DIAMANT);

    box2.hineinlegen(Edelstein.DIAMANT, 5);
    box2.hineinlegen(Edelstein.SMARAGD, 2);
    
    box2.umwandeln(Edelstein.DIAMANT, Edelstein.RUBIN);

    box2.ausgeben();
    
    box2.ausgeben();
    
    box.ausgeben();
  }

}
