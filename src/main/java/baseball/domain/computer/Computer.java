package baseball.domain.computer;

import baseball.domain.number.BaseballNumbers;
import baseball.domain.number.BaseballNumbersGenerator;

public class Computer {
    private BaseballNumbers baseballNumbers;

    private Computer(BaseballNumbers baseballNumbers) {
        this.baseballNumbers = baseballNumbers;
    }

    public static Computer createBy(BaseballNumbersGenerator baseballNumbersGenerator) {
        BaseballNumbers baseballNumbers = BaseballNumbers.from(baseballNumbersGenerator.generate());
        return new Computer(baseballNumbers);
    }

    public BaseballNumbers getBaseballNumbers() {
        return baseballNumbers;
    }
}
