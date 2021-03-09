import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <h2>Почта</h2>
 * Имеется n пользователей, каждому из них соответствует список email-ов
 * (всего у всех пользователей m email-ов).<p>
 * <p>
 * Считается, что если у двух пользователей есть общий email, значит это
 * один и тот же пользователь. Требуется построить и реализовать алгоритм,
 * выполняющий слияние пользователей. На выходе должен быть список
 * пользователей с их email-ами (такой же как на входе).
 *
 * <li> В качестве имени объединенного пользователя можно брать любое из
 * исходных имен.
 * <li> Список email-ов пользователя должен содержать только уникальные email-ы.
 * <li> Параметры n и m произвольные, длина конкретного списка email-ов никак
 * не ограничена.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.03.2021
 */
public class Accounts {
    /**
     * Метод слияния пользователей.
     *
     * @param account Список пользователей с их email-ами.
     * @return Список пользователей с их email-ами.
     */
    public static Map<String, Set<String>> merge(Map<String, Set<String>> account) {
        Map<String, Set<String>> in = new HashMap<>(account);
        Map<String, Set<String>> out = new HashMap<>();
        for (Map.Entry<String, Set<String>> inElement: in.entrySet()) {
            String key = inElement.getKey();
            if (out.isEmpty()) {
                out.put(key, inElement.getValue());
                continue;
            }
            for (Map.Entry<String, Set<String>> outElement: out.entrySet()) {
                Set<String> set = new HashSet<>();
                set.addAll(inElement.getValue());
                set.addAll(outElement.getValue());
                int fullSize = outElement.getValue().size()
                        + inElement.getValue().size();
                if (fullSize != set.size()) {
                    inElement.setValue(set);
                    key = outElement.getKey();
                }
                out.put(key, inElement.getValue());
            }
        }
        return out;
    }
}
