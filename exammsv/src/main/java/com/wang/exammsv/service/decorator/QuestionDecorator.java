package com.wang.exammsv.service.decorator;

import com.wang.exammsv.domain.Question;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class QuestionDecorator {
    protected Question question;
}
