package com.goodsinformation.goodsinformation.Repository;

import com.goodsinformation.goodsinformation.Entity.Urun;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UrunRepository extends JpaRepository<Urun,Long> {


}
