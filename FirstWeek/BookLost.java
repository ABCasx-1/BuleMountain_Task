package homework;

public class BookLost extends Lost {
    private String bookName;//书名

    public BookLost(String kind, String place, String time, String bookName) {
        super(kind, place, time);
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {

        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "失物名称:" + bookName + " 失物地点:" + super.getPlace() + "  丢失时间:" + super.getTime();
    }
}
```
