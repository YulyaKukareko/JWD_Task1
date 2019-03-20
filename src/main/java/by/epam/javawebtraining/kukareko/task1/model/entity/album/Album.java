package by.epam.javawebtraining.kukareko.task1.model.entity.album;

import by.epam.javawebtraining.kukareko.task1.model.entity.Publication;
import by.epam.javawebtraining.kukareko.task1.model.entity.constants.PublicationConstants;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Yulya Kukareko
 * @version 1.0 15 Feb 2019
 */
public class Album extends Publication implements Serializable {

    private static final String DEFAULT_FORMAT = "Horizontal";

    private String format;

    public Album() {
        this.format = DEFAULT_FORMAT;
    }

    public Album(long id, int pageCount, String name, int font, String publishing,
                 int circulation, int rating, String format) {
        super(id, pageCount, name, font, publishing, circulation, rating);
        this.format = checkNullString(format, DEFAULT_FORMAT);
    }

    public Album(Album album) {
        super(album);
        this.format = album.format;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Album album = (Album) o;
        return Objects.equals(format, album.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), format);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + PublicationConstants.FORMAT + " = " + format + ", " + super.toString();
    }
}

