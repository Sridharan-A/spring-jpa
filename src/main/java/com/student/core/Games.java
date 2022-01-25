package com.student.core;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "GAMES")
public class Games implements Serializable   {
    @Id()
    @Column(name = "GAMEID")
    private Integer gameId;
    @Column(name = "GAMENAME")
    private String gameName;
    @Column(name = "STUDENTID")
    private BigInteger studentid;

    public Games() {
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public BigInteger getStudentid() {
        return studentid;
    }

    public void setStudentid(BigInteger studentid) {
        this.studentid = studentid;
    }

    @Override
    public String toString() {
        return "Games{" +
                "gameId=" + gameId +
                ", gameName='" + gameName + '\'' +
                ", studentid=" + studentid +

                '}';
    }
}
