package com.goodsinformation.goodsinformation.Dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UrunDto {

    @NotNull(message = "ürün marka ismi boş geçilemez")
    @Size(min = 3,max = 25)
    private String name;

    @NotNull(message = "ürün modeli boş geçilemez")
    @Size(min = 3,max = 25)
    private String model;

    @NotNull(message = "ürün fiyatı boş geçilemez")
   // @Size(min = 3,max = 25)
    private double price;

    @NotNull(message = "ürün stok bilgisi boş geçilemez")
    //@Size(min = 3,max = 25)
    private double stok;

}
