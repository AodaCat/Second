package cc.adcat.jdbcTemplateDemo;

public class Book {
    private Integer bid;
    private String bname;
    private Double price;
    private String author;

    public Book() {
    }

    public Book(Integer bid, String bname, Double price, String author) {
        this.bid = bid;
        this.bname = bname;
        this.price = price;
        this.author = author;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
