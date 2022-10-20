package com.nestdigital.library_manag.Dao;

import com.nestdigital.library_manag.Model.LibraryModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibraryDao extends CrudRepository <LibraryModel,Integer> {

    @Modifying
    @Query(value = "DELETE FROM `libraries` WHERE `id`=:id",nativeQuery = true)
void deleteBookById(Integer id);

    @Query(value = "SELECT `id`, `authorname`, `bookname`, `booktype`, `issuedate` FROM `libraries` WHERE `issuedate`=:issuedate",nativeQuery = true)
    List<LibraryModel> searchlibrary(String issuedate);
}




