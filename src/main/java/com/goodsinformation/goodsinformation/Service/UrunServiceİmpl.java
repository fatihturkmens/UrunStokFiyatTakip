package com.goodsinformation.goodsinformation.Service;

import com.goodsinformation.goodsinformation.Dto.UrunDto;
import com.goodsinformation.goodsinformation.Entity.Urun;
import com.goodsinformation.goodsinformation.Repository.UrunRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UrunServiceİmpl implements UrunService {


    @Autowired
    private UrunRepository urunRepository;


    private Urun dtoorurun(Urun urun, UrunDto urunDto) {   // dto urune çevirme
        urun.setName(urunDto.getName());
        urun.setModel(urunDto.getModel());
        urun.setPrice(urunDto.getPrice());
        urun.setStok(urunDto.getStok());

        return urunRepository.save(urun);
    }

    public List<Urun> all() {            // tüm ürünler
        return urunRepository.findAll();
    }


    public Urun save(UrunDto urunDto) {
        return dtoorurun(new Urun(), urunDto);   // ürün kaydetme
    }


    public Urun getbyıd(Long id) {   // id ile ürün bulma
        Optional<Urun> urun = urunRepository.findById(id);

        if (urun.isPresent()) {
            return urun.get();
        } else {
            throw new EntityNotFoundException("ürün bulunamadı");
        }
    }

    public Urun fiyatGuncelleme(Long id, double price) {
        Optional<Urun> urun = urunRepository.findById(id);
        if (urun.isPresent()) {
            Urun urun1 = urun.get();
            urun1.setPrice(price);
            urunRepository.save(urun1);
            return urun1;
        } else {
            return null;
        }

    }


    public Urun stokGuncelleme(Long id, double stok) {
        Optional<Urun> urun = urunRepository.findById(id);
        if (urun.isPresent()) {
            Urun urun1 = urun.get();
            urun1.setStok(stok);
            return urun1;

        } else {
            return null;
        }
    }



}
