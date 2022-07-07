package com.song.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Song {
    private int id;
    private String nome, artista, album, anoLancamento;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (id != song.id) return false;
        if (!nome.equals(song.nome)) return false;
        if (!artista.equals(song.artista)) return false;
        if (!album.equals(song.album)) return false;
        return anoLancamento.equals(song.anoLancamento);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nome.hashCode();
        result = 31 * result + artista.hashCode();
        result = 31 * result + album.hashCode();
        result = 31 * result + anoLancamento.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", album='" + album + '\'' +
                ", anoLancamento='" + anoLancamento + '\'' +
                '}';
    }
}