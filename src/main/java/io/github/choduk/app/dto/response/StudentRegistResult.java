package io.github.choduk.app.dto.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author choduk88@gmail.com
 */
@Getter
@Setter
@ToString
public class StudentRegistResult {

    Long id;

    public StudentRegistResult(Long id){
        this.id = id;
    }
}
