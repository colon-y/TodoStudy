package com.example.TodoStudy.persistence;

import com.example.TodoStudy.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String>{
    // ?1은 메서드의 매개변수의 순서 위치다.
    @Query("select t from TodoEntity t where t.userId = ?1")
    List<TodoEntity> findByUserId(String userId);

    @Modifying
    @Query("select * from TodoEntity t")
    List<TodoEntity> selectByUserId(String userId);

    @Modifying
    @Query("update t TodoEntity t set t.userId = ?1")
    List<TodoEntity> updateByUserId(String userId);

    @Modifying
    @Query("delete t from TodoEntity t where t.userId = ?1")
    List<TodoEntity> deleteByUserId(String userId);
}
