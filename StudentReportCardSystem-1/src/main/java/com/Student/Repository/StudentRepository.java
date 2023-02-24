package com.Student.Repository;

import java.util.Optional;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.Student.Model.Student;




@Repository
public interface StudentRepository extends ElasticsearchRepository<Student, String>{



}
