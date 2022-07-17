package homework;

public class CardLost extends Lost {
    private String cardId;//一卡通卡号

    public CardLost(String kind, String place, String time, String cardId) {
        super(kind, place, time);
        this.cardId = cardId;
    }

    public String getCardId() {
        return cardId;
    }


    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "一卡通号码:" + cardId + " 失物地点:" + super.getPlace() + "  丢失时间:" + super.getTime();
    }

}

```
