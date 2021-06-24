package vn.techmaster.parsejson.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.techmaster.parsejson.model.Person;
import vn.techmaster.parsejson.repository.PersonRepository;

@RestController
@RequestMapping("/")
public class PersonController {
  @Autowired
  private PersonRepository personRepo;
  List<Person> persons = personRepo.getAllPeople();

  @GetMapping("people")
  public ResponseEntity<List<Person>> getAllPeople() {
    return ResponseEntity.ok().body(personRepo.getAllPeople());
  }

  @GetMapping("groupbycity")
  public ResponseEntity<List<Person>> groupBycity() {
    return null;
  }

  @GetMapping("groupbycitythencount")
  public ResponseEntity<List<Person>> groupbycitythencount() {
    return null;
  }

  @GetMapping("groupbyjobthencount")
  public ResponseEntity<List<Person>> groupbyjobthencount() {
    return null;
  }

  @GetMapping("fivetopjobs")
  public ResponseEntity<List<Person>> fivetopjobs() {
    return null;
  }

  @GetMapping("fivetoppopcites")
  public ResponseEntity<List<Person>> fivetoppopcites() {
    return null;
  }

  @GetMapping("topjobcity")
  public ResponseEntity<List<Person>> topjobcity() {
    return null;
  }

  @GetMapping("averagesalary")
  public ResponseEntity<List<Person>> averagesalary() {
    return null;
  }

  @GetMapping("5citiestopsalary")
  public ResponseEntity<List<Person>> fivecitiestopsalary() {
    return null;
  }

  @GetMapping("5citiestopdevsalary")
  public ResponseEntity<List<Person>> fivecitiestopdevsalary() {
    return null;
  }

  @GetMapping("averageaogeperjob")
  public ResponseEntity<List<Person>> averageaogeperjob() {
    return null;
  }

  @GetMapping("maxagepercity")
  public ResponseEntity<List<Person>> maxagepercity() {
    return null;
  }

  @GetMapping("malefemalertio")
  public ResponseEntity<List<Person>> maleFemaleRatio() {
    long a = persons.stream().filter(gender -> gender.equals("Male")).count();
    return null;
  }
}
