package com.goodsinformation.goodsinformation.Controller;

import com.goodsinformation.goodsinformation.Dto.UrunDto;
import com.goodsinformation.goodsinformation.Entity.Urun;
import com.goodsinformation.goodsinformation.Service.UrunService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class UrunController {

    @Autowired
    private UrunService urunService;

   @GetMapping("/all")
    public ResponseEntity<List<Urun>> all (){
     List<Urun> list = urunService.all();
     return new ResponseEntity<>(list, HttpStatus.OK);
   }

   @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody @Valid UrunDto urun){
       urunService.save(urun);
       return new ResponseEntity<>("ürün kaydedildi",HttpStatus.CREATED);
   }
    @GetMapping("/id/{id}")
   public ResponseEntity<Urun> byid(@PathVariable @Valid Long id){
     Urun urun =  urunService.getbyıd(id);
     return new ResponseEntity<>(urun,HttpStatus.OK);
    }


    @PutMapping("/fiyat/{urunid}/{fiyat}")

    public ResponseEntity<Urun> fiyataguncelleme(@PathVariable Long urunid,@PathVariable double fiyat){
      Urun urun = urunService.fiyatGuncelleme(urunid,fiyat);

       return new ResponseEntity<>(urun,HttpStatus.OK);
    }

    @PutMapping("/stok/{stokid}/{urunid}")
    public ResponseEntity<Urun> stokGuncelleme(@PathVariable Long urunid,@PathVariable double stok){
       Urun urun = urunService.stokGuncelleme(urunid,stok);
       return new ResponseEntity<>(urun,HttpStatus.OK);
    }
}

