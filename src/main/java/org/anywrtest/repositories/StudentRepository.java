package org.anywrtest.repositories;

import org.anywrtest.entities.Student;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Long>, CrudRepository<Student, Long> {
    List<Student> getStudentByClassRoomName(String classRoomName, Pageable pageable);
}
