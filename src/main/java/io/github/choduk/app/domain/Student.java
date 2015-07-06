package io.github.choduk.app.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author choduk88@gmail.com
 */
@Getter
@Setter
@Entity
@Table(name="STUDENT")
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    @Column(name="STUDENT_ID")
    Long id;

    @Column(name="NAME")
    String name;

    @Column(name="MAJOR")
    String major;
}
