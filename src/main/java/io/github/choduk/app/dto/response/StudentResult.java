package io.github.choduk.app.dto.response;

import io.github.choduk.app.domain.Student;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author choduk88@gmail.com
 */
@Getter
@Setter
@ToString
public class StudentResult {

    Student student;

    public StudentResult(Student params){
        student = params;
    }
}
