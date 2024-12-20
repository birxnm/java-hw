import java.util.ArrayList;
public class Gallery {
    private String name;
    private String location;
    private ArrayList<Artwork> artworks;

    public Gallery(String name, String location) {
        this.name = name;
        this.location = location;
        this.artworks = new ArrayList<>();
    }


    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }


    public void displayArtworks() {
        System.out.println("\nGallery: " + name + " [Location: " + location + "]");
        System.out.println("Artworks:");
        for (Artwork artwork : artworks) {
            System.out.println(artwork);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
