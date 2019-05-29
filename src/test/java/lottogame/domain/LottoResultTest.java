package lottogame.domain;

import lottogame.utils.LottoNumbersParser;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoResultTest {
    @Test
    void 당첨_결과를_알려주는_클래스_구현() {
        PurchaseLotto purchaseLotto = new PurchaseLotto(10000);
        WinningLotto winningLotto = new WinningLotto(LottoNumbersParser.parse("1,2,3,4,5,6"));
        assertThat(new LottoResultGenerator().create(purchaseLotto,winningLotto)).isExactlyInstanceOf(LottoResult.class);
    }
}
