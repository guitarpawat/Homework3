import java.util.List;

/**
 * Class that contains some recursion methods for remove duplicates objects in the List.
 * @author Pawat Nakpiphatkul
 * @version 1.0
 * @since Apr 5, 2017
 */
public class Recursion {
/**
 * Remove duplicate consecutive items from a list, changing the list parameter.
 * For example, if list = { a, b, b, b, c, b, c, c} then after calling uniqueAll the list
 * will contain {a, b, c}.
 * Objects are compared using their own equals method.
 * @param list of any kind of object. The elements are not null.
 * @return reference to the list parameter with duplicates removed.
 */
    public static List uniqueAll(List list) {
        if(list.isEmpty()) return list;
        Object current = list.get(0);
        while(list.contains(current)) {
            list.remove(current);
        }
        list.add(0, current);
        return uniqueAll(list.subList(1,list.size()));
    }
    
     /**
     * Remove duplicate consecutive items from a list, changing the list parameter.
     * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique the list
     * will contain {a, b, c, b, c}. Only consecutive duplicates are removed.
     * Objects are compared using their own equals method.
     * @param list of any kind of object. The elements are not null.
     * @return reference to the list parameter with consecutive duplicates removed.
     */
    public static List unique(List list) {
        if(list.size() <= 1) return list;
        if(list.get(0).equals(list.get(1))) {
            list.remove(0);
            return unique(list);
        }
        return unique(list.subList(1,list.size()));
    }
}
