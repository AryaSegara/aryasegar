package com.kuis11.aryasegara.Services;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.kuis11.aryasegara.Models.Barista;

@Service
public class BaristaService {
    public List <Barista> getAllBarista(){
        List<Barista> barista = new ArrayList<>();
        barista.add(new Barista(1, "Arya", "Pekanbaru"));
        barista.add(new Barista(2, "Hanif", "Cilacap"));
        barista.add(new Barista(3, "Tisa", "Banjar"));
        barista.add(new Barista(4, "Cupit", "KBB"));
        return barista;
    }   
}
