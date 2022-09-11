package leetcode.easy.single_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SingleNumberTest {
    SingleNumber sut = new SingleNumber();

    @Test
    void test1() {
        assertThat(sut.singleNumber(new int[]{4, 1, 2, 1, 2})).isEqualTo(4);
    }

    @Test
    void test2() {
        assertThat(sut.singleNumber2(new int[]{4, 1, 2, 1, 2})).isEqualTo(4);
    }
}