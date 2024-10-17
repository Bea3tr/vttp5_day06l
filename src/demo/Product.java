package demo;

public class Product {

    private long id;
    private String name;
    private String description;
    private String category;

    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}
    public String getCategory() {return category;}
    public void setCategory(String category) {this.category = category;}

    public Product() {}

    @Override 
    public String toString() {
        return "Product details: [id: %d, name: %s, desc: %s, category: %s]".formatted(id, name, description, category);
    }

}
