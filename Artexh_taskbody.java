public class Artexh_taskbody {
    public static void main(String[] args) {
        Artexhibiton_management obj = new Artexhibiton_management();
        System.out.println("\n --- Gallery №1---");
        obj.setArtwork("\n Name of the artwork:Turksib");
        obj.setArtist("\n Name of the Artist:Abilkhan Kasteyev ");
        obj.setGallery("\n Name of the Gallery:Kasteyev Museum-Gallery");
        System.out.println(obj.getArtwork()+" "+obj.getArtist()+" "+obj.getGallery());

        Artexhibiton_management obj2 = new Artexhibiton_management();
        System.out.println("\n --- Gallery №2---");
        obj2.setArtwork("\n Name of the artwork:Mona Lisa");
        obj2.setArtist("\n Name of the Artist:Leanardo Da Vinci");
        obj2.setGallery("\n Name of the Gallery:Louvre Gallery of Paris");

        System.out.println(obj2.getArtwork()+" "+obj2.getArtist()+" "+obj2.getGallery());
        if (obj.getArtwork().equalsIgnoreCase(obj2.getArtwork())) {
            System.out.println("\n The artworks are the same: " + obj.getArtwork());
        } else {
            System.out.println("\n The artworks are different.");
        }
    }
}
