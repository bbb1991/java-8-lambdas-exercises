package com.insightfullogic.java8.exercises.chapter4;

import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.List;
import java.util.Optional;

public class Artists {

    private List<Artist> artists;

    public Artists(List<Artist> artists) {
        this.artists = artists;
    }

    public Artist getArtist(int index) {
        Optional<Artist> optional;
        if (index < 0 || index >= artists.size()) {
            optional = Optional.empty();
        } else {
            optional = Optional.of(artists.get(index));
        }

        if (!optional.isPresent()) {
            indexException(index);
        }
        return optional.get();
    }

    private void indexException(int index) {
        throw new IllegalArgumentException(index +
                                           " doesn't correspond to an Artist");
    }

    public String getArtistName(int index) {
        try {
            Artist artist = getArtist(index);
            return artist.getName();
        } catch (IllegalArgumentException e) {
            return "unknown";
        }
    }

}
