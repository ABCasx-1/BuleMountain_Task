```java
package homework;


public class Lost {
    private String kind;//失物类别
    private String place;//物品丢失地点
    private String time;//丢失时间

    public Lost(String kind, String place, String time) {
        this.kind = kind;
        this.place = place;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Lost{" +
                "kind='" + kind + '\'' +
                ", place='" + place + '\'' +
                ", time=" + time +
                '}';
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
```