public class ArtExhibition {
    public static void main(String[] args) {
        Artist artist1 = new Artist("Abilkhan Kasteyev", "Kazakhstan");
        Artist artist2 = new Artist("Leonardo da Vinci", "Italy");

        Artwork artwork1 = new Artwork("Turksib", artist1, 50000);
        Artwork artwork2 = new Artwork("Mona Lisa", artist2, 85000000);


        Gallery gallery1 = new Gallery("Kasteyev Museum-Gallery", "Kazakhstan");
        Gallery gallery2 = new Gallery("Louvre Gallery", "Paris, France");


        gallery1.addArtwork(artwork1);
        gallery2.addArtwork(artwork2);

        gallery1.displayArtworks();
        gallery2.displayArtworks();

      
        if (artwork1.getTitle().equalsIgnoreCase(artwork2.getTitle())) {
            System.out.println("\nThe artworks are the same: " + artwork1.getTitle());
        } else {
            System.out.println("\nThe artworks are different.");
        }
    }
}
