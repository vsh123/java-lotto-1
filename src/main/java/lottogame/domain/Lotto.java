package lottogame.domain;

import java.util.List;

public class Lotto {
    private List<LottoNumber> lotto;

    Lotto(List<LottoNumber> lotto) {
        this.lotto = lotto;
    }

    Rank getMatchResult(WinningLotto winningLotto) {
        int numberOfMatch = (int) lotto.stream()
                .filter(winningLotto::isContain)
                .count();
        boolean bonusBallMatch = lotto.stream()
                .anyMatch(winningLotto::isBonusBallMatch);
        return Rank.valueOf(numberOfMatch, bonusBallMatch);
    }

    boolean contains(LottoNumber lottoNumber) {
        return lotto.contains(lottoNumber);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (LottoNumber lottoNumber : lotto) {
            stringBuilder.append(lottoNumber).append(", ");
        }
        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(" "));
        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
