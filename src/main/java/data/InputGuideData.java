package data;

public enum InputGuideData {
    INPUT_MONEY("구입금액을 입력해 주세요."),
    BUY_LOTTO("개를 구매했습니다."),
    INPUT_NUMBER("당첨 번호를 입력해 주세요."),
    INPUT_BONUS("보너스 번호를 입력해 주세요.");


    private String printData;

    InputGuideData(String printData){
        this.printData = printData;
    }

    public static void printData(String label){
        String enumField;
        for(InputGuideData dataField : InputGuideData.values()){
            enumField = dataField.toString();
            if(enumField.equals(label)){
                System.out.println(dataField.printData);
            }
        }
    }
}