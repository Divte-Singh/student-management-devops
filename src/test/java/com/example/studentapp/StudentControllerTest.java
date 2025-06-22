package com.example.studentapp;

import com.example.studentapp.model.Student;
import com.example.studentapp.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class StudentControllerTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void testAddAndFetchStudent() {
        Student s = new Student();
        s.setName("Test Name");
        s.setEmail("test@example.com");

        Student saved = studentRepository.save(s);
        assertThat(saved.getId()).isNotNull();
        assertThat(saved.getName()).isEqualTo("Test Name");
    }
}
