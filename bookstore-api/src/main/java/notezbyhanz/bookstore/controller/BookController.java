package notezbyhanz.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Hanz on 6/21/2017.
 */
@RestController
@RequestMapping("book")
public class BookController
{

    @RequestMapping(value = "message", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> findAnimal( )
    {
        return new ResponseEntity<String>("Welcome to bookstore", HttpStatus.OK);
    }

}
