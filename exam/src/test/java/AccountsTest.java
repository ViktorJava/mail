import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Тесты метода, слияния юзеров.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 06.03.2021
 */
public class AccountsTest {

    @Test
    public void whenEmailEqualThenMerge() {
        Map<String, Set<String>> input = new HashMap<>();
        input.put("user1", Set.of("foo@gmail.com", "boo@gmail.com"));
        input.put("user2", Set.of("foo@gmail.com", "boo@gmail.com", "zoo@gmail.com"));
        Map<String, Set<String>> out = new HashMap<>();
        out.put("user1", Set.of("foo@gmail.com", "boo@gmail.com", "zoo@gmail.com"));
        assertThat(Accounts.merge(input), is(out));
    }

    @Test
    public void whenNoKey() {
        Map<String, Set<String>> input = new HashMap<>();
        input.put("user1", Set.of("foo@gmail.com", "hoo@gmail.com", "zoo@gmail.com"));
        input.put("user2", Set.of("foo@gmail.com", "hoo@gmail.com", "zoo@gmail.com"));
        Map<String, Set<String>> out = Accounts.merge(input);
        assertThat(out.get("user2"), nullValue());
    }
}
