package com.example.topcitproject.dto;


import com.example.topcitproject.domain.entity.UserEntity;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String text;
    private String text_pic;
    private String answer;
    private String answer_1w;
    private String answer_2w;
    private String answer_3w;
    private String answer_4w;
    private String avg;
    private String label;
    private String type;
    private String wrong;
    private String count;
    private String point;


    public UserEntity toEntity() {
        return UserEntity.builder()
                .id(id)
                .text(text)
                .text_pic(text_pic)
                .answer(answer)
                .answer_1w(answer_1w)
                .answer_2w(answer_2w)
                .answer_3w(answer_3w)
                .answer_4w(answer_4w)
                .avg(avg)
                .label(label)
                .type(type)
                .wrong(wrong)
                .count(count)
                .point(point)
                .build();
    }

    @Builder
    public UserDto(Long id, String text, String text_pic, String answer, String answer_1w, String answer_2w
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
