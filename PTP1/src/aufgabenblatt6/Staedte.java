package aufgabenblatt6;

public enum Staedte {
	BERLIN, HAMBURG, MUENCHEN, KOELN, FRANKFURT, STUTTGART, DUESSELDORF, DORTMUND, ESSEN, BREMEN;

	  public static Staedte getZufallsStadt()
	  {
	    return values()[(int) (Math.random() * values().length)];
	  }
}
