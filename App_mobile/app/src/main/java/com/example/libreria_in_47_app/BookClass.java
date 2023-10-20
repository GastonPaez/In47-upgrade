package com.example.libreria_in_47_app;

public class BookClass {
    public static String COLUMN_ID = "id_libro";
    public static final String COLUMN_ISBN = "isbn";
    public static final String COLUMN_TITULO = "titulo";
    public static final String COLUMN_SUBTITULO = "subtitulo";
    public static final String COLUMN_DESCRIPCION = "descripcion";
    public static final String COLUMN_COMENTARIOS = "comentarios";
    public static final String COLUMN_AUTOR_ID = "autor_id_autor";
    public static final String COLUMN_IDIOMA_ID = "idioma_id_idioma";
    public static final String COLUMN_FORMATO_ID = "formato_id_formato";
    public static final String COLUMN_EDITORIAL_ID = "editorial_id_editorial";
    public static final String COLUMN_CATEGORIA_ID = "categoria_id_categoria";

    private int id;
    private String isbn;
    private String title;
    private String subtitle;
    private String description;
    private String comments;
    private int authorId;
    private long languageId;
    private long formatId;
    private long editorialId;
    private long categoryId;

    public BookClass(int id, String isbn, String title, String subtitle, String description, String comments, int authorId, int languageId, int formatId, int editorialId, int categoryId) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.comments = comments;
        this.authorId = authorId;
        this.languageId = languageId;
        this.formatId = formatId;
        this.editorialId = editorialId;
        this.categoryId = categoryId;
    }

    public long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return title;
    }

    public String getSubtitulo() {
        return subtitle;
    }

    public String getDescripcion() {
        return description;
    }

    public String getComentarios() {
        return comments;
    }

    public long getAutorId() {
        return authorId;
    }

    public long getIdiomaId() {
        return languageId;
    }

    public long getFormatoId() {
        return formatId;
    }

    public long getEditorialId() {
        return editorialId;
    }

    public long getCategoriaId() {
        return categoryId;
    }
}
