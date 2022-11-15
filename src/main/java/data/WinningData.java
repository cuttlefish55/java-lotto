package data;

import java.util.ArrayList;
import java.util.List;

public class WinningData {
    private boolean isHavingBonus;
    private int winningCount;


    public WinningData(int winningCount, boolean isHavingBonus) {
        this.isHavingBonus = false;
        this.winningCount = 0;
    }

    public void plusBonusNumberCount(){
        winningCount++;
    }

    public void checkBonusNumber(){
        isHavingBonus = true;
    }

    public boolean getIsHavingBonus(){
        return isHavingBonus;
    }

    public int getBonusNumberCount(){
        return winningCount;
    }
}
