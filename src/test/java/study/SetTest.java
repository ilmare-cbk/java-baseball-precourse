package study;

import java.util.HashSet;
import java.util.Set;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("Set의 size() 메소드를 활용해 Set의 크기를 확인")
    void sizeTest() {
        Assertions.assertThat(numbers.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("Set의 contains() 메소드를 활용해 1,2,3의 값이 존재하는지 확인")
    void containsTest1() {
        Assertions.assertThat(numbers.contains(1)).isTrue();
        Assertions.assertThat(numbers.contains(2)).isTrue();
        Assertions.assertThat(numbers.contains(3)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    @DisplayName("Set의 contains() 메소드를 활용해 1,2,3의 값이 존재하는지 확인 - ParameterizedTest를 활용해 중복 코드 제거")
    void containsTest2(int input) {
        Assertions.assertThat(numbers.contains(input)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    @DisplayName("Set의 contains() 메소드를 활용해 Set이 입력값을 포함하면 true, 포함하지 않으면 false가 반환되는지 확인")
    void containsTest3(int input, boolean expected) {
        Assertions.assertThat(numbers.contains(input)).isEqualTo(expected);
    }
}