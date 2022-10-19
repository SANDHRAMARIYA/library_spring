package com.nestdigital.library_manag.Controller;

import com.nestdigital.library_manag.Dao.LibraryDao;
import com.nestdigital.library_manag.Model.LibraryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {
    @Autowired
    private LibraryDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addlibrary",consumes = "application/json",produces = "application/json")
    public String addlibrary(@RequestBody LibraryModel library){
        System.out.println(library.toString());
        dao.save(library);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewlibrary")
    public List<LibraryModel> viewlibrary()
    {
        return  (List<LibraryModel>) dao.findAll();
    }
}
