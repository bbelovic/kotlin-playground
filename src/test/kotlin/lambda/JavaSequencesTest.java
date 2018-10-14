package lambda;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class JavaSequencesTest {
    @Test
    void test_java_stream() {
        Stream.of("1", "2", "3")
                .map( s -> {
                    System.out.println("map("+ s +") ");
                    return Integer.parseInt(s);
                } )
                .map( i -> {
                    System.out.println("map("+ i +") ");
                    return i * i;
                })
                .filter(ii -> {
                    System.out.println("filter("+ ii +") ");
                    return ii > 5;
                })
                .collect(Collectors.toList());
    }
}
