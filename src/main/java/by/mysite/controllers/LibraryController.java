package by.mysite.controllers;

import by.mysite.model.entities.Library;
import by.mysite.model.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LibraryController {
    private LibraryRepository libraryRepository;

    @Autowired
    public void setLibraryRepository(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @GetMapping
    public String getAll(Model model) {
        //в Model хранятся (здесь) список страниц
        //за его создание отвечает Spring, не мы
        List<Library> libraries = libraryRepository.findAll();
        model.addAttribute("libraries", libraries);
        return "index";
    }
}
