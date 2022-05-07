public class CarEnt {
    private int id;
    private String name;
    private long year;
    private long price;
    public int getId() {
        return id;
    }
    public CarEnt setId(int id) {
        this.id = id;
        return this;
    }
    public String getName() {
        return name;
    }
    public CarEnt setName(String name) {
        this.name = name;
        return this;
    }
    public long getYear() {
        return year;
    }
    public CarEnt setYear(long year) {
        this.year = year;
        return this;
    }
    public long getPrice() {
        return price;
    }
    public CarEnt setPrice(long price) {
        this.price = price;
        return this;
    }
}
