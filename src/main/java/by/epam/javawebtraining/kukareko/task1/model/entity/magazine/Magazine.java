package by.epam.javawebtraining.kukareko.task1.model.entity.magazine;

import by.epam.javawebtraining.kukareko.task1.model.entity.Publication;
import by.epam.javawebtraining.kukareko.task1.model.entity.album.Album;

/**
 * @author Yulya Kukareko
 * @version 1.0 15 Feb 2019
 */
public class Magazine extends Publication {

    private int countAriticles;

    public Magazine() {
        countAriticles = 1;
    }

    public Magazine(int pageCount, String name, int font, String publishing, int countAriticles,
                    int circulation, long id) {
        super(pageCount, name, font, publishing, circulation, id);
        this.countAriticles = countAriticles;
    }

    public int getCountAriticles() {
        return countAriticles;
    }

    public void setCountAriticles(int countAriticles) {
        this.countAriticles = countAriticles;
    }

    @Override
    public String toString() {
        return "countArticles = " + this.countAriticles + ", " + super.toString();
    }
}
