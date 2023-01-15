package LmsBackend.example.LmsBackend.Controllers;
import LmsBackend.example.LmsBackend.RequestDto.AuthorRequesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import LmsBackend.example.LmsBackend.Service.AuthorService;
import LmsBackend.example.LmsBackend.ResponseDto.AuthorResponseDto;
import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
@Autowired
AuthorService authorService;
@PostMapping("/create_author")
  public String createAuthor(@RequestBody() AuthorRequesDto authorRequesDto ){
  return authorService.createAuthor(authorRequesDto);
}
@GetMapping("/find_by/{name}")
 public List<AuthorResponseDto> findByName(@PathVariable("name") String name){
 return authorService.findAuthorByName(name);
 }

}
