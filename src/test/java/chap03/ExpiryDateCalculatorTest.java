package chap03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 서비스 만료일 계산기 테스트
 *
 * - 서비스를 사용하려면 매달 1만 원을 선불로 납부한다.
 *   납부일을 기준으로 한 달 뒤가 서비스 만료일이 된다.
 * - 2개월 이상 요금을 납부할 수 있다.
 * - 10만 원을 납부하면 서비스를 1년 제공한다.
 */
class ExpiryDateCalculatorTest {

    @Test
    void 만원_납부하면_한달_뒤가_만료일이_됨() {
        LocalDate billingDate = LocalDate.of(2019, 3, 1);
        int payAmount = 10_000;

        ExpiryDateCalculator cal = new ExpiryDateCalculator();
        LocalDate expiryDate = cal.calculateExpiryDate(billingDate, payAmount);

        assertEquals(LocalDate.of(2019, 4, 1), expiryDate);

    }
}