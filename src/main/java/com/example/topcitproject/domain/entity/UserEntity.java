package com.example.topcitproject.domain.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "topcit")
public class UserEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(length = 2, nullable = false)
    private String type;

    @Column(length = 100, nullable = false)
    private String text;

    @Column(length = 100)
    private String text_pic;

    @Column(length = 20, nullable = false)
    private String answer;

    @Column(length = 20, nullable = false)
    private String answer_1w;

    @Column(length = 20, nullable = false)
    private String answer_2w;

    @Column(length = 20, nullable = false)
    private String answer_3w;

    @Column(length = 20, nullable = false)
    private String answer_4w;

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


}
