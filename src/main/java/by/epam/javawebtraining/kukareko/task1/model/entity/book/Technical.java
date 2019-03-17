package by.epam.javawebtraining.kukareko.task1.model.entity.book;

import by.epam.javawebtraining.kukareko.task1.model.entity.constants.PublicationConstants;

import java.util.Objects;

/**
 * @author Yulya Kukareko
 * @version 1.0 15 Feb 2019
 */
public class Technical extends Book {

    private String subjectArea;
    private String level;

    public Technical() {
    }

    public Technical(long id, int pageCount, String name, int font, String publishing,
                     int circulation, int rating, String author, String subjectArea, String level) {
        super(id, pageCount, name, font, publishing, circulation, rating, author);
        this.subjectArea = checkNullString(subjectArea);
        this.level = checkNullString(level);
    }

    public String getSubjectArea() {
        return subjectArea;
    }

    public String getLevel() {
        return level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Technical technical = (Technical) o;
        return Objects.equals(subjectArea, technical.subjectArea) &&
                Objects.equals(level, technical.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subjectArea, level);
    }

    @Override
    public String toString() {
        return " " + PublicationConstants.SUBJECT_AREA + " = " + subjectArea +
                ", " + PublicationConstants.LEVEL + " = " + level + ", " + super.toString();
    }
}
