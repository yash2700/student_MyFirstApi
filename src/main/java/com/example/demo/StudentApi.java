package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class StudentApi {
    HashMap<Integer,Student> db=new HashMap<>();

    @PostMapping("/add_student")
    public String addStudent(@RequestBody() Student student){
        int key= student.admNo;;
        db.put(key,student);
        return "Student added successfully";
    }

    @GetMapping("/get_student_by_admNo")
    public Student getStudentByAdmNo(@RequestParam("admNo") Integer admNo){
        return db.get(admNo);
    }
    @GetMapping("/get_student_by_name")
    public Student getStudentByName(@RequestParam("name")String name){
        for(Student s:db.values()){
            if(s.name.equals(name)){
                return s;
            }
        }
        return null;
    }
    @GetMapping("/get_all_students")
    public List<Student> getAllStudents(@RequestParam("all") String some){
        List<Student> res=new ArrayList<Student>();
        for(Student s:db.values()){
            res.add(s);
        }
        return res;
    }

    @PostMapping("/update_student")
    public String updateStudent(@RequestBody()Student st){
        int key=st.admNo;
        db.put(key,st);
        return "Student updates successfully";
    }
    @DeleteMapping("/delete_student")
    public String deleteStudent(@RequestParam("admNo") Integer admNo){
        db.remove(admNo);
        return "Student removed successfuly";
    }

}
