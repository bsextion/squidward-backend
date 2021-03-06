package com.squidward.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Null;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="user_story")
@Getter @Setter @ToString
public class UserStory implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="us_id")
    private int id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="uss_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private UserStoryStatus status;

    @ManyToOne(fetch=FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name="sprint_id")
    private Sprint sprint;

    @Column(name="story")
    private String story;

    @Column(name="difficulty")
    private int difficulty;

    @Column(name="done_tag")
    private String doneTag;

    @Column(name="start_tag")
    private String startTag;

    @Null
    @Temporal(TemporalType.DATE)
    @Column(name="start_date")
    private Date startDate;

    @Null
    @Temporal(TemporalType.DATE)
    @Column(name="done_date")
    private Date doneDate;

    @Null
    @Column(name="start_url")
    private String startUrl;

    @Null
    @Column(name="done_url")
    private String doneUrl;
}
