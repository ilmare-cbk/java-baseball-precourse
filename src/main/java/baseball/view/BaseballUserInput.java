package baseball.view;

import baseball.contant.BaseballConstant;
import baseball.contant.BaseballMessage;
import baseball.contant.ExceptionMessage;
import baseball.domain.number.BaseballNumber;
import baseball.domain.number.BaseballNumbers;
import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class BaseballUserInput {

    public BaseballNumbers getUserNumbers() {
        System.out.print(BaseballMessage.INPUT_USER_NUMBERS);
        String userNumbers = Console.readLine();
        validateUserNumbers(userNumbers);
        return convertStringToBaseballNumbers(userNumbers);
    }

    private void validateUserNumbers(String userNumbers) {
        if (!userNumbers.matches(BaseballConstant.INPUT_USER_NUMBERS_REG_EXP)) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_INPUT);
        }

        HashSet<String> splitUserNumbers = new HashSet<>(Arrays.asList(userNumbers.split("")));
        if (splitUserNumbers.size() != BaseballConstant.BASEBALL_NUMBERS_SIZE) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_INPUT);
        }
    }

    private BaseballNumbers convertStringToBaseballNumbers(String userNumbers) {
        String[] splitUserNumbers = userNumbers.split("");
        List<BaseballNumber> baseballNumbers = new ArrayList<>();
        for (String userNumber : splitUserNumbers) {
            baseballNumbers.add(BaseballNumber.from(Integer.parseInt(userNumber)));
        }
        return BaseballNumbers.from(baseballNumbers);
    }

    public boolean getContinue() {
        String continueStr = Console.readLine();
        validateContinue(continueStr);
        int continueInt = Integer.parseInt(continueStr);
        if (continueInt == BaseballConstant.CONTINUE) {
            return true;
        }
        if (continueInt == BaseballConstant.END) {
            return false;
        }
        throw new IllegalArgumentException(ExceptionMessage.INVALID_INPUT);
    }

    private void validateContinue(String continueStr) {
        if (!continueStr.matches(BaseballConstant.INPUT_CONTINUE_REG_EXP)) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_INPUT);
        }
    }
}
