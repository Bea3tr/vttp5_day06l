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

    public Product(long id, String name, String desc, String category) {
        this.id = id;
        this.name = name;
        this.description = desc;
        this.category = category;
    }

    @Override 
    public String toString() {
        return "Product -> [id: %d, name: %s, desc: %s, category: %s]".formatted(id, name, description, category);

        // csv format
        // return id + ", " + name + ", " + description + ", " + category;
    }

    public void print() {
        System.out.println(toString());
    }
}
