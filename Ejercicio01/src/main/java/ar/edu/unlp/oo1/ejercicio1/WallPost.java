package ar.edu.unlp.oo1.ejercicio1;

public class WallPost {
	private String texto = "Undefined post";;
	private int cantLikes;
	private boolean destacado;

	// Retorna el texto descriptivo de la publicación
	String getText() {
		return texto;
	}

	// Setea el texto descriptivo de la publicación
	void setText(String texto) {
		this.texto = texto;
	};

	// Retorna la cantidad de “me gusta”
	int getLikes() {
		return cantLikes;
	};

	// Incrementa la cantidad de likes en uno
	void like() {
		cantLikes++;
	}

	// Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada
	void dislike() {
		if (cantLikes > 0) {
			cantLikes--;
		}
	}

	// Retorna true si el post está marcado como destacado, false en caso contrario
	boolean isFeatured() {
		return destacado;
	};

	// Cambia el post del estado destacado a no destacado y viceversa
	void toggleFeatured() {
        destacado = !destacado;
	};

	// Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	@Override
	public String toString() {
		return "WallPost {" +
			"text: " + getText() +
			", likes: '" + getLikes() + "'" +
			", featured: '" + isFeatured() + "'" + "}";
	}

}