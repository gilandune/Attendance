package presentation.common.entities;

public class Catalogo {
	public Integer id; public String displayString;
	public Catalogo(Integer id)                       { this(id, null); }
	public Catalogo(String  displayString)            { this(null, displayString); }
	public Catalogo(Integer id, String displayString) { this.id = id; this.displayString = displayString; }
    @Override public String toString() { return displayString; }
    @Override public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Catalogo choice = (Catalogo) o;
      return displayString != null && displayString.equals(choice.displayString) || id != null && id.equals(choice.id);
    }
    @Override public int hashCode() {
      int result = id != null ? id.hashCode() : 0;
      result = 31 * result + (displayString != null ? displayString.hashCode() : 0);
      return result;
    }
}
