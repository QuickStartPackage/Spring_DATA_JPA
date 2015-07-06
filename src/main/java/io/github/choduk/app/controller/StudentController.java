package io.github.choduk.app.controller;

import io.github.choduk.app.dto.params.StudentRegistParam;
import io.github.choduk.app.dto.response.StudentRegistResult;
import io.github.choduk.app.dto.response.StudentResult;
import io.github.choduk.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author choduk88@gmail.com
 */
@RestController
@RequestMapping("/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student", method= RequestMethod.POST)
    public StudentRegistResult create(@RequestBody StudentRegistParam registParam){

        System.out.println("params = " + registParam);

        Long id = studentService.addStudent(registParam);

        return new StudentRegistResult(id);
    }

    @RequestMapping(value = "/student/{studentId}", method = RequestMethod.GET)
    public StudentResult read(@PathVariable("studentId") String studentId){

        System.out.println("studentId = [" + studentId + "]");

        Long id = Long.parseLong(studentId);

        return studentService.getStudent(id);
    }

    @RequestMapping(value = "/student/{studentId}", method = RequestMethod.PUT)
    public String update(@PathVariable(value = "studentId") String studentId,
                           @RequestBody StudentRegistParam replaceParam){

        System.out.println("studentId = [" + studentId + "]");
        System.out.println("replaceParam = [" + replaceParam + "]");

        studentService.replaceStudent(Long.parseLong(studentId), replaceParam);

        return "success";
    }

    @RequestMapping(value = "/student/{studentId}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "studentId") String studentId){

        System.out.println("id = [" + studentId + "]");

        studentService.deleteStudent(Long.parseLong(studentId));

        return "success";
    }
}

