package com.devsuperior.dsmove.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_score")
public class Score {
    @EmbeddedId
    private ScorePk id = new ScorePk();

    private Double value;

    public  Score(){

    }



    public void setMovie(Movie mv) {
        id.setMovie(mv);
    }

    public void setUser(User mv) {
        id.setUser(mv);
    }

    public ScorePk getId() {
        return id;
    }

    public void setId(ScorePk id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}

