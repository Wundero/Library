import java.util.ArrayList;

public class ListComparator {
  public static Object bestMatch(String toMatch, ArrayList<Object> list) {
    ArrayList<Object> matches = matches(toMatch, list);
    if(matches.isEmpty()) {
      return null;
    }
    Object best = matches.get(0);
    int compared = Math.abs(toMatch.compareTo(best.toString()));
    boolean first = true;
    for(Object o : matches) {
      if(first) {
        first = false;
        continue;
      }
      String k = o.toString();
      int i = Math.abs(toMatch.compareTo(k));
      if(i < compared) {
        compared = i;
        best = o;
      }
    }
    return best;
  }
  public static ArrayList<Object> matches(String toMatch, ArrayList<Object> list) {
    ArrayList<Object> matches = new ArrayList<>();
    for(Object o : list) {
      String ts = o.toString();
      if(Math.abs(toMatch.compareTo(ts))<((int)toMatch.length()/3) {
        matches.add(o);
      }
    }
    return matches;
  }
}
