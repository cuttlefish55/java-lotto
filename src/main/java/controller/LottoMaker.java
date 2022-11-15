package controller;

import camp.nextstep.edu.missionutils.Randoms;
import data.ExceptionData;
import data.NumericData;
import lotto.Lotto;
import java.util.List;
import java.util.ArrayList;
import data.InputGuideData;

public class LottoMaker {
    // 로또 가격을 NumericData 에서 받아옴
    private static final int LOTTO_PRICE = NumericData.LOTTO_PRICE.getNumericValue();
    private static final int ZERO = 0;
    private int money;
    private void validate(int money){
        if(money % LOTTO_PRICE != ZERO){
            ExceptionData.NOT_DIVIDED.callErrorMessage();
            throw new IllegalArgumentException();
        }
    }

    public LottoMaker(String money) throws IllegalArgumentException {
        try {
            this.money = Integer.parseInt(money);
            validate(this.money);
            System.out.print(this.money / LOTTO_PRICE);
            InputGuideData.BUY_LOTTO.printData();
        }
        catch (Exception e){
            ExceptionData.NOT_INTEGER.callErrorMessage();
        }
    }

    /**
     * 로또를 발행하는 메서드
     * @return 발행된 메서드 리턴
     */
    public List<Lotto> publishLotto(){
        int amount = money / LOTTO_PRICE;
        List<Lotto> lottos = new ArrayList<>();

        for(int lotto = 0; lotto < amount; lotto ++ ){
            lottos.add(new Lotto(Randoms.pickUniqueNumbersInRange(1,45,6)));
        }
        return lottos;
    }
}
