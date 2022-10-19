package com.nestdigital.library_manag.Dao;

import com.nestdigital.library_manag.Model.LibraryModel;
import org.springframework.data.repository.CrudRepository;

public interface LibraryDao extends CrudRepository <LibraryModel,Integer> {
}
