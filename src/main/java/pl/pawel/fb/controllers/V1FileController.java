package pl.pawel.fb.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(V1FileController.API_PATH)
@RequiredArgsConstructor
@RestController
public class V1FileController {

  public static final String API_PATH = "/api/v1/files";

  @GetMapping
  public String getFile(){
    return "ok";
  }
}
