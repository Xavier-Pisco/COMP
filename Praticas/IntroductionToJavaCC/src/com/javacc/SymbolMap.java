import java.util.HashMap;
import java.util.Map;

public class SymbolMap {
    private static Map<String, Integer> symbols = new HashMap<>();
    public static void set(String symbol, Integer value) {
        symbols.put(symbol, value);
    }
    public static int get(String symbol) {
        return symbols.get(symbol);
    }
}
