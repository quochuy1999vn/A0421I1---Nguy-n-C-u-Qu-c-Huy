package io_BinaryFile_and_Serialization.bai_tap.product_manager_saves_to_binary_files;

public class Products {
    private int id;
    private String name;
    private String manufacturer;
    private String price;
    private String descriptions;

    public Products() {
    }

    public Products(int id, String name, String manufacturer, String price, String descriptions) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.descriptions = descriptions;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPrice() {
        return price;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price='" + price + '\'' +
                ", descriptions='" + descriptions + '\'' +
                '}';
    }
}
