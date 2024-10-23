package com.kuis11.aryasegara.Controllers;

import com.kuis11.aryasegara.Models.Barista;
import com.kuis11.aryasegara.Services.BaristaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaristaController {

  @Autowired
  BaristaService baristaService;

  @GetMapping("/barista")
  public String listBarista(Model model) {
    List<Barista> barista = baristaService.getAllBarista();
    model.addAttribute("barista", barista);
    return "barista";
  }
}
