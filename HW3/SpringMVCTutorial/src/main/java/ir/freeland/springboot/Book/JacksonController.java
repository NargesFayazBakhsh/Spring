package ir.freeland.springboot.Book;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping()
public class JacksonController {
	
    private static Logger log = LoggerFactory.getLogger(JacksonController.class);
    

    @Autowired
	Library library;
           
    @GetMapping("/get/books")
    @ResponseBody
    public Library postController() {
    	log.debug(library.toString());
        return library;
    }
    
    
    @GetMapping("get/books/bookinfo")
    @ResponseBody
    public String get(HttpServletRequest request) {
    	String title = request.getParameter("title");
    	String publisher = request.getParameter("publisher");
    	return library.findBookInfo(title,publisher);
    }
    
    
    @GetMapping("/get/book/{id}")
    @ResponseBody
    public String getBooksId(@PathVariable final long id) {
    	String book1 = library.findBook(id);
    	return book1;
    }

    @GetMapping("delete/book/{id}")
    @ResponseBody
    public ResponseEntity<HttpStatus> deleteController(@PathVariable final long id) {
    	library.deletBook(id);
    	log.debug(library.toString());
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping("/put/book/{id}")
    public ResponseEntity<HttpStatus> putController(@RequestBody Book book ,@PathVariable final long id) {
    	book.setId(id);
    	library.putBook(book);
        log.debug(book.toString());
        return ResponseEntity.ok(HttpStatus.OK);
    }
    
    @PostMapping("/book/create")
    public ResponseEntity<HttpStatus> postController(@RequestBody Book book) {
    	library.addBook(book);
        log.debug(book.toString());
        return ResponseEntity.ok(HttpStatus.OK);
    }

}