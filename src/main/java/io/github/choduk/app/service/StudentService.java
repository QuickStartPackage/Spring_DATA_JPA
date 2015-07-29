package io.github.choduk.app.service;

import io.github.choduk.app.domain.Student;
import io.github.choduk.app.dto.params.StudentRegistParam;
import io.github.choduk.app.dto.response.StudentResult;
import io.github.choduk.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author choduk88@gmail.com
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Transactional
    public Long addStudent(StudentRegistParam param) {

        Student student = convertStudent(param);

        studentRepository.save(student);

        return student.getId();
    }

    public StudentResult getStudent(Long studentId) {
        Student user = studentRepository.findOne(studentId);

        return new StudentResult(user);
    }

    @Transactional
    public void replaceStudent(Long studentId, StudentRegistParam replaceParam) {
        Student user = studentRepository.findOne(studentId);
        user.setName(replaceParam.getName());
        user.setMajor(replaceParam.getMajor());
    }


    @Transactional
    public void deleteStudent(long studentId) {
        studentRepository.delete(studentId);
    }


    private Student convertStudent(StudentRegistParam registParam) {

        Student student = new Student();
        student.setName(registParam.getName());
        student.setMajor(registParam.getMajor());

        return student;
    }
}