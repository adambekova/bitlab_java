package HomeWork;

public class Product {
    String name;
   int count;
    int price;
    String category;

    public Product (){
        name="no name";
        count=0;
        price=0;
        category="no category";
    }
    public Product(String name, int count, int price, String category){
        this.name=name;
        this.count=count;
        this.price=price;
        this.category=category;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
