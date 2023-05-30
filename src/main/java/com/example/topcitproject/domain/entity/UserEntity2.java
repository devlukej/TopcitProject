package com.example.topcitproject.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "topcit2")
public class UserEntity2 {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(length = 2, nullable = false)
    private String type;

    @Column(length = 100, nullable = false)
    private String text;

    @Column(length = 100)
    private String text_pic;

    @Column(length = 100, nullable = false)
    public String answer;

    @Column(length = 100, nullable = false)
    public String answer_1w;

    @Column(length = 100, nullable = false)
    public String answer_2w;

    @Column(length = 100, nullable = false)
    public String answer_3w;

    @Column(length = 100, nullable = false)
    public String answer_4w;

    @Column(length = 20, nullable = false)
    private String point;

    @Column(length = 20, nullable = false)
    private String label;

    @Column(length = 20, nullable = false)
    private String count;

    @Column(length = 20, nullable = false)
    private String wrong;

    @Column(length = 20, nullable = false)
    private String avg;

    @Builder
    public UserEntity2(Long id, String text, String text_pic, String answer, String answer_1w, String answer_2w
            , String answer_3w, String answer_4w, String avg, String label, String type, String wrong, String count
            , String point) {
        this.id = id;
        this.text = text;
        this.text_pic = text_pic;
        this.answer = answer;
        this.answer_1w = answer_1w;
        this.answer_2w = answer_2w;
        this.answer_3w = answer_3w;
        this.answer_4w = answer_4w;
        this.avg = avg;
        this.label = label;
        this.type = type;
        this. wrong = wrong;
        this.count = count;
        this.point = point;
    }

}
