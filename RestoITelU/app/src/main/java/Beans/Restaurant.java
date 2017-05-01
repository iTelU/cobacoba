package Beans;

/**
 * Created by Jefri Jakhel on 25/04/2017.
 */

public class Restaurant {
    private int id;
    private String name;
    private String description;
    private int imageUrl; // kalau misal bukan url ganti dengan yang lain .. karena untuk contoh pakai drawable tipe data nya jadi int


    public Restaurant(int id, String name, String description, int imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}
