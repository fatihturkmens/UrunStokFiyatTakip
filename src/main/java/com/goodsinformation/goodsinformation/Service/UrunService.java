package com.goodsinformation.goodsinformation.Service;

import com.goodsinformation.goodsinformation.Dto.UrunDto;
import com.goodsinformation.goodsinformation.Entity.Urun;

import java.util.List;

public interface UrunService {
    public List<Urun> all();

    public Urun save(UrunDto urunDto);
    public Urun getbyıd(Long id);
    public Urun fiyatGuncelleme(Long id,double fiyat);
    public Urun stokGuncelleme(Long id,double stok);

   }
