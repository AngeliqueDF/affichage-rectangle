public class AffichageRectangle {
    public static void main(String[] args) {
        int largeur, hauteur = 0;
        System.out.println("Entrez la largeur du rectangle");
        largeur = Terminal.lireInt();
        System.out.println("Entrez la hauteur du rectangle");
        hauteur = Terminal.lireInt();

        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
